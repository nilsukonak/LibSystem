public class Uye extends Genel {
    public Uye(String uyeIsim){
        isimEkle(uyeIsim);
    }
    public void uyeSil(){
        isimCikar();
        System.out.println("uye silindi:" + getIsim());
    }

}