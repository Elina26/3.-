import java.util.Arrays;
import java.util.Objects;

//партия товаров
public class ProductBatch {
    private final String description;
    private final PackagedProduct[] products;

    public ProductBatch(String description, PackagedProduct... products) {
        this.description = description;
        this.products = products;
    }

    public String getDescription() {
        return description;
    }

    public PackagedProduct[] getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductBatch)) return false;
        ProductBatch that = (ProductBatch) o;
        return Objects.equals(getDescription(), that.getDescription()) && Arrays.equals(getProducts(), that.getProducts());
    }

    @Override
    public String toString() {
        return String.format("Партия товаров: %s %nТовары: %s", description, Arrays.toString(products));
    }

    public double getWeight() {
        double weight=0;
        for(int i=0; i<products.length; i++){
            weight+=products[i].getGrossWeight();
        }
        return weight;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getDescription());
        result = 31 * result + Arrays.hashCode(getProducts());
        return result;
    }
}
