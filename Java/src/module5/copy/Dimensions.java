package module5.copy;

public class Dimensions {
    private final int width;
    private final int height;
    private final int length;

    public Dimensions(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getVolume() {
        return width * height * length;
    }

    public void printInfo() {
        System.out.print("Габариты: ");
        System.out.print("ширина - " + width + "; ");
        System.out.print("высота - " + height + "; ");
        System.out.println("длина - " + length + "; ");
    }
}
