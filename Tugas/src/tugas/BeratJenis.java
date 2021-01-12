package tugas;

public class BeratJenis extends Rumus{
    
    private double beratBenda;
    private double volume;

    public double getBeratBenda() {
        return beratBenda;
    }

    public void setBeratBenda(double beratbenda) {
        this.beratBenda = beratbenda;
    }

    public double getGaya() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    @Override
    public double hitungBeratJenis(){
        return beratBenda*volume;
    }
}
