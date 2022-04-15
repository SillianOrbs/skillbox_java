package module5.copy;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(110, 100, 78);
        Cargo cargo = new Cargo(dimensions, 12.5, "First street, 23", true, "sdf1231aaAS12");
        cargo.printInfo();
        System.out.println(cargo.getDimensions().getVolume());
        System.out.println();

        cargo = cargo.setAddress("Second street, 24");
        cargo.printInfo();
        System.out.println();

        dimensions = new Dimensions(130, 94, 115);
        cargo = cargo.setDimensions(dimensions);
        cargo.printInfo();
        System.out.println();

        cargo = cargo.setWeight(66.2);
        System.out.println(cargo.getDimensions().getVolume());
        cargo.printInfo();
    }
}
