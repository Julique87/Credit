public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService() ;

        double payment = service.calculate(1_000_000, 2,  9.9 / 12);
        System.out.println("Ежемесячный платеж: " + payment);
    }
}