package Try;

public class Tabung extends Lingkaran{
	public int t;
	 public Tabung(int r, int t) {
		super(r);
		this.t = t;
	}

	    public double getVolume(){
	        return (int)(Math.PI* Math.pow(r,2) * t);
}
	    }
	    
