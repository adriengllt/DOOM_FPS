package com.jad;

import com.jad.fps.Map;
import com.jad.fps.Renderer;

public class Main {
    public static void main(String[] args) {


        Map map = new Map(10,10);
        Renderer render = new Renderer();
        System.out.println(render.render(null,0,map));
    }
}