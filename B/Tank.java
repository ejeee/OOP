package B;

public class Tank extends Hero{

	public Tank(String nama, String user, int level) {
		super.nama = nama;
		super.user = user;
		super.setLevel(level);
		super.setHP(7000 + (super.getLevel() * 200));
		super.setDefense(500 + (super.getLevel() * 15));
		super.setAttackDamage(500 + (super.getLevel() * 20));
	}
	
	@Override
	public void spawnIntro() {
		System.out.println(" Akulah sang Prabu!!");
	}
}
