public class BottleOfWater extends Product {
    private int temperature;


    public BottleOfWater(String name, double price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name =" + super.getName() + '\'' +
                ",temperature =" + this.temperature + '\'' +
                ", price =" + super.getPrice() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BottleOfWater)) {
            return false;
        }

        BottleOfWater that = (BottleOfWater) o;

        return super.getName().equalsIgnoreCase(that.getName())
                && super.getPrice() == that.getPrice()
                && getTemperature() == that.getTemperature();
    }
}