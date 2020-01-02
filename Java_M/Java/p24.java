interface Exam{
	boolean Pass(int mark);
}
interface Classify{
	String Division(float average);
}
class Result implements Exam,Classify {
	public boolean Pass(int mark){
		if (mark>=50)
			return true;
		else
			return false;
	}
	public String Division(float average){
		if (average>=60) {
			return "First";
		}
		else if (average>=50) {
			return "Second";
		}
		else {
			return "No Division";
		}
	}
}
public class p24{
	public static void main(String[] args) {
		Result r = new Result();
		System.out.println(r.Pass(50));
		System.out.println(r.Division(50));
	}
}