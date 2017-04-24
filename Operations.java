public class Operations {

    private int x;
    private int y;
    //a constractor that has the same name of the class and has two parameters (x,y) to apply calculations on them
    public Operations(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //this method get summathion between the two number (type: int, that returns the z(sum))
    public int getSum() {
        int z = x + y;
        return z;
    }
    //this method get subtraction between the two number (type: int, that returns the z(difference))
    public int getDifference() {
        int z = x - y;
        return z;
    }
    //this method get multiplication between the two number (type: int, that returns the z(product))
    public int getProduct() {
        int z = x * y;
        return z;
    }
    //this method get average arithmetic between the two number (type: int, that returns the z(average))
    public double getAverage() {
        double z = (x + y)/2.0;
        return z;
    }
    //this method get the distance between the two number (type: int, that returns the z(distance))
    public int getDistance() {
        int z = Math.abs(x - y);
        return z;
    }
    //this method get the maximum from the two number (type: int, that returns the z(max))
    public int getMaximum() {
        int z = Math.max(x, y);
        return z;
    }
    //this method get the minimum from the two number (type: int, that returns the z(min))
    public int getMinimum() {
        int z = Math.min(x, y);
        return z;
    }
}
