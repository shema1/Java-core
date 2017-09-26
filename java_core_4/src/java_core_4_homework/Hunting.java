package java_core_4_homework;

public class Hunting {
	
	public Hunting(){
		
	}
	Weapon weapon = new Weapon("ak47",100);
//	Weapon []weapon = {new Weapon("a", 10), new Weapon("b", 11), new Weapon("c", 13)};
	Hunter hunter = new Hunter("Oleh", "Bik", 54);
	
	
	
	
	public void gweapon(){
		if(hunter.weapon == null){
			hunter.setWeapon(weapon);
			
		}
		
		
	}
	
	
	
	
	
	
	




}
