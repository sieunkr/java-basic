public class Util {
    public static <T> Coffee<T> take(T t){
        Coffee<T> coffee = new Coffee<T>();
        coffee.setT(t);
        return coffee;
    }
}
