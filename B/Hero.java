package B;

//abstract class
public abstract class Hero {
	private double healthPoint;
	private double attackDamage;
	private double defense;
	private int level;
	private boolean lifeStatus = true;
	
	private double remainingHP;
	protected String user;
	protected String nama;
	private Hero target;
	private double totalDamage;
	
	public Hero getHero() {
		return this.target;
	}
	
	public boolean getLifeStatus() {
		return this.lifeStatus;
	}
	
	public void setLifeStatus(boolean lifeStatus) {
		this.lifeStatus = lifeStatus;
	}
	
	public void setHP(double healthPoint) {
		this.healthPoint = healthPoint;
	}
	
	public double getHP() {
		return this.healthPoint;
	}
	
	public void setDefense(double defense) {
		this.defense = defense;
	}
	
	public double getDefense() {
		return this.defense;
	}
	
	public void setAttackDamage(double attackDamage) {
		this.attackDamage = attackDamage;
	}
	
	public double getAttackDamage() {
		return this.attackDamage;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	//beres
	public void checkStatus() {//concrete method
		//menampilkan data player 1 karakter berdasarkan level
		System.out.println("\n === " + this.nama + " ===");
		System.out.println("Role  : " + this.user);
		System.out.println("Level : " + this.level + "\n");
		System.out.println("Attack Damage  : " + this.getAttackDamage());
		System.out.println("Health Point   : " + this.getHP());
		if(this.getHP() < 0 && this.getHP() == 0) {
			target.lifeStatus = false;
			System.out.println("Life Status    : " + this.lifeStatus);
		}else {
			this.lifeStatus = true;
			System.out.println("Life Status    : " + this.lifeStatus);
		}
		System.out.println("Defense        : " + this.getDefense());	
	}
	
	public abstract void spawnIntro();

	//untuk target
	public void attack(Hero target) {//concrete method
		this.target = target;
		
		System.out.println("-- " + this.nama + " ("+ this.user + ")" + " Turn --");
		this.spawnIntro();
		//menampilkan demamage si penyerang
		System.out.println(this.nama + " attack " + target.nama + " with " + this.attackDamage);
		
		this.attackDamage = this.getAttackDamage();
		target.defense = target.getDefense();
		target.reviewDamage(this.attackDamage, target.defense);
		
		double maxHP = 0;
		//untuk mengambil darah sisa
		if(target.getRemainingHp() > 0) {
			maxHP = target.getRemainingHp();
		}else {
			maxHP = 0;
		}
		System.out.println(target.nama + " HP Remaining " + maxHP);

		//mengecek kematian
		if(target.getRemainingHp() <= 0 || target.getRemainingHp() == 0) {
			target.lifeStatus = false;
			target.remainingHP  = 0;
			System.out.println("\n \n" + target.user + " is dead");
			System.out.println(this.nama + " HP Remaining : " + this.remainingHP);
			System.out.println(this.nama + " WIN THE GAME");		
		}else {
			target.lifeStatus = true;
		}	
	}
	//method untuk menghitung demage yang diterima
		private void reviewDamage(double attackDamage, double defense) {
			
			double realDamage = 0;
			//untuk menyerang target
			if(attackDamage > defense) {
				realDamage = (attackDamage - defense);
			}else if((attackDamage < defense) || (attackDamage == defense)){
				realDamage = 0;
			}
			//demage keseluruhan
			System.out.println("Total damage menjadi " + realDamage);
			totalDamage += realDamage;
			setRemainingHP(this.getHP() - totalDamage);
		
	}	
		public void setRemainingHP(double remainingHP) {
			this.remainingHP = remainingHP;
		}
		
		public double getRemainingHp() {
			return this.remainingHP;
		}
}
