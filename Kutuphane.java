import java.util.ArrayList;
     public class Kutuphane {
         private ArrayList<Uye> uyeListesi;
         private ArrayList<Kitap> kitapListesi;
         private ArrayList<Gorevli> gorevliListesi;

    public Kutuphane(){ //sınıfta nesne oluşturunca çağırılıyo
        uyeListesi= new ArrayList<>(); //depolama,tutma
        kitapListesi=new ArrayList<>();
        gorevliListesi=new ArrayList<>();
    }

    public void uyeEkle(Uye uye){
        uyeListesi.add(uye);
        System.out.println("üye eklendi:" + uye.getIsim());
    }
    public void kitapEkle(Kitap kitap){
        kitapListesi.add(kitap);
        System.out.println("kitap eklendi:" + kitap.getIsim());

    }
    public void gorevliEkle(Gorevli gorevli){
        gorevliListesi.add(gorevli);
        System.out.println("gorevli eklendi:" + gorevli.getIsim());
    }
    public void uyeSil(String uyeIsim){
      for (Uye uye : uyeListesi){ // değişken listedeki bir isme eşit mi diye dolaşıyor
          if (uye.getIsim().equals(uyeIsim)){ //equals iki karakter dizisini karşılaştırmak için kullanılır
           uye.uyeSil();
           uyeListesi.remove(uye);
           System.out.println("üye silindi:"+uyeIsim);
           return;
          }
          System.out.println("üye bulunamadı" + uyeIsim);
      }
    }
    public void kitapSil(String kitapIsim){
        for (Kitap kitap : kitapListesi){
            if (kitap.getIsim().equals(kitapIsim)){
                kitap.kitapSil();
                kitapListesi.remove(kitap);
                System.out.println("kitap silindi:" + kitapIsim);
                return;
            }
            System.out.println("kitap bulunamadı :" + kitapIsim);
        }
    }
    public void gorevliSil(String gorevliIsim){
        for (Gorevli gorevli : gorevliListesi) {
            if (gorevli.getIsim().equals(gorevliIsim)) {
                gorevli.gorevliSil();
                gorevliListesi.remove(gorevli);
                System.out.println("görevli silindi:" + gorevliIsim);
                return;
            }
        }
            System.out.println("görevli bulunamadı" + gorevliIsim);


    }


    public void listeleriGoster(){
     System.out.println("üye listesi:");
     for (Uye uye : uyeListesi){ //listede gezinme
         System.out.println("-" + uye.getIsim()); // her üyenin ismini yazdırıyor
     }
     System.out.println("kitap listesi:");
     for (Kitap kitap : kitapListesi){
         System.out.println("-" + kitap.getIsim());
     }
     System.out.println("görevli listesi:");
     for (Gorevli gorevli : gorevliListesi){
         System.out.println("-" + gorevli.getIsim());
     }
    }

}