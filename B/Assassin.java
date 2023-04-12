package B;

public class Assassin extends Hero implements CriticalDemage{
	
	public Assassin(String nama, String user, int level) {
		super.nama = nama;
		super.user = user;
		super.setLevel(level);
		super.setHP(3000 + (super.getLevel() * 90));
		super.setDefense(300 + (super.getLevel() * 15));
		super.setAttackDamage(800 + (800 * bonusDamage) + (super.getLevel() * 30));
	}
	
	@Override
	public void spawnIntro() {
		System.out.println("just prepare for your death");
	}


}
