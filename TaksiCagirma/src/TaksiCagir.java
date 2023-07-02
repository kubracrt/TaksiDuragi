import java.util.Scanner;

public class TaksiCagir {

    public void taksicagir(int kapasite) {
        System.out.println("Taksi aranıyor....");
        System.out.println("Taksi bulundu.");
        kapasiteKontrol(kapasite);
    }

    public void kapasiteKontrol(int kapasite) {
        if (kapasite == 0) {
            System.out.println("Yanlış değer giriyorsunuz.");
        } else {
            System.out.println("Taksi müsait. İyi yolculuklar!");
        }
    }
}