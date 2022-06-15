package TatyanaMilkina.Lesson9;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("red", 6,7,30);
        shapes[1] = new Circle("green", 7,8,40);
        shapes[2] = new Rectangle("black", 6,7,3, 5);
        shapes[3] = new Rectangle("green", 5,3,7, 7);

        for (Shape shape: shapes) {
            shape.draw();
        }
    }
}
