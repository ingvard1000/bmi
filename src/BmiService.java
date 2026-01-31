public class BmiService {
    public int calculate(double height, double weight) {
        double index = weight / (height * height);
        int BMI = (int) index;
        return BMI;
    }
}
