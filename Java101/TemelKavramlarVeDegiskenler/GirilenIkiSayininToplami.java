package TemelKavramlarVeDegiskenler;
import java.util.Scanner;

public class GirilenIkiSayininToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.println("A sayısını giriniz : ");
        a = input.nextInt();

        System.out.println("B sayısını giriniz : ");
        b = input.nextInt();

        System.out.println("A Sayısı : " + a);
        System.out.println("B Sayısı : " + b);
        int i = a + b;
        System.out.println("Toplamları : "+  i);

        input.close();
    }
}
