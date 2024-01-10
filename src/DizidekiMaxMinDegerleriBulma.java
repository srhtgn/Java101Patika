import java.util.Arrays;
public class DizidekiMaxMinDegerleriBulma {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int targetNumber = 500;

        Arrays.sort(list);

        int smaller = findClosestSmaller(list, targetNumber);

        int larger = findClosestLarger(list, targetNumber);

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + smaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + larger);
    }

    private static int findClosestSmaller(int[] array, int target) {
        int result = Integer.MIN_VALUE;

        for (int i : array) {
            if (i >= target) {
                break;
            }
            result = i;
        }

        return result;
    }
    private static int findClosestLarger(int[] array, int target) {
        int result = Integer.MAX_VALUE;

        for (int i : array) {
            if (i > target) {
                result = i;
                break;
            }
        }

        return result;
    }
}
