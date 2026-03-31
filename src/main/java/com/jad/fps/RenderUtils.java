package com.jad.fps;

public enum RenderUtils {
    ;
    static final double VIEWING_ANGLE = 90.0;
    static final int SCREEN_WIDTH = 125;
    static final int SCREEN_HEIGHT = 32;
    static final int SCREEN_DISTANCE = RenderUtils.SCREEN_HEIGHT * 6/10;
    static final int WALL_HEIGHT = 15;
    static final int VIEWING_DISTANCE = 5000;
    static final int EYE_HEIGHT = RenderUtils.SCREEN_HEIGHT * 6/10;
    static final char SKY_PIXEL = '░';
    static final char GROUND_PIXEL = '▒';
    static final char WALL_PIXEL = '█';
    static final int BLACK_COLOR_IMAGE = -16777216;
    public static final double ROUND_CONSTANT = 1000.0;

    public static double degreesToRadians(final double degree) {

        return Math.round(Math.toRadians(degree)* ROUND_CONSTANT)/ROUND_CONSTANT;

    }
}
