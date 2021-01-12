package tugas;

public class GayaGesek extends Rumus {
    private double koefisien;
    private double gaya;

    public double getKoefisien() {
        return koefisien;
    }

    public void setKoefisien(double koefisien) {
        this.koefisien = koefisien;
    }

    public double getGaya() {
        return gaya;
    }

    public void setGaya(double gaya) {
        this.gaya = gaya;
    }
    
    @Override
    public double hitungGayaGesek(){
        return koefisien*gaya;
    }
}
