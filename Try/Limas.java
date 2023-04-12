package Try;

public class Limas extends Persegi{
	public int t;
	 public Limas(int s, int t) {
		super(s);
		this.t = t;
	}

	 public double getVolume(){
	    return (int)(Math.pow(super.s, 2) * t /3);
	 }
}

