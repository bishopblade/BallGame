package com.rowan.ballgame;
import java.util.ArrayList;
import java.util.List;

public class Level5 implements Level{
    public int ballX() {
        return 40;
    }

    public int ballY() { return 40;}

    public List<Wall> walls() {
        List<Wall> wallList = new ArrayList<Wall>();

        wallList.add(new Wall(0, 0, 800, 10));
        wallList.add(new Wall(0, 0, 10, 600));
        wallList.add(new Wall(0, 590, 800, 10));
        wallList.add(new Wall(790, 0, 10, 600));
        wallList.add(new Wall(80, 80,20, 160));
        wallList.add(new Wall(100, 80,60, 20));
        wallList.add(new Wall(140, 100,20, 100));
        wallList.add(new Wall(160, 180,160, 20));
        wallList.add(new Wall(300, 200,20, 120));
        wallList.add(new Wall(200, 300, 100, 20));
        wallList.add(new Wall(80, 320, 20, 200));
        wallList.add(new Wall(100, 500, 120, 20));
        wallList.add(new Wall(220, 80, 240, 20));
        wallList.add(new Wall(400, 100,20, 80));
        wallList.add(new Wall(420, 160,380, 20));
        wallList.add(new Wall(560, 80,140, 20));
        wallList.add(new Wall(680, 100,20, 60));
        wallList.add(new Wall(660, 180,140, 20));
        wallList.add(new Wall(180, 400, 140, 20));
        wallList.add(new Wall(300, 420, 20, 180));
        wallList.add(new Wall(400, 400, 180, 20));
        wallList.add(new Wall(400, 260, 20, 60));
        wallList.add(new Wall(420, 260,160, 20));
        wallList.add(new Wall(560, 280,20, 120));
        wallList.add(new Wall(420, 500,20, 60));
        wallList.add(new Wall(420, 500,100, 20));
        wallList.add(new Wall(500, 400,20, 200));
        wallList.add(new Wall(600, 480, 100, 20));
        wallList.add(new Wall(600, 480, 20, 70));
        wallList.add(new Wall(700, 200, 100, 20));
        wallList.add(new Wall(720, 220, 80, 20));
        wallList.add(new Wall(740, 240,60, 20));
        wallList.add(new Wall(660, 280,20, 200));
        wallList.add(new Wall(680, 280,20, 100));
        wallList.add(new Wall(700, 300,20, 80));
        wallList.add(new Wall(320, 720,20, 60));



        return wallList;
    }

    public List<MovingBall> balls() {
        List<MovingBall> ballList = new ArrayList<>();

        ballList.add(new MovingBall(140, 360, 5, 0){
            void updateSpeed() {
                if (x < 140 || x > 520) {
                    dx = -dx;
                }}
        });

        ballList.add(new MovingBall(620, 200, 0, -5){
            void updateSpeed() {
                if (y < 200 || y > 560) {
                    dy = -dy;
                }}
        });

        ballList.add(new MovingBall(420, 130, 5, 0){
            void updateSpeed() {
                if (x < 420 || x > 660) {
                    dx = -dx;
                }}
        });

        return ballList;
    }

    public StartZone startZone() {
        return new StartZone(10, 10, 70, 70);
    }

    public EndZone endZone() {
        return new EndZone(720, 520, 70, 70);
    }
}
