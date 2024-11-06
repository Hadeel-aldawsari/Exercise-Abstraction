package Movable;

public class MovablePoint implements Movable {
  private int x;
  private int y;
  private int xSpeed;
  private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        System.out.println("Move Up:"+ (y+=ySpeed));
    }

    @Override
    public void moveDown() {
        System.out.println("Move Down:"+ (y-=ySpeed));

    }

    @Override
    public void moveRight() {
        System.out.println("Move Right:"+ (x+=xSpeed));

    }

    @Override
    public void moveLeft() {
        System.out.println("Move Left:"+ (x-=xSpeed));

    }
}
