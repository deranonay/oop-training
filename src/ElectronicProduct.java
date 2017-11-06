/**
 * Created by deran on 06/11/2017.
 */
public abstract class ElectronicProduct extends Product implements Electronics {
    private int electricityUsage;

    public ElectronicProduct(String pBrand, String pModel, int electricityUsage) {
        super(pBrand, pModel);
        this.electricityUsage = electricityUsage;
    }

    @Override
    public int getElectrictyUsage() {
        return electricityUsage;
    }
}
