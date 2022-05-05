import static org.junit.Assert.*;
import org.junit.Test;

public class ProductServiceTest {

    ProductPackaging productPackaging = new ProductPackaging("коробка", 10.0);
    PieceProduct apple = new PieceProduct("яблоки", "зеленые", 100.0);
    PackagedPieceProduct appleBox = new PackagedPieceProduct(productPackaging, 10, apple);

    ProductBatch batch = new ProductBatch("Партия яблок (3 коробки по 10 яблок)", appleBox, appleBox, appleBox);

    WeightProduct weightProduct = new WeightProduct("малина", "ягоды");
    PackagedWeightProduct berriesBox = new PackagedWeightProduct(productPackaging, 100.0, weightProduct);

    ProductBatch weightBatch = new ProductBatch("Партия ягод", berriesBox);


    @Test
    public void testCounter() {
        //название элементов партии batch - "яблоки", 3 коробки
        assertEquals(ProductService.countByFilter(batch, new BeginStringFilter("яблоки")), 3);
        //название элементов партии batch - "яблоки", 3 коробки
        assertEquals(ProductService.countByFilter(batch, new ContainsStringFilter("зеленые")), 0);
        //название элементов партии weightBatch - "малина"
        assertEquals(ProductService.countByFilter(weightBatch, new BeginStringFilter("малина")), 1);
    }
}