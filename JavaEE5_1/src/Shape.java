public abstract class Shape {
    protected DrawAPI drawAPI;

    public abstract void draw();

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
}