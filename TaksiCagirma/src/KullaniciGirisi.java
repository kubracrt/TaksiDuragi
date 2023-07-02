public class KullaniciGirisi {
    private String ad;
    private String soyad;
    private String telno;
    private String eposta;

    public KullaniciGirisi(KullaniciGirisiBuilder ob) {
        this.ad = ad;
        this.soyad = soyad;
        this.telno = telno;
        this.eposta = eposta;
    }


    public static class KullaniciGirisiBuilder {
        private String ad;
        private String soyad;
        private String telno;
        private String eposta;

        public KullaniciGirisiBuilder(String ad, String telno) {
            this.ad = ad;
            this.telno = telno;
        }

        public KullaniciGirisiBuilder soyad(String soyad) {
            this.soyad = soyad;
            return this;
        }

        public KullaniciGirisiBuilder epost(String eposta) {
            this.eposta = eposta;
            return this;
        }

        public KullaniciGirisi build() {
            return new KullaniciGirisi(this);
        }
    }

}
