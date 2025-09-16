package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double height;
    private final double base1;
    private final double base2;

    public IsoscelesTrapezoid(Colors color, double height, double base1, double base2) {
        super(color);
        this.height = height;
        this.base1 = base1;
        this.base2 = base2;
    }

    @Override
    public double getArea() {
        return ((base1 + base2) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea()
                + " sq. units, height: " + height + " base1: " + base1 + " base2: " + base2
                + " units, color: " + getColor());
    }
}
