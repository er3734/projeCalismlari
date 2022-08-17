package proje_Cuneyt;

public class Depo {
    String name;
    String frekans;

    public Depo(String name, String frekans) {
        this.name = name;
        this.frekans = frekans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrekans() {
        return frekans;
    }

    public void setFrekans(String frekans) {
        this.frekans = frekans;
    }

    @Override
    public String toString() {
        return "Depo{" +
                "Kanalın İsmi='" + name + '\'' +
                ", Kanalın frekansı='" + frekans + '\'' +
                '}';
    }
}
