package com.jad.fps;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Map {
    private final int[][] maze;
    private final int width;
    private final int height;

    public Map(final String imageName) {
        final URL url = Map.class.getClassLoader().getResource(imageName);
        final BufferedImage image;
        try {
            image = ImageIO.read(url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        this.width = image.getWidth();
        this.height = image.getHeight();
        this.maze = new int[height][width];
        for (int row = 0; row < this.height; row++) {
            for (int column = 0; column < this.width; column++) {
                this.maze[row][column] = switch (image.getRGB(column, row)) {
                    case RenderUtils.BLACK_COLOR_IMAGE ->  1;
                    default -> 0;
                };
            }
        }
    }

    public int get(int x, int y) {
        return this.maze[y][x];
    }
}
