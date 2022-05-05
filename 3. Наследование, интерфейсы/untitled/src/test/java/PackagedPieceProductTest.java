import static org.junit.Assert.*;
//import static org.junit.Assertions.*;
import org.junit.Test;

public class PackagedPieceProductTest {
    PieceProduct product = new PieceProduct("яблоко", "красное яблоко", 200.00);
    PackagedPieceProduct packagedProduct = new PackagedPieceProduct(new ProductPackaging("мешочек", 10.0),
            10, product);

    @Test
    public void testGetNetWeight() {
        assertEquals(packagedProduct.getNetWeight(), 2000.0, 0);
    }

    @Test
    public void testGetGrossWeight() {
        assertEquals(packagedProduct.getGrossWeight(), 2010.0, 0);
    }
}