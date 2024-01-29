import java.util.HashMap;

public class DizidekiTekrarEdenCiftSayilar {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 3, 3, 6, 4, 7, 8, 6, 9, 10, 10};

        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                countMap.put(number, countMap.getOrDefault(number, 0) + 1);
            }
        }

        System.out.println("Tekrar eden çift sayılar:");
        for (int number : countMap.keySet()) {
            int count = countMap.get(number);
            if (count > 1) {
                System.out.println(number + " (tekrar sayısı: " + count + ")");
            }
        }
    }
}
