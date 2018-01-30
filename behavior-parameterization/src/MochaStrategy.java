public class MochaStrategy implements Strategy {

    @Override
    public boolean filter(Coffee coffee) {
        return "mocha".equals(coffee.getName());
    }
}
