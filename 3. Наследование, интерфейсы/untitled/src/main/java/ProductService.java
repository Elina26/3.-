public class ProductService {
    public static int countByFilter(ProductBatch batch, Filter filter) {
        int c=0;
        for (int i=0; i<batch.getProducts().length; i++) {
            if (filter.apply(batch.getProducts()[i].getName())) {
                c++;
            }
        }
        return c;
    }
}
