/**
 * Created by deran on 06/11/2017.
 */
public class Television extends ElectronicProduct {

    public Television(String pBrand, String pModel, int electricityUsage) {
        super(pBrand, pModel, electricityUsage);
    }

    @Override
    public void print() {
        System.out.println("Television");
    }
}
