class Line {
    private double x1, y1, x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getLength() {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public boolean isGreater(Line other) {
        return this.getLength() > other.getLength();
    }

    public boolean isLess(Line other) {
        return this.getLength() < other.getLength();
    }

    public boolean isEqual(Line other) {
        return this.getLength() == other.getLength();
    }
}

public class latihan1_p9 {
     public static void main(String[] args) {
        Line line1 = new Line(0, 0, 3, 4);
        Line line2 = new Line(0, 0, 6, 8);

        System.out.println("Panjang Line 1: " + line1.getLength());
        System.out.println("Panjang Line 2: " + line2.getLength());
        System.out.println("Line 1 > Line 2 ? " + line1.isGreater(line2));
        System.out.println("Line 1 < Line 2 ? " + line1.isLess(line2));
        System.out.println("Line 1 == Line 2 ? " + line1.isEqual(line2));
    }
}

