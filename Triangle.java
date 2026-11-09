public class Triangle {
    private int width;
    public Triangle(int width) {
        this.width = width;
    }

    public int getArea() {
        if (this.width <= 0) {return 0;}
        else if (this.width == 1) {return 1;}
        else {
            Triangle smallTriangle = new Triangle(this.width - 1);
            int smallerArea = smallTriangle.getArea();
            return  smallerArea + this.width;
        }
    }
    public static void main(String[] args) {
        Triangle triangolo = new Triangle(4);
        System.out.println(triangolo.getArea());
    }
}
