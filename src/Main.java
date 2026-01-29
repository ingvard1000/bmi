import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        double weight = 98;
        double index = service.calculate(height, weight);

        System.out.println("ваш рост " + height + " метра/ов");
        System.out.println("ваш вес " + weight + " килограмм");
        System.out.println("индекс массы тела " + index);
    }
}