package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }
    public double distance(Point secPoint){
        return Math.sqrt(Math.pow((secPoint.x-x),2)+Math.pow((secPoint.y-y),2));
    }
    public  double distance(int baseA, int baseB){
        return Math.sqrt(Math.pow((baseA-x),2)+Math.pow((baseB-y),2));
    }


}
