import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int mat,fizik,kimya,turkce,tarih,muzik;

    Scanner inp= new Scanner(System.in);

    System.out.println("Matematik notunuz: ");
    mat = inp.nextInt();

        System.out.println("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.println("Türkçe notunuz: ");
        turkce = inp.nextInt();

        System.out.println("Tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.println("Müzik notunuz: ");
        muzik = inp.nextInt();

        double a = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.print("Not Ortalamanız : ");
        System.out.println(a);

        String durum = a > 60 ? "Geçtiniz" : "Kaldınız";
        System.out.println(durum);





    }
}