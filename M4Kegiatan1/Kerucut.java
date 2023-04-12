package M4Kegiatan1;

public class Kerucut extends BangunRuang{
    private double p;
    private float r, s, t;

    public Kerucut(double p, int r, int s, int t){
        this.p = p;
        this.r = r;
        this.s = s;
        this.t = t;
    }

    @Override
    float getLuasPermukaan(){
        return (float) ((p * r) * (r + s));
    }

    @Override
    float getVolume(){
        return (float) (0.3 * p * r * r * t);
    }
}
