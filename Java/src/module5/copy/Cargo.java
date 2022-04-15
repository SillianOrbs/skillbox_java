package module5.copy;

public class Cargo {
    //строка, потому что там высота, ширина, глубина
    private final Dimensions dimensions;
    //вес может быть и не целым числом
    private final double weight;
    private final String address;
    private final boolean isFlip;
    private final String regNumber;

    public Cargo(Dimensions dimensions, double weight, String address, boolean isFlip, String regNumber) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.isFlip = isFlip;
        this.regNumber = regNumber;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public boolean isFlip() {
        return isFlip;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public Cargo setAddress(String address) {
        return new Cargo(dimensions, weight, address, isFlip, regNumber);
    }

    public Cargo setWeight(double weight) {
        return new Cargo(dimensions, weight, address, isFlip, regNumber);
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, weight, address, isFlip, regNumber);
    }

    public void printInfo() {
        System.out.println("Информация по объекту:");
        dimensions.printInfo();
        System.out.println("Вес - " + weight);
        System.out.println("Адресс доставки: \"" + address + "\"");
        System.out.println("Можно переворачивать - " + (isFlip ? "да" : "нет"));
        System.out.println("Регистрационный номер: " + regNumber);
    }
}
