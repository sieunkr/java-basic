public class Main {

    public static void main(String[] args) {
        CoffeeServiceFactory.registerProvider("CAFE25", CAFE25_PROVIDER);
        CoffeeService coffeeService = CoffeeServiceFactory.newInstance("CAFE25");
        System.out.println(coffeeService.make());
    }

    private static CoffeeProvider CAFE25_PROVIDER = new CoffeeProvider() {
        @Override
        public CoffeeService newService() {
            return new CoffeeService() {
                @Override
                public String make() {
                    return "커피를 만듭니다.";
                }
            };
        }
    };
}
