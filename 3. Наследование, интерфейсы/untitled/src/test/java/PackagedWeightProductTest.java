import static org.junit.Assert.*;
import org.junit.Test;

public class PackagedWeightProductTest {
    PackagedWeightProduct product = new PackagedWeightProduct(new ProductPackaging("Пакет", 90.0),
            9000.99, new WeightProduct("Угли", "Древесные угли"));

    @Test
    public void testGetNetWeight() {
        assertEquals(product.getNetWeight(), 9000.99, 0);
    }

    @Test
    public void testGetGrossWeight() {
        assertEquals(product.getGrossWeight(), 9090.99, 0);
    }
}