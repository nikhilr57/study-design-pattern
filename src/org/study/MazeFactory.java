package org.study;

public class MazeFactory {

  private static MazeFactory instance;

  protected MazeFactory() {

  }

  public static MazeFactory getInstance() {

    String str = "BOMBED";
    if (instance == null) {
      if (str.equals("BOMBED")) {
        instance = new BombedMazeFactory();
      } else {
        instance = new MazeFactory();
      }
    }
    return instance;
  }
}
