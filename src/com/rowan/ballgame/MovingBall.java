package com.rowan.ballgame;

import java.awt.*;

abstract class MovingBall extends Sprite {
    MovingBall(int x, int y, int dx, int dy) {
        width = 20;
        height = 20;
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
    }

    void updateSpeed() {}
    void update(double fps) {
        updateSpeed();
        x += dx;
        y += dy;
    }

    void draw(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillOval(x, y, width, height);
    }
}
