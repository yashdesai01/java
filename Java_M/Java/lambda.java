@FunctionalInterface
interface inter{
	abstract void display();
}
class lambda{
	public static void main(String[] args) {
		inter it = ()->{System.out.println("Interface Display Method");System.out.println("Hello");};	
		it.display();
	}
}