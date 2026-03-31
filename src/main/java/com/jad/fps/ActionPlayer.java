package com.jad.fps;

public enum ActionPlayer {
    TURN_LEFT("turnleft"),
    TURN_RIGHT("turnright"),
    FORWARD("forward"),
    BACKWARD("backward"),
    LEFT("left"),
    RIGHT("right"),
    EXIT("exit");
    private final String actionKey;

    public String getActionKey() {
        return actionKey;
    }



    public boolean isActive() {
        return isActive;
    }

    private boolean isActive;

    ActionPlayer(String actionKey) {
        this.actionKey = actionKey;
        this.isActive = false;
    }

    public void turnOn(){
        this.isActive = true;
    }
    public void turnOff(){
        this.isActive = false;
    }
}
