@FunctionalInterface
interface inter{
	abstract void display();
}
public class funifacedemo{
	void disp(){
		System.out.println("Display Method");
	}
	public static void main(String[] args) {
		//inter it = ()->funifacedemo.display();	
		//it.display();
		funifacedemo fid = new funifacedemo();
		inter it = fid::disp;
		it.display();
	}
}