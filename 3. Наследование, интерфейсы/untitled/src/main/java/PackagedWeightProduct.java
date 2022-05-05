import java.util.Objects;

//упакованный весовой товар
public class PackagedWeightProduct extends PackagedProduct {
    private final double weight;
    private final WeightProduct product;

    public PackagedWeightProduct(ProductPackaging productPackaging, double weight, WeightProduct product) {
        super(product.getName(), product.getDescription(), productPackaging);
        this.weight = weight;
        this.product = product;
    }

    public double getWeight() {
        return weight;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PackagedWeightProduct)) return false;
        PackagedWeightProduct that = (PackagedWeightProduct) o;
        return Double.compare(that.getWeight(), getWeight()) == 0 && Objects.equals(getProductPackaging(),
                that.getProductPackaging()) && Objects.equals(getProduct(), that.getProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductPackaging(), getWeight(), getProduct());
    }

    @Override
    public String toString() {
        return String.format("Весовой товар '%s' с упаковкой '%s' (%fкг)",
                product.getName(), productPackaging.getName(), weight);
    }

    //масса нетто
    public double getNetWeight() {
        return weight;
    }

    //масса брутто
    public double getGrossWeight() {
        return weight + productPackaging.getWeight();
    }
}
