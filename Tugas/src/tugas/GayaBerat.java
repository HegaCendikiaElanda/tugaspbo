package tugas;

public class GayaBerat extends Rumus{
    
    private double volume;
    private double gravitasi;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getGravitasi() {
        return gravitasi;
    }

    public void setGravitasi(double gravitasi) {
        this.gravitasi = gravitasi;
    }
    
    @Override
    public double hitungGayaBerat(){
       return volume * gravitasi;
    }
}
