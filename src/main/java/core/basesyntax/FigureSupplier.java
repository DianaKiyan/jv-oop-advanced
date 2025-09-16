package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final Random random = new Random();

    private static final int RANDOM_BOUND = 10;
    private static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        String color = getRandomColor();

        switch (figureType) {
            case 0:
                double side = 1 + random.nextInt(RANDOM_BOUND);
                return new Square(color, side);
            case 1:
                double width = 1 + random.nextInt(RANDOM_BOUND);
                double height = 1 + random.nextInt(RANDOM_BOUND);
                return new Rectangle(color, width, height);
            case 2:
                double leg1 = 1 + random.nextInt(RANDOM_BOUND);
                double leg2 = 1 + random.nextInt(RANDOM_BOUND);
                return new RightTriangle(color, leg1, leg2);
            case 3:
                double radius = 1 + random.nextInt(RANDOM_BOUND);
                return new Circle(color, radius);
            case 4:
            default:
                double base1 = 1 + random.nextInt(RANDOM_BOUND);
                double base2 = 1 + random.nextInt(RANDOM_BOUND);
                double trapHeight = 1 + random.nextInt(RANDOM_BOUND);
                return new IsoscelesTrapezoid(color, base1, base2, trapHeight);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.name(), DEFAULT_RADIUS);
    }
}
