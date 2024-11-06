package Movable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Test movable");
        MovablePoint movablePoint=new MovablePoint(20,10,25,35);
        movablePoint.moveDown();
        movablePoint.moveUp();
        movablePoint.moveLeft();
        movablePoint.moveRight();


    }
}