public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 98;
        double heightInMeters = 1.87;
        int bodyMassIndex = service.calculate(weightInKg, heightInMeters); //index
        System.out.println(bodyMassIndex);
    }
}