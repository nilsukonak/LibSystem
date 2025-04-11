
public class Kitap extends Genel{
    public Kitap(String kitapIsim){
        isimEkle(kitapIsim);
    }
    public void kitapSil(){
        isimCikar();
        System.out.println("kitap silindi :" + getIsim());
    }
}