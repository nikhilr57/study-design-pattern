package org.study;

public class MazeGame {

  public Maze createGame() {
    MazeGame game = new MazeGame();

    StandardMazeBuilder builder = new StandardMazeBuilder();
    game.createMaze(builder);
    // game.createComplexMaze(builder);

    return builder.getMaze();
  }

  public Maze createMaze(MazeBuilder builder) {
    builder.buildMaze();
    builder.buildRoom(1);
    builder.buildRoom(2);
    builder.buildDoor(1, 2);
    return builder.getMaze();
  }

  // we can reuse MazeBuilder to build different kinds of mazes
  public Maze createComplexMaze(MazeBuilder builder) {
    builder.buildMaze();
    builder.buildRoom(1);
    builder.buildRoom(2);
    // ....
    builder.buildRoom(10000);

    builder.buildDoor(1, 2);
    return builder.getMaze();
  }
}
