public class BridgeDemo {
    public static void main(String[] args) {

        Shape redCircle = new Circle(10, 7, 5, new RedPen());
        redCircle.draw();

        Shape greenCircle = new Circle(1, 3, 3, new GreenPen());
        greenCircle.draw();
    }
}