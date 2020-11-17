package com.eomcs.util;

import java.sql.Connection;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.TransactionIsolationLevel;

// 역할
// - sqlSessionFactory 구현체의 일을 대리한다.
// - 이런 객체를 프록시라고 한다.
// - 프록시는 반드시 원래 객체와 같은 인터페이스를 구현해야 한다.
public class SqlSessionFactoryProxy implements SqlSessionFactory {
  SqlSessionFactory original;
  boolean inTransaction = false; // 트랜젝션 시작 여부
  SqlSessionProxy currentSqlSession;

  public SqlSessionFactoryProxy(SqlSessionFactory original) {
    // 생성자에서 원래의 구현체를 받아 보관해둔다.
    this.original = original;
  }

  //기존에 없던 메서드 추가
  public void startTransaction() {
    inTransaction = true;
  }

  //트랜젝션이 성공하든 실패하든 종료될 때는
  //반드시 트랜젝션 상태를 초기화 시킨다.
  public void endTransaction() {
    inTransaction = false;

    // 이전에 commit()/rollback()을 호출하여 트랜젝션을 종료한 상태라면
    // 다음 작업을 수행할 필요가 없다.
    if(currentSqlSession != null) {
      // 트랜젝션을 종료할 떄 진짜 SqlSession객체를 닫는다.
      currentSqlSession.realClose();

      // 트랜젝션 작업을 종료한 후에는 SqlSession객체를 종료한다.
      currentSqlSession = null;
    }
  }

  @Override
  public SqlSession openSession() {
    if(inTransaction) {
      if(currentSqlSession == null) {
        //트랜젝션이 시작 중일때는 수동 커밋 상태의 SqlSession을 만든다.
        // 나중에 다시 쓸 수 있도록 보관해 둔다.
        currentSqlSession = new SqlSessionProxy(original.openSession());
      }
      //기존에 만든 sqlSession을 리턴해준다.
      //왜?
      //같은 SqlSession을 리턴해 줘야 여러 작업을 한 트랜젝션으로 묶을 수 있다.
      return currentSqlSession;
    } else {
      //트랜젝션이 시작중이 아닐때는 자동 커밋 상태의 SqlSession을 리턴한다.
      //따로 보관해두지는 않는다.
      return original.openSession(true);
    }
  }

  public void commit() {
    //같은 SqlSession을 사용하여 수행한 모든 작업을 커밋한다.
    if(inTransaction) {
      currentSqlSession.commit();
    }
    endTransaction();
  }

  public void rollback() {
    //같은 SqlSession을 사용하여 수행한 모든 작업을 롤백한다.
    if(inTransaction) {
      currentSqlSession.rollback();
    }
    endTransaction();
  }

  @Override
  public SqlSession openSession(boolean autoCommit) {
    return original.openSession(autoCommit);
  }

  @Override
  public SqlSession openSession(Connection connection) {
    return original.openSession(connection);
  }

  @Override
  public SqlSession openSession(TransactionIsolationLevel level) {
    return original.openSession(level);
  }

  @Override
  public SqlSession openSession(ExecutorType execType) {
    return original.openSession(execType);
  }

  @Override
  public SqlSession openSession(ExecutorType execType, boolean autoCommit) {
    return original.openSession(execType, autoCommit);
  }

  @Override
  public SqlSession openSession(ExecutorType execType, TransactionIsolationLevel level) {
    return original.openSession(execType, level);
  }

  @Override
  public SqlSession openSession(ExecutorType execType, Connection connection) {
    return original.openSession(execType, connection);
  }

  @Override
  public Configuration getConfiguration() {
    return original.getConfiguration();
  }
}
