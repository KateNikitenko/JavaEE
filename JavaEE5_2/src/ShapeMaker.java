public class ShapeMaker {
    private Shape circle;
    private Shape restangle;
    private Shape square;

    public ShapeMaker(){
        circle = new Circle();
        restangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        restangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}