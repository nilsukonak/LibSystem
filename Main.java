import java.util.Scanner;
//Nilsu Konak
//1220505028
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in); //kullanıcıdan veri girmesini istediğimiz için system.in=standart klavye girişi
        Kutuphane kutuphane = new Kutuphane();


        while (true){
            System.out.println("1. üye ekle");
            System.out.println("2.kitap ekle");
            System.out.println("3.görevli ekle");
            System.out.println("4.üye sil");
            System.out.println("5.kitap sil");
            System.out.println("6.gorevli sil");
            System.out.println("7.listeleri göster");
            System.out.println("8. cıkıs yapın");

            int secim = scanner.nextInt();//nextInt() kullanıcıdan alınan değeri tamsayıya çevirir
            scanner.nextLine(); //kullanıcıdan alınan 1 satır veri

            switch (secim){
                case 1:
                    System.out.println("Ekleyeceğiniz üyenin ismini girin");
                    String uyeIsim = scanner.nextLine();
                    Uye uye = new Uye(uyeIsim);
                    kutuphane.uyeEkle(uye);
                    break;
                case 2:
                    System.out.println("ekleyeceğiniz görevlinin ismini giriniz:");
                    String gorevliIsim = scanner.nextLine();
                    Gorevli gorevli = new Gorevli(gorevliIsim);
                    kutuphane.gorevliEkle(gorevli);
                    break;
                case 3:
                    System.out.println("ekleyeceğiniz kitabın ismini giriniz:");
                    String kitapIsim = scanner.nextLine();
                    Kitap kitap= new Kitap(kitapIsim);
                    kutuphane.kitapEkle(kitap);
                    break;
                case 4:
                    System.out.println("sileceğiniz üyenin ismini giriniz:");
                    String silinecekUye = scanner.nextLine();
                    kutuphane.uyeSil(silinecekUye);
                    break;
                case 5:
                    System.out.println("sileceğiniz görevlinin ismini girin:");
                    String silinecekGorevli =scanner.nextLine();
                    kutuphane.gorevliSil(silinecekGorevli);
                    break;
                case 6:
                    System.out.println("sileceğiniz kitabın ismini giriniz:");
                    String silinecekKitao = scanner.nextLine();
                    kutuphane.kitapSil(silinecekKitao);
                    break;
                case 7:
                    kutuphane.listeleriGoster(); //ekledğim üyeleri listede gösteremedim
                    break;
                case 8:
                    System.out.println("çıkışş yapılıyor");
                    scanner.close();//scanner nesnesini kapattı
                    System.exit(0); //programı sonlandırdı
                    break;
                default:
                    System.out.println("geçersiz seçim yaptınız!");




            }

        }
    }
}