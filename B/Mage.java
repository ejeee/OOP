package B;

public class Mage extends Hero implements MagicalDamage{
	
	public Mage(String nama, String user, int level) {
		super.nama = nama;
		super.user = user;
		super.setLevel(level);
		super.setHP(2500 + (super.getLevel() * 85));
		super.setDefense(200 + (super.getLevel() * 10));
		super.setAttackDamage(700 + (700 * magicDamageBonus) + (super.getLevel() * 35));
	}
	
	@Override
	public void spawnIntro() {
		System.out.println("I will give you damage and bye !!");
	}
}
