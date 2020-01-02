package MyPack;
public class Settings{
	String path="D:/MCA 3/Java/Practicals/",file;
	public Settings(){}
	public Settings(String name){
		file=name;
	}
	public String getPath(){
		return path+file+".txt";
	}
	
}