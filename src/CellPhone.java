/**
 * Created by deran on 06/11/2017.
 */
public class CellPhone extends ElectronicProduct {
    private String colour;

    public CellPhone(String pBrand, String pModel, String colour, int electricityUsage) {
        super(pBrand, pModel, electricityUsage);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public void print() {
        System.out.println("CellPhone");
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "colour='" + colour + '\'' +
                '}';
    }
}
