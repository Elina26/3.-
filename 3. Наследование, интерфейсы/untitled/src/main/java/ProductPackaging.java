import java.util.Objects;

//упаковка товара
public class ProductPackaging {
    private final String name;
    private final double weight;

    public ProductPackaging(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Упаковка %s с весом %f", name, weight);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductPackaging)) return false;
        ProductPackaging that = (ProductPackaging) o;
        return Double.compare(that.getWeight(), getWeight()) == 0 && getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getWeight());
    }
}
