import java.util.List;
import java.util.ArrayList;

public class BottleOfWaterVendingMachine implements VendingMachine {
    private final List<Product> products;

    public BottleOfWaterVendingMachine(List<? extends Product> products) {
        this.products = new ArrayList<>(products);
    }

    public Product getProduct(String name){
        for(Product product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public BottleOfWater getProduct(String name, int temperature){
        for(Product product: products){
            if(product instanceof BottleOfWater){
                if(product.getName().equalsIgnoreCase(name) && ((BottleOfWater) product).getTemperature() == temperature){
                    return (BottleOfWater) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}