//02.빌더 패턴
public class Main {

    public static void main(String[] args) {

        Coffee coffee = new Coffee.Builder()
                .colories(200)
                .price(1200)
                .name("라떼")
                .build();

        System.out.println(coffee.getName() + " " + coffee.getCalories() + " " + coffee.getPrice());


        /* 단점
         * 1. 객체를 생성하기 위해서 반드시 빌더 객체를 생성해야 한다.
         */
    }
}
