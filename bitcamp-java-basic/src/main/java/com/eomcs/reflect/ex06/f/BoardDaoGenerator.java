package com.eomcs.reflect.ex06.f;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import com.eomcs.mybatis.ex13.BoardDao;

public class BoardDaoGenerator implements FactoryBean<BoardDao>{
  @Autowired SqlSessionFactory sqlSessionFactory;

  @Override
  public BoardDao getObject() throws Exception {
    return (BoardDao) Proxy.newProxyInstance(this.getClass().getClassLoader(),
        new Class[] {BoardDao.class},
        new InvocationHandler() {
      @Override
      public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Class<?> interfaceType = proxy.getClass().getInterfaces()[0];
        String namespace = interfaceType.getName();
        String sqlId = method.getName();

        System.out.println(namespace + "." + sqlId);
        return null;
      }

    });
  }

  @Override
  public Class<?> getObjectType() {
    // TODO Auto-generated method stub
    return null;
  }
}
