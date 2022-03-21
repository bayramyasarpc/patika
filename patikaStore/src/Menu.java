import java.util.Scanner;

public class Menu {

    public static void menu(){
        Scanner input=new Scanner(System.in);



        Markalar markalar=new Markalar();
        while(true) {
            System.out.println("Patika Store Urun Yonetim Paneli!");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefon İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz : ");
            int val=input.nextInt();

            switch (val) {
                case 1:
                    Urun.islemler(1);
                    break;
                case 2:
                    Urun.islemler(2);
                    break;
                case 3:
                    System.out.println("Markalarımız");
                    System.out.println("-------------");
                    markalar.ekleme();
                    markalar.printList();
                    break;
                case 0:
                    break;

            }
        }
    }
}
