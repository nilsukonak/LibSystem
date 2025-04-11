
public class Gorevli extends Genel{
    public Gorevli(String gorevliIsim){
        isimEkle(gorevliIsim);
    }
    public void gorevliSil(){
        isimCikar();
        System.out.println("görevli silindi:" + getIsim());
    }
}