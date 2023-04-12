package B;

public class Main {

	public static void main(String[] args) {
		//object assasin
		//polimorphisme
		Hero assassin = new Assassin("Lancelot", "Assasin", 2);
		Hero tank = new Tank("Gatot Kaca", "Tank", 3);
		//Hero mage = new Mage("Aurora", "Mage", 5);
		
		assassin.checkStatus();
		tank.checkStatus();
		
		int round = 1;
		int up = 0;
		
		do {
			System.out.println("\n \n     ~~~~~ FIGHT ~~~~~");
			System.out.println("--------- Round " + round ++ + "---------");
		tank.attack(assassin); //mengambil method attack yang mentarget assassin
		assassin.attack(tank);
		 if(assassin.getRemainingHp()==0 && assassin.getRemainingHp() <= 0){
	            assassin.setLifeStatus(false);
	       }else if(tank.getRemainingHp()==0 && tank.getRemainingHp() <= 0){
	            tank.setLifeStatus(false);
	       }
	       up++;
	    }while((tank.getLifeStatus() == true && assassin.getLifeStatus() == true) || (tank.getLifeStatus() != false && assassin.getLifeStatus() != false));
	}
}
