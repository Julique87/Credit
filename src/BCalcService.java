public class BCalcService {
    public double calculateB(double credit, double year, double bin) {
        double result = Math.pow(1 + bin / 100, year * 12) - 1;
        return result;
    }
}