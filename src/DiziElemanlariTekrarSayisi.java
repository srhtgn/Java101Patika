import java.util.HashMap;
public class DiziElemanlariTekrarSayisi {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20, 5};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int element : array) {
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }

        for (int element : frequencyMap.keySet()) {
            System.out.println(element + " sayısı " + frequencyMap.get(element) + " kere tekrar edildi.");
        }
    }
}
