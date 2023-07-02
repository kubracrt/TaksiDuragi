public abstract class TaksiUcretHesaplama {
    protected int kmbası;
    protected int taksimetreAcilis;

    public abstract void hesapla(int km, int kupon);

    public void setKmbası(int kmbası) {
        this.kmbası = kmbası;
    }

    public void setTaksimetreAcilis(int taksimetreAcilis) {
        this.taksimetreAcilis = taksimetreAcilis;
    }
}
