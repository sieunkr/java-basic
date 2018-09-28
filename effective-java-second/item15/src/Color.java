public final class Color {
    final private int red;
    final private int green;
    final private int blue;

    private void check(int red, int green, int blue) {
        if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
            throw new IllegalArgumentException();
        }
    }

    public Color(int red, int green, int blue) {
        check(red, green, blue);        this.red = red;        this.green = green;        this.blue = blue;
    }

    public Color invert() {
       return new Color(255 - red, 255 - green, 255 - blue);
    }

}