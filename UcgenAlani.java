import java.util.Scanner;

public class UcgenAlani {

    //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan program.
       public static void main(String[] args) {

           /*üç kenarın uzunluklarını tanımlayabilmemiz için üç adet int değişken atıyoruz.
           Çevresini hesaplamak için de bir int türünde değişken atıyoruz. Alanı için de bu
           sefer ondalıklı sayı çıkma olasılığı yüksek olduğundan double türünde bir değişken
           daha atıyoruz.
            */
           int a, b, c, cevresi;
           double ucgenAlani;

            /* Kullanıcıdan alanı hesaplanacak üçgenin üç kenar uzunluklarının girilmesini
            ve girilen değerlerin kenar değişkenlerine atamalarını yapıyoruz.
             */
           Scanner aKenari = new Scanner(System.in);
           System.out.print(" Üçgenin 1. Kenar uzunluğunu giriniz: ");
           a = aKenari.nextInt();
           Scanner bKenari = new Scanner(System.in);
           System.out.print(" Üçgenin 2. Kenar uzunluğunu giriniz: ");
           b = bKenari.nextInt();
           Scanner cKenari = new Scanner(System.in);
           System.out.print(" Üçgenin 3. Kenar uzunluğunu giriniz: ");
           c = cKenari.nextInt();

           // Değerleri girilen üçgenin çevresini burada hesaplıyoruz.
           cevresi = (a + b + c) /2 ;

           // Burada Üçgenin alanını hesaplıyoruz.
           ucgenAlani = Math.sqrt(cevresi * (cevresi-a) * (cevresi-b) * (cevresi-c));

           /* Burada üçgenin kenar uzunluklarını, üçgenin çevresini, üçgenin alanını kullanıcıya
           bildirmek üzere ekrana yazdırıyoruz.
            */
           System.out.println("Alanı hesaplanacak üçgenin a kenarı : " + (a));
           System.out.println("Alanı hesaplanacak üçgenin b kenarı : " + (b));
           System.out.println("Alanı hesaplanacak üçgenin c kenarı : " + (c));
           System.out.println("Alanı hesaplanacak üçgenin çevresi  : " + (cevresi));
           System.out.println("Üçgenin Alanı                       : " + (ucgenAlani));




    }

}
