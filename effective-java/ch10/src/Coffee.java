public class Coffee {
    private final String name;
    private final int price;

    public Coffee(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        //return super.toString();
        return "주문한 커피는 " + this.name + "이고 가격은 " + this.price + "이다";
    }
}
