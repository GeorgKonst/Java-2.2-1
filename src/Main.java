public class Main {
    public static void main(String[] args) {
        BonusMileService service = new BonusMileService();
        int price = 10_000;
        //Не совсем понял какую сумму дают в ДЗ, моя программа высчитывает мили из сумму 100р 00 копеек
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}