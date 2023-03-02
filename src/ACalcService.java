public class ACalcService {
    public double calculateA (double credit, double year, double bin) {
        double result = credit * bin / 100 * Math.pow ( 1 + bin / 100, year * 12);
        return result;
    }
}
