package com.jad;

import com.jad.fps.Map;
import com.jad.fps.Renderer;

import java.awt.*;

public class Main {
    public static void main(String[] args) {


        Map map = new Map("map2.bmp");
        Renderer render = new Renderer();
        System.out.println(render.render(new Point(450, 360),45,map));
    }
}