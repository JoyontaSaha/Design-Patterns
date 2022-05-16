package creational.builder_pattern;

public class Wrapper implements Packing{
    @Override
    public PackType pack() {
        return PackType.WRAPPER;
    }
}
