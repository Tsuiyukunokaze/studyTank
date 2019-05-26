package com.zzx.tank;

import java.awt.*;

public class Tank {
    private int x = 200;
    private int y = 200;
    private Dir dir = Dir.UP;
    private static final int WIDTH = 50;
    private static final int HEIGHT = 50;
    private static final int SPEED = 5;
    private boolean moveing = false;

    public Tank(int x, int y, Dir dir){
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void paint(Graphics g){
        g.fillRect(x, y, WIDTH, HEIGHT);
        move();
    }

    private void move(){
        if(moveing){
            switch (dir) {
                case UP:
                    y -= SPEED;
                    break;
                case RIGHT:
                    x += SPEED;
                    break;
                case DOWN:
                    y += SPEED;
                    break;
                case LEFT:
                    x -= SPEED;
                    break;
                case UP_RIGHT:
                    y -= SPEED;
                    x += SPEED;
                    break;
                case RIGHT_DOWN:
                    x += SPEED;
                    y += SPEED;
                    break;
                case DOWN_LEFT:
                    y += SPEED;
                    x -= SPEED;
                    break;
                case LEFT_UP:
                    x -= SPEED;
                    y -= SPEED;
                    break;
                default:
                    break;
            }
        }
    }

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public boolean isMoveing() {
        return moveing;
    }

    public void setMoveing(boolean moveing) {
        this.moveing = moveing;
    }
}