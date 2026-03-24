package com.jad.fps;

public class Map {
    private final int[][] maze;
    private final int width;
    private final int height;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.maze = new int[height][width];
        for (int row = 0; row < this.height; row++) {
            for (int column = 0; column < this.width; column++) {
                this.maze[row][column] = 0;
            }
        }
    }
}
