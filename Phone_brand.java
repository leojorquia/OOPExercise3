public class Phone_brand {
	Screen_time consume;
	String name;
	
	public Phone_brand(Screen_time consume) {
		this.consume=consume;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public boolean open() {
		if(consume.getScreentime() < 5) {
			System.out.println("The phone "+name+" consumes a screen time of " +consume.getScreentime()+" hours");
			return true;
		}
		System.out.println("The phone "+name+" consumes a screen time of " +consume.getScreentime()+" hours");
		System.out.println("Your Screen time is too long please minimize the use of your phone.");
		return false;
	}
	
}
