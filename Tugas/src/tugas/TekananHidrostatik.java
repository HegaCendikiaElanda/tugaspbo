package tugas;

public class TekananHidrostatik extends Rumus{
    private double massaJenis;
    private double gravitasi;
    private double jarak;

    public double getMassaJenis() {
        return massaJenis;
    }

    public void setMassaJenis(double massaJenis) {
        this.massaJenis = massaJenis;
    }

    public double getGravitasi() {
        return gravitasi;
    }

    public void setGravitasi(double gravitasi) {
        this.gravitasi = gravitasi;
    }

    public double getJarak() {
        return jarak;
    }

    public void setJarak(double jarak) {
        this.jarak = jarak;
    }
    
    @Override
    public double hitungTekananHidrostatik(){
        return massaJenis*gravitasi*jarak;
    }
}
