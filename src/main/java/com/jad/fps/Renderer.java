package com.jad.fps;

import java.awt.*;

public class Renderer {
    private final Screen screen = new Screen(RenderUtils.SCREEN_HEIGHT,RenderUtils.SCREEN_WIDTH);


    public String render(final Point origin, final int direction, final Map map){

        final double[] heightsPerceived = this.getHeightsPerceived(origin,direction,map);
        int numColumn = 0;
        for(final double heightPerceived : heightsPerceived){
            this.renderColumn(numColumn++, heightsPerceived);
        }
        return screen.toStr();
    }

    private void renderColumn(int numColumn, double[] heightsPerceived) {
        this.screen.verticalLine(numColumn, 0, RenderUtils.EYE_HEIGHT,RenderUtils.GROUND_PIXEL);
        this.screen.verticalLine(numColumn, RenderUtils.EYE_HEIGHT, RenderUtils.SCREEN_HEIGHT,RenderUtils.SKY_PIXEL); //Made with love by AD ♥
    }

    private double[] getHeightsPerceived(Point origin, int direction, Map map) {
        return new double[RenderUtils.SCREEN_WIDTH];
    }
}
