package tugas;

public class Tekanan extends Rumus{
    private double luas;
    private double tekanan;

    public double getVolume() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }
    
    public double getTekanan() {
        return tekanan;
    }

    public void setTekanan(double tekanan) {
        this.tekanan = tekanan;
    }
    
    @Override
    public double hitungTekanan(){
       return tekanan * luas;
    }
}
