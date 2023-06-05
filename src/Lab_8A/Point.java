package Lab_8A;

public class Point {
    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // public int[] getXY() {
    //     int[] point = new int[2];
    //     point[0] = this.x;
    //     point[1] = this.y;
    //     return point;
    // } // ######
    // // Alternative way =v
    public int[] getXY() {
        return new int[] {this.x,this.y};
    } // ######
    
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    } // ######
    public double distance(Point anotherPoint) {
        return distance(anotherPoint.getX(), anotherPoint.getY());
    }
    public double distance() {
        return distance(0,0);
    }
}
