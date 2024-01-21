package Cases;
/**
 * Tentukan mean, median, dan modus dari deret berikut. Jika ada lebih dari 2 modus, ambil angka yang nilainya paling kecil
 * 8 7 0 2 7 1 7 6 3 0 7 1 3 4 6 1 6 4 3
 */


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Statistic {

    public static void main(String[] args) {
        double[] dataSet = {8, 7, 0, 2, 7, 1, 7, 6, 3, 0, 7, 1, 3, 4, 6, 1, 6, 4, 3};
        statistic(dataSet);
    }

    private static double calculateMean(double[] dataSet) {
        double sum = 0;
        for (double value : dataSet) {
            sum += value;
        }
        return sum / dataSet.length;
    }

    private static double calculateMedian(double[] dataSet) {
        Arrays.sort(dataSet);
        int n = dataSet.length;

        if (n % 2 != 0) {
            return dataSet[n / 2];
        } else {
            return (dataSet[n / 2 - 1] + dataSet[n / 2]) / 2.0;
        }
    }

    private static double[] calculateMode(double[] dataSet) {
        Map<Double, Integer> frequencyMap = new HashMap<>();

        for (double value : dataSet) {
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }

        double maxFrequency = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        if (maxFrequency == 1) {
            return new double[0];
        }

        int modeCount = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency == maxFrequency) {
                modeCount++;
            }
        }

        double[] mode = new double[modeCount];
        int index = 0;
        for (Map.Entry<Double, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                mode[index++] = entry.getKey();
            }
        }

        return mode;
    }

    public static void statistic(double[] input){
        double mean = calculateMean(input);
        double median = calculateMedian(input);
        double[] mode = calculateMode(input);
        System.out.println("Mean: " + mean
                            + " Median: " + median
                            + " Mode: " + mode[0]);
    }
}

