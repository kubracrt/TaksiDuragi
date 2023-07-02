import java.util.Scanner;

class SariTaksi extends TaksiCagir {
    SariTaksiUcretHesaplama sariTaksiUcretHesaplama = new SariTaksiUcretHesaplama();
    IndirimKodu indirimKodu=new IndirimKodu();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void taksicagir(int kapasite) {
        System.out.println("Sarı taksi çağırıldı.");
        super.kapasiteKontrol(kapasite);

        System.out.println("Lütfen indirim kodunu giriniz:");
        indirimKodu.varMı();
        int kupon = indirimKodu.indirimDondur();

        System.out.print("Lütfen kaç kilometre yolculuk yapmak istediğinizi giriniz: ");
        int km = scanner.nextInt();

        sariTaksiUcretHesaplama.hesapla(km, kupon);
    }
}