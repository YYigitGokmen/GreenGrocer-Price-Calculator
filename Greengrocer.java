





import java.util.Date;
import java.util.Scanner;


public class Greengrocer {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


double armut = 2.14;
double armutkg;


double elma = 3.67;
double elmakg;

double domates = 1.11;
double domateskg;

double muz = 0.95;
double muzkg;


double patlican = 5.00;
double patlicankg;

double toplam;

        System.out.print("Lüften Armutun Kilosunu Giriniz: ");
        armutkg= input.nextDouble();

        Scanner output = new Scanner(System.in);
        System.out.print("Lüften Elmanın Kilosunu Giriniz: ");
        elmakg= input.nextDouble();

         Scanner output2 = new Scanner(System.in);
        System.out.print("Lüften Domatesin Kilosunu Giriniz: ");
        domateskg= input.nextDouble();


        Scanner output3 = new Scanner(System.in);
        System.out.print("Lüften Muzun Kilosunu Giriniz: ");
        muzkg= input.nextDouble();

        Scanner output4 = new Scanner(System.in);
        System.out.print("Lüften Patlıcan Kilosunu Giriniz: ");
       patlicankg= input.nextDouble();

toplam = ( (armut*armutkg)+((elma*elmakg)+(domates*domateskg)+(muz*muzkg)+(patlican*patlicankg)) );

    System.out.println("Toplam Tutar: "+toplam);
}

}
