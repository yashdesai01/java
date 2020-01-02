import java.util.*;
import java.io.*;
public class circle
{
		private float radius;
		static int count;
		public circle()
		{
			count++;
		}
		public static float getcount()
		{
			return count;
		}
		public circle(float radius)
		{
			this();
			this.radius=radius;
		}
		public float getarea(float radius)
		{
			return (3.14f*radius*radius);
		}
		
		public static void main(String a[])
		{
			float radius=10;
			circle c = new circle();
			circle c1 = new circle(radius);

			System.out.println(c1.getcount());
			System.out.println(c1.getarea(radius));
		}
}