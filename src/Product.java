import java.util.Date;

/**
 * Created by deran on 06/11/2017.
 */
public abstract class Product {
    private String pBrand;
    private String pModel;

    public Product(String pBrand, String pModel) {
        super();
        this.pBrand = pBrand;
        this.pModel = pModel;
    }

    public String getpBrand() {
        return pBrand;
    }

    public String getpModel() {
        return pModel;
    }

    public abstract void print();
}
