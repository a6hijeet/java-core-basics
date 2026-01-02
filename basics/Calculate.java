class Calculate {

    int x, y;

    public Calculate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int add() {
        return this.x + this.y;
    }

    public int subtract() {
        return this.x - this.y;
    }

    public int multiply() {
        return this.x * this.y;
    }

    public double divide() {
        return this.x / this.y;
    }

    public double remainder() {
        return this.x % this.y;
    }

    public static void main(String[] args) {
        Calculate c = new Calculate(26 , 5);
        System.out.println("Addition " + c.add());
        System.out.println("Subtraction " + c.subtract());
        System.out.println("Multiply " + c.multiply());
        System.out.println("Divide " + c.divide());
        System.out.println("remainder " + c.remainder());
    } 
}