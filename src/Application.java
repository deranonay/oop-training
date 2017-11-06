/**
 * Created by deran on 06/11/2017.
 */
public class Application {

    public static void main(String[] args) {

        CellPhone c1 = new CellPhone("Apple", "5s", "black", 30);
        Television t1 = new Television("Samsung", "x760", 250);

        ElectricityCalculator calc = new ElectricityCalculator();
        int total = calc.totalElectricityUsage(c1, t1);
        System.out.println(total);
    }
}
