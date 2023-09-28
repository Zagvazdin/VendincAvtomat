import java.util.ArrayList;
import java.util.List;


public class Main {
        public  static void main(String[] args) {
            List<BottleOfWater> listProduct = new ArrayList<>();
            listProduct.add(new BottleOfWater("Capuchino", 35, 5));
            listProduct.add(new BottleOfWater("Latte", 45, 35));
            listProduct.add(new BottleOfWater("Inenciv", 23, 20));
            listProduct.add(new BottleOfWater("Milk&Cho", 55, 48));
            BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(listProduct);
            System.out.println(vendingMachine.getProduct("Latte"));


        }
}
