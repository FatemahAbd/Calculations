public class Operations {

    private int x;
    private int y;

    public Operations(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getSum() {
        int z = x + y;
        return z;
    }

    public int getDifference() {
        int z = x - y;
        return z;
    }

    public int getProduct() {
        int z = x * y;
        return z;
    }

    public double getAverage() {
        double z = (x + y)/2.0;
        return z;
    }

    public int getDistance() {
        int z = Math.abs(x - y);
        return z;
    }

    public int getMaximum() {
        int z = Math.max(x, y);
        return z;
    }

    public int getMinimum() {
        int z = Math.min(x, y);
        return z;
    }
}
