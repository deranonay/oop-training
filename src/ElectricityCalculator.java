/**
 * Created by deran on 06/11/2017.
 */
public class ElectricityCalculator {

    public int totalElectricityUsage(Electronics... electronics) {
        int total = 0;
        for (Electronics e : electronics) {
            total += e.getElectrictyUsage();
        }

        return total;
    }
}
