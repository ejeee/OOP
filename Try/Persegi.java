package Try;

public class Persegi implements BangunDatar{
	 public int s;

	    public Persegi(int s){
	        this.s = s;
	    }

		@Override
	    public double Luas(){
	        return (int)(Math.pow(s, 2));
	    }

	    @Override
	    public double Keliling(){
	        return (int)(4 * s);
	    }
}
