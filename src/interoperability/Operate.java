package interoperability;

import operatorOveloadingExtensionFn.Point;

public class Operate {

    public Integer sum(int a, int b) {
        return a + b;
    }

    public void printPointCoordinates() {
        Point point = new Point(4, 5);
        System.out.println(point.getX() + " , " + point.getY());
    }

    public static void main(String[] args) {
        Operate operate = new Operate();
        operate.printPointCoordinates();
    }

}
