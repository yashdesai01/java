class Outer{
	static int data=30;
	static class Inner{
		public void show(){
			System.out.println("Inner Class "+data);
		}
	}
	void show(){
		System.out.println("Outer Class");
	}
}
class NestedClass{
	public static void main(String[] args) {
		//Outer ot = new Outer();
		Outer.Inner in = new Outer.Inner();
		in.show();
		//ot.show();
	}
}