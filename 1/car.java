class vehicle
{
	private String v_type;
	public vehicle()
	{
			
	}
	public vehicle(String v_type)
	{
		this.v_type=v_type;
	}
	public void display()
	{
		System.out.println("V_type=>"+v_type);
	}
}
class car extends vehicle
{
	String m_type,c_name;
	public car()
	{
			
	}
	public car(String v_type,String m_type,String c_name)
	{
		super(v_type);
		this.m_type=m_type;
		this.c_name=c_name;
	}
	public void display()
	{
		super.display();
		System.out.println("v_type=>"+ m_type +"\n"+"c_name=>"+ c_name);
	}
	public static void main(String arg[])
	{
		car v=new car("LMV","HONDA","CITY");
		v.display();
	}
}
