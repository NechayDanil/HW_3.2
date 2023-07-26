public class Main {
    public static void main(String[] args) {
        BmiService BmiService = new BmiService();
        double weight = 60; // масса в кг
        double height = 1.60; // рост в метрах
        int index = BmiService.calculate(height,weight);
        System.out.println("индекс" + index);

    }
}