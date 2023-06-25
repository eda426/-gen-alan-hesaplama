import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
  int x,y,z,u,alan;
        Scanner girdi=new Scanner(System.in);
        System.out.println("birinci kenarı giriniz:");
        x=girdi.nextInt();
        System.out.println("ikinci kenarı giriniz:");
        y=girdi.nextInt();
        System.out.println("Üçüncü kenarı giriniz");
        z=girdi.nextInt();
 u=(x+y+z)/2;

alan=(int)Math.sqrt(u*(u-x)*(u-y)*(u-z));
System.out.println("alan:"+alan);
        }
    }
