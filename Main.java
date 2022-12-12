public class Main {
	public static void main(String[] args) {
		Screen_time consume= new Screen_time(8);
		Phone_brand phone = new Phone_brand(consume);
		phone.setName("Vivo");
		phone.open();
	}
		
}
