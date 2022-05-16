public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        long actual = service.calculate(1000_60, true);
        long expected = 30;

        System.out.println("ОР: " + expected + ", ФР: " + actual);
    }
}
