import java.util.Date;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Taksiler taksiler = new Taksiler();
        System.out.println("İstanbul Durağı'na hoşgeldiniz.");
        KullaniciGirisi giris = new KullaniciGirisi.KullaniciGirisiBuilder("Beyza", "05559997766").build();
        taksiler.Taksilerimiz();


    }
}
