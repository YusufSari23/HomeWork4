import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r, a;
        double pi = 3.14;

        System.out.print("Dairenin Yarı Çapını Giriniz : ");
        r = input.nextInt();
        System.out.print("Daire Diliminin Ölçüsünü Giriniz : ");
        a = input.nextInt();
        double alan = (pi * r * r);
        double cevre = (2 * pi * r);
        double dilimAlani = (pi * (r * r) * a) / 360;
        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);
        System.out.println("Daire Dilimin Alanı " + dilimAlani);
    }
}