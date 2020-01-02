abstract class Shape{
	public void Shape(){
		System.out.println("Abstract Class");
	}
	public abstract void area();
}
class Triangle extends Shape{
	public double area(double b,double h){
		return (b*h)/2;
	}
}
class Rectangle extends Shape{
	public double area(double l,double w){
		return l*w;
	}
}
class Circle extends Shape{
	public double area(double r){
		return 3.14*(r*r);
	}
}
class p23{
	public static void main(String[] args) {
		Triangle tr = new Triangle();
		double area = tr.area(10,10);
		System.out.println("Area :- "+area);
	}
}