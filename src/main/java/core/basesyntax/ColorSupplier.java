package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();
    private final Colors[] colors = Colors.values();

    public Colors getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
