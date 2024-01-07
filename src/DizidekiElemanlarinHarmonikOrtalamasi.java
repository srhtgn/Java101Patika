public class DizidekiElemanlarinHarmonikOrtalamasi {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5};
        double harmonicSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            harmonicSum += 1.0 / numbers[i];
        }

        double harmonicAverage = numbers.length / harmonicSum;

        System.out.println("Harmonik Ortalama: " + harmonicAverage);
    }
}
