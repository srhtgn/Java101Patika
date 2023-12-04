public class BirYuzArasindakiAsalSayilar {
    public static void main(String[] args) {
        System.out.println("1 - 100 arasındaki asal sayılar:");
        printAsalSayilar(1, 100);
    }
    public static void printAsalSayilar(int baslangic, int bitis) {
        for (int i = baslangic; i <= bitis; i++) {
            if (isAsal(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isAsal(int sayi) {
        if (sayi <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }

        return true;
    }
}