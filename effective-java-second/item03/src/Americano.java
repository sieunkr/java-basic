//single-element enum 은 싱글턴을 구현하는 가장 좋은 방법
public enum Americano {
    INSTANCE;

    public void display(){
        System.out.println("enum, 싱글턴");
    }
}