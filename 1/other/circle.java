import java.util.*;
import java.io.*;
class circle
{
		private float radius;
		private float count;
		circle()
		{
			count++;
		}
		static int getcount()
		{
			return count;
		}
		circle(float radius)
		{
			this();
			this.radius=radius;
		}
		public float getarea()
		{
			float area_cal=3.14*radius*radius;
			return area_cal;
		}
		
		public static void main(String a[])
		{
			circle c = new circle();
			circle c1 = new circle(2.25);
			System.out.println(c1.getdata());
			System.out.println(circle.getcount());
		}
}