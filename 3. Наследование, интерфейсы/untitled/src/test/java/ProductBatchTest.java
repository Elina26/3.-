import static org.junit.Assert.*;
import org.junit.Test;

public class ProductBatchTest {
    ProductPackaging productPackaging = new ProductPackaging("Коробка", 10.0);
    PackagedWeightProduct[] weightProducts = {new PackagedWeightProduct(productPackaging,
            11.0, new WeightProduct("что-то", "вкусное"))};

    ProductBatch productBatch = new ProductBatch("партия чего-то вкусного", weightProducts);

    @Test
    public void testGetWeight() {
        assertEquals(productBatch.getWeight(), 21.0, 0);
    }
}