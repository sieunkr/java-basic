public class Coffee {
    private String name;
    private static final Coffee coffee = new Coffee();

    private Coffee(){

    }

    private Coffee(String name){
        this.name = name;
    }

    public static Coffee getInstance(){
        return coffee;
    }

    public static Coffee newInstanceByName(String name){
        coffee.setName(name);
        return coffee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
