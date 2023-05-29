public class BmiService {
    public int calculate(double kilogram, double meter) {

        double index = kilogram / (meter * meter);

        return (int) index;
    }
}
