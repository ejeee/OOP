package Try;

public class Lingkaran implements BangunDatar{ //
	 public int r;

	    public Lingkaran(int r){
	        this.r = r;
	    }

	    @Override
	    public double Luas(){
	        return (int)(Math.PI * Math.pow(r, 2));
	    }

	    @Override
	    public double Keliling(){
	        return (int)(4 * Math.PI * r);
	    }
}
