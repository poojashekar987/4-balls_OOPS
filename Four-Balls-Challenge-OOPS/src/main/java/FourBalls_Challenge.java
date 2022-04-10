import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class FourBalls_Challenge extends PApplet {
    private final int WIDTH = 800;
    private final int HEIGHT = 600;
    private final int DIAMETER = 10;

    private int ballsWidth;
    private int ballsHeightPosition;
    private int ballsIncrementSpeed;

    private static List<FourBalls_Challenge> balls = new ArrayList<>();

    public FourBalls_Challenge() {
    }

    public FourBalls_Challenge(int ballsWidth, int ballsHeightPosition, int ballsIncrementSpeed) {
        this.ballsWidth = ballsWidth;
        this.ballsHeightPosition = ballsHeightPosition;
        this.ballsIncrementSpeed = ballsIncrementSpeed;
    }

    public static void main(String[] args) {
        PApplet.main("FourBalls_Challenge", args);

        FourBalls_Challenge firstBall = new FourBalls_Challenge(0, 1, 1);
        balls.add(firstBall);

        FourBalls_Challenge secondBall = new FourBalls_Challenge(0, 2, 2);
        balls.add(secondBall);

        FourBalls_Challenge thirdBall = new FourBalls_Challenge(0, 3, 3);
        balls.add(thirdBall);

        FourBalls_Challenge fourthBall = new FourBalls_Challenge(0, 4, 4);
        balls.add(fourthBall);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (FourBalls_Challenge ball : balls) {
            ball.ballsWidth = drawCircle(ball);
        }
    }

    private int drawCircle(FourBalls_Challenge ball) {
        int height = ball.ballsHeightPosition * HEIGHT / 5;
        ellipse(ball.ballsWidth, height, DIAMETER, DIAMETER);
        ball.ballsWidth += ball.ballsIncrementSpeed;
        return ball.ballsWidth;
    }
}
