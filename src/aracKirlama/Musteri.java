package aracKirlama;

public class Musteri {


    private String ad;
    private String soayd;
    private String yas;
    private String telefon;
    private String ehliyet;

    int Sifre=3734;

    public Musteri(String ad, String soayd, String yas, String telefon, String ehliyet) {
        this.ad = ad;
        this.soayd = soayd;
        this.yas = yas;
        this.telefon = telefon;
        this.ehliyet = ehliyet;
    }


    public int getSifre() {
        return Sifre;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoayd() {
        return soayd;
    }

    public void setSoayd(String soayd) {
        this.soayd = soayd;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEhliyet() {
        return ehliyet;
    }

    public void setEhliyet(String ehliyet) {
        this.ehliyet = ehliyet;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                ", ad='" + ad + '\'' +
                ", soayd='" + soayd + '\'' +
                ", yas='" + yas + '\'' +
                ", telefon='" + telefon + '\'' +
                ", ehliyet='" + ehliyet + '\'' +
                '}';
    }
}
