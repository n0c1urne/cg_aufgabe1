package main;

import processing.core.PApplet;


public class ExampleWithVector extends PApplet {

    public static final int SCREEN_X = 1024;
    public static final int SCREEN_Y = 768;

    public static void main(String[] args) {
        PApplet.main("main.ExampleWithVector");
    }

    @Override
    public void settings() {
        size(SCREEN_X,SCREEN_Y, "processing.opengl.PGraphics2D");
    }

    @Override
    public void draw() {
        background(255);

        Vec2 center = Vec2.of(SCREEN_X/2, SCREEN_Y/2);
        Vec2 mouse = Vec2.of(mouseX, mouseY);

        Vec2 dir = mouse
                .sub(center)
                .unit()
                .mult(100);

        line(center, center.add(dir));
    }

    void line(Vec2 a, Vec2 b) {
        line(a.x, a.y, b.x, b.y);
    }

}
