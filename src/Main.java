public class Main {
    public static void main(String[] args) {

        ACalcService serviceA = new ACalcService();
        BCalcService serviceB = new BCalcService();
        double a = serviceA.calculateA(1_000_000, 2, 9.9 / 12);  // числитель формулы

        double b = serviceB.calculateB(1_000_000, 2, 9.9 / 12);  // знаменатель

        double payment = a / b;  // аннуитетный платеж
        System.out.println("Ежемесячный платеж: " + payment + " руб.");
    }

}