import java.util.Scanner;
public class sad {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
 int n1, n2,sel;

 System.out.print("Lütfen işlem yapmak istediginiz ilk sayıyı giriniz :");
 n1 = input.nextInt();
 System.out.print("Lütfen işlem yapmak istediginiz ikiniz sayıyı giriniz :");
 n2 = input.nextInt();

 System.out.print("\n1-toplama\n2-çıkarma\n3-çarpma\n4-bölme\nİşlem yapmak istediginiz sayıyı giriniz :");
 sel = input.nextInt();
 switch (sel) {
     case 1:
         System.out.println("sonuç :" +  (n1 + n2));
         break;
     case 2:
         System.out.println("sonuç :" +  (n1 - n2));
         break;
     case 3:
         System.out.println("sonuç :" +  (n1 * n2));
         break;

     case 4:
         if (n2 == 0){
System.out.print("Bir sayı 0 a bölünemez");
break; }
         System.out.print("Sonuç :" +  n1 / n2);
         break;
     default:
         System.out.print("Yanlış seçim yaptınız");





 }




    }
}
