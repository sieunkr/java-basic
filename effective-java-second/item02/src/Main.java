public class Main {

    public static void main(String[] args) {

        Coffee coffee = new Coffee.Builder()
                .colories(200)
                .price(1200)
                .name("라떼")
                .build();

        System.out.println(coffee.getName() + " " + coffee.getCalories() + " " + coffee.getPrice());

    }
}
