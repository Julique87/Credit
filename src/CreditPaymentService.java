public class CreditPaymentService {
    public double calculate(double credit, double year, double bin) {
        double result =  credit * ( bin / 100 * Math.pow ( 1 + bin / 100, year * 12) / (Math.pow ( 1 + bin / 100, year * 12) - 1));
        return result;
    }
}

