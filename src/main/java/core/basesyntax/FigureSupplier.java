package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        Colors color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                double side = 1 + random.nextInt(10);
                return new Square(color, side);
            case 1:
                double width = 1 + random.nextInt(10);
                double height = 1 + random.nextInt(10);
                return new Rectangle(color, width, height);
            case 2:
                double leg1 = 1 + random.nextInt(10);
                double leg2 = 1 + random.nextInt(10);
                return new RightTriangle(color, leg1, leg2);
            case 3:
                double radius = 1 + random.nextInt(10);
                return new Circle(color, radius);
            case 4:
            default:
                double base1 = 1 + random.nextInt(10);
                double base2 = 1 + random.nextInt(10);
                double trapHeight = 1 + random.nextInt(10);
                return new IsoscelesTrapezoid(color, base1, base2, trapHeight);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE, 10);
    }
}
