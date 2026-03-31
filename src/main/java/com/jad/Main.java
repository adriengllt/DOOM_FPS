package com.jad;

import com.jad.fps.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) {


        Map map = new Map("map2.bmp");
        Player player = new Player(new Point(450,360), 0,map);

        Renderer render = new Renderer();
        GameWindow window = new GameWindow("Mon super FPS a moi que j'ai fais TT SEUL comme un GRAND");

        int direction = 0;

        while(!ActionPlayer.EXIT.isActive()) {
            window.display(render.render(player.getPosition(), player.getDirection(), map));
            player.handleActions();
        }
        System.exit(0);

    }
}