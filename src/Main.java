import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner (System.in);
        int row, column;
        System.out.println("Mayın Tarlasına Hoşgeldiniz !");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz !");
        System.out.print("Satır Sayısı : ");
        //row = scan.nextInt ();
        System.out.print("Sütun Sayısı");
        //column = scan.nextInt ();

        MayinTarlasi mayin = new MayinTarlasi(2,2);
        mayin.run();
    }
}