package algorithms.homework9;

public class Item {

    private int weight;
    private int price;
    private double value;


    public Item(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                ", price=" + price +
                ", value=" + value +
                '}';
    }
}
