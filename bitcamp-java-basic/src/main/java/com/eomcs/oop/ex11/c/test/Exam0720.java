package com.eomcs.oop.ex11.c.test;

import java.util.ArrayList;
import java.util.List;

public class Exam0720 {
  public static void main(String[] args) {
    final Musics2 m1 = new Musics2();
    m1.add("aaa");
    m1.add("bbb");
    m1.add("ccc");

    final Musics2.Player p1 = m1.new Player();
    final Musics2.Player p2 = m1.new Player();

    p1.play();
    p2.play();

    final Musics2 m2 = new Musics2();
    m2.add("xxx");
    m2.add("yyy");

    final Musics2.Player p3 = m2.new Player();

    p3.play();
  }
}
class Musics2{
  class Player{
    public void play() {
      for(final String song : songs) {
        System.out.println(song);
      }
      System.out.println("-----------");
    }
  }
  List<String> songs = new ArrayList<>();

  public void add(final String song) {
    songs.add(song);
  }

  public Player createPlayer() {
    return this.new Player();
  }

  public void delete(final int index) {
    songs.remove(index);
  }
}

