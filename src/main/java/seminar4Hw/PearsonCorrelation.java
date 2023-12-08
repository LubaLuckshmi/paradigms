package seminar4Hw;
import java.util.Arrays;

public class PearsonCorrelation {

    public static void main(String[] args) {
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {2, 3, 4, 5, 6};

        double correlation = calculatePearsonCorrelation(x, y);
        System.out.println("Pearson correlation coefficient: " + correlation);
    }

    public static double calculatePearsonCorrelation(double[] x, double[] y) {
        double meanX = getMean(x);
        double meanY = getMean(y);

        double sumXY = 0;
        double sumX2 = 0;
        double sumY2 = 0;

        for (int i = 0; i < x.length; i++) {
            sumXY += (x[i] - meanX) * (y[i] - meanY);
            sumX2 += Math.pow((x[i] - meanX), 2);
            sumY2 += Math.pow((y[i] - meanY), 2);
        }

        double correlation = sumXY / Math.sqrt(sumX2 * sumY2);
        return correlation;
    }

    private static double getMean(double[] data) {
        return Arrays.stream(data).average().orElse(0.0);
    }
}