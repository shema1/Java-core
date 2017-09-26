package java_core_4_homework;

public class Weapon {
	String type;
	int damage;
	
	
	public Weapon(String type, int damage) {
		super();
		this.type = type;
		this.damage = damage;
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	@Override
	public String toString() {
		return "Weapon [type=" + type + ", damage=" + damage + "]";
	}
	
	

}
