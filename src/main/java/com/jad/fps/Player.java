package com.jad.fps;

import java.awt.*;

public class Player {
    private static final int MAX_DEGREES = 360;
    private static int playerStep = 2;


    public Point getPosition() {
        return position;
    }

    public Player(Point position, int direction, Map map) {
        this.position = position;
        this.direction = direction;
        this.map = map;
    }

    private int direction;
    private Point position;
    private final Map map;

    public int getDirection() {
        return this.direction;
    }

    
    public void turnLeft() {
        direction = (this.direction-7)%Player.MAX_DEGREES;
        ActionPlayer.TURN_LEFT.turnOff();

    }
    public void turnRight() {
        direction = (this.direction+7)%Player.MAX_DEGREES;
        ActionPlayer.TURN_RIGHT.turnOff();
    }

    public void handleActions() {
        if(ActionPlayer.TURN_LEFT.isActive()) this.turnLeft();
        if(ActionPlayer.TURN_RIGHT.isActive()) this.turnRight();
        if(ActionPlayer.FORWARD.isActive()) this.moveForward();
        if(ActionPlayer.BACKWARD.isActive()) this.moveBackward();
        if (ActionPlayer.RIGHT.isActive()) this.moveRight();
        if (ActionPlayer.LEFT.isActive()) this.moveleft();
    }

    private void moveleft() {
        final double angleRadians = RenderUtils.degreesToRadians(this.direction);
        final int newX = (int)(this.position.x - Player.playerStep*Math.sin(angleRadians));
        final int newY = (int)(this.position.y + Player.playerStep*Math.cos(angleRadians));
        this.move(new Point(newX,newY));
    }

    private void moveRight() {
        final double angleRadians = RenderUtils.degreesToRadians(this.direction);
        final int newX = (int)(this.position.x + Player.playerStep*Math.sin(angleRadians));
        final int newY = (int)(this.position.y - Player.playerStep*Math.cos(angleRadians));
        this.move(new Point(newX,newY));

    }

    private void moveBackward() {
        final double angleRadians = RenderUtils.degreesToRadians(this.direction);
        final int newX = (int)(this.position.x + Math.cos(angleRadians)*Player.playerStep);
        final int newY = (int)(this.position.y + Math.sin(angleRadians)*Player.playerStep);
        this.move(new Point(newX,newY));
    }

    private void moveForward() {
        final double angleRadians = RenderUtils.degreesToRadians(this.direction);
        final int newX = (int)(this.position.x - Math.cos(angleRadians)*Player.playerStep);
        final int newY = (int)(this.position.y - Math.sin(angleRadians)*Player.playerStep);
        this.move(new Point(newX,newY));
    }

    private void move(final Point point){
        if(this.map.isEmpty(point)) this.position = point;
    }
}
