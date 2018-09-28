import java.util.HashMap;
import java.util.Map;

public class CoffeeServiceFactory {

    private CoffeeServiceFactory(){
    }

    private static final Map<String, CoffeeProvider> coffeeProviders = new HashMap<String, CoffeeProvider>();

    public static void registerProvider(String name, CoffeeProvider coffeeProvider){
        coffeeProviders.put(name,coffeeProvider);
    }

    public static CoffeeService newInstance(String name){
        CoffeeProvider coffeeProvider = coffeeProviders.get(name);

        return coffeeProvider.newService();
    }
}
