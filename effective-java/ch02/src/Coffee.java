public class Coffee {

    private final String name;
    private final int price;
    private final int calories;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    public static class Builder{

        private int price = 0;
        private int calories = 0;
        private String name;

        public Builder colories(int val){
            calories = val;
            return this;
        }

        public Builder price(int val){
            price = val;
            return this;
        }

        public Builder name(String val){
            name = val;
            return this;
        }

        public Coffee build(){
            return new Coffee(this);
        }

    }

    private Coffee(Builder builder){
        price = builder.price;
        calories = builder.calories;
        name = builder.name;
    }


}
