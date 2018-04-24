public class Coffee implements Comparable<Coffee> {

    public final Long id;
    public final Integer price;
    public final String name;

    public Coffee(Long id,Integer price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s:%d:%d", name, id, price);
    }

    @Override
    public int compareTo(Coffee o) {
        return id.compareTo(o.id);
    }
}
/*
public class Coffee{

    public final Long id;
    public final Integer price;
    public final String name;

    public Coffee(Long id,Integer price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }
}
 */
