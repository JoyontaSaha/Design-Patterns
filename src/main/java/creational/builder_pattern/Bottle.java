package creational.builder_pattern;

public class Bottle implements Packing {
    @Override
    public PackType pack() {
        return PackType.BOTTLE;
    }
}
