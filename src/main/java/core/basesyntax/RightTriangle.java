package core.basesyntax;

public class RightTriangle extends Figure {
    private final double hypotenuse;
    private final double base;
    private final double height;

    public RightTriangle(Color color, double hypotenuse, double base, double height) {
        super(color);
        this.hypotenuse = hypotenuse;
        this.height = height;
        this.base = base;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, " + "area: " + area()
                + " sq.units, " + "hypotenuse: " + this.hypotenuse
                + ",base: " + this.base + "height: "
                + this.height + " units, " + "color: " + this.getColor());
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}
