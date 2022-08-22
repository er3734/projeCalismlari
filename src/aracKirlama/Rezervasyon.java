package aracKirlama;

public class Rezervasyon {

    private String alinacakSehir;
    private String tesliEdilecekGun;
    ;

    private Integer alinacakGun;
    private Integer teslimGun;

    private double alısSaati;
    private double teslimSaati;

    public Rezervasyon(String alinacakSehir, Integer alinacakGun, Integer teslimGun, double alısSaati, double teslimSaati) {
        this.alinacakSehir = alinacakSehir;
        this.tesliEdilecekGun = tesliEdilecekGun;
        this.alinacakGun = alinacakGun;
        this.teslimGun = teslimGun;
        this.alısSaati = alısSaati;
        this.teslimSaati = teslimSaati;
    }

    public String getAlinacakSehir() {
        return alinacakSehir;
    }

    public void setAlinacakSehir(String alinacakSehir) {
        this.alinacakSehir = alinacakSehir;
    }

    public String getTesliEdilecekGun() {
        return tesliEdilecekGun;
    }

    public void setTesliEdilecekGun(String tesliEdilecekGun) {
        this.tesliEdilecekGun = tesliEdilecekGun;
    }

    public Integer getAlinacakGun() {
        return alinacakGun;
    }

    public void setAlinacakGun(Integer alinacakGun) {
        this.alinacakGun = alinacakGun;
    }

    public Integer getTeslimGun() {
        return teslimGun;
    }

    public void setTeslimGun(Integer teslimGun) {
        this.teslimGun = teslimGun;
    }

    public double getAlısSaati() {
        return alısSaati;
    }

    public void setAlısSaati(double alısSaati) {
        this.alısSaati = alısSaati;
    }

    public double getTeslimSaati() {
        return teslimSaati;
    }

    public void setTeslimSaati(double teslimSaati) {
        this.teslimSaati = teslimSaati;
    }

    @Override
    public String toString() {
        return "Rezervasyon{" +
                "alinacakSehir='" + alinacakSehir + '\'' +
                ", tesliEdilecekGun='" + tesliEdilecekGun + '\'' +
                ", alinacakGun='" + alinacakGun + '\'' +
                ", teslimGun='" + teslimGun + '\'' +
                ", alısSaati=" + alısSaati +
                ", teslimSaati=" + teslimSaati +
                '}';
    }
}
