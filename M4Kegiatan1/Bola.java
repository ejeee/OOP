package M4Kegiatan1;

public class Bola extends BangunRuang {
    private double p;
    private float r;

    public Bola(double p, int r){
        this.p = p;
        this.r = r;
    }
    
    @Override
    float getLuasPermukaan(){
        return (float)(4 * p * r * r);
    }

    @Override
    float getVolume(){
        return (float)(1.3 * p * r * r * r);
    }
}
