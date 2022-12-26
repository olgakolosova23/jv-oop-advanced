package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        int color = random.nextInt(Color.values().length);
        return Color.valueOf(Color.values()[color].name());
    }
}