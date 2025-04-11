import java.util.ArrayList;
import java.util.Scanner;

public class Genel {
    private String isim;
    private static ArrayList<String> isimListesi=new ArrayList<>();

    public void ismiGoster(){
        System.out.println("isim:" +getIsim()); //isim özelliğini ekrana yazdırıyo

    }
    public void isimEkle(String yeniIsim){
        isimListesi.add(yeniIsim);
    }
    public void isimCikar(){
        isimListesi.remove(this.getIsim());
    }
    public static ArrayList<String> getIsimListesi(){
        return isimListesi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim; //isim özelliğine sınıf içindeki isim değişkenin değerini atar
    }
}


