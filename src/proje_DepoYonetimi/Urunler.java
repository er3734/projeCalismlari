package proje_DepoYonetimi;

public class Urunler {
    private  int id;
    private  String urunIsmi;
    private  String ureticisi;
    private  int miktar;
    private  String birim;
    private  String raf;

    public Urunler() {
    }

    public Urunler(String urunIsmi, String ureticisi, int miktar, String birim, String raf) {
        this.urunIsmi = urunIsmi;
        this.ureticisi = ureticisi;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUreticisi() {
        return ureticisi;
    }

    public void setUreticisi(String ureticisi) {
        this.ureticisi = ureticisi;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "Urunlerimiz" +

                ", urunIsmi='" + urunIsmi + '\'' +
                ", ureticisi='" + ureticisi + '\'' +
                ", miktar=" + miktar +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\'';
    }
}
