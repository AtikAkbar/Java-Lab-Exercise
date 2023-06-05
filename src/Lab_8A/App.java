package Lab_8A;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();

        Point point1 = new Point(x1,y1);
        
        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();

        Point point2 = new Point(x2,y2);
        
        System.out.println("Distance between two point: " + point1.distance(point2));

        Line line = new Line(point1,point2);
        System.out.println(line.toString());
        System.out.println("Length of the line: " + line.getLength());

        sc.close();
        
    }
}
