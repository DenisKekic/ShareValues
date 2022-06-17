public class StockValue implements Comparable<StockValue>{
    private int anzAktien;
    private String nameAktie;
    private double aktienKurs;

    public StockValue(String nameAktie, int anzAktien, double aktienKurs) {
        this.anzAktien = anzAktien;
        this.nameAktie = nameAktie;
        this.aktienKurs = aktienKurs;
    }

    public double getAktienKurs() {
        return aktienKurs;
    }

    public int getAnzAktien() {
        return anzAktien;
    }

    public String getNameAktie() {
        return nameAktie;
    }

    @Override
    public int compareTo(StockValue o) {
        return -o.getNameAktie().compareTo(this.getNameAktie());
    }
}
