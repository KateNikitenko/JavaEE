public class Circle extends Shape {

    private int x, y, radius;

    public Circle( int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x, y);
    }

    public static class GreenPen implements DrawAPI {

        public void drawCircle(int radius, int x, int y) {
            System.out.println("Drawing Circle color: green, radius: " + radius + ", x = " + x + ", y = " + y);
        }
    }
}