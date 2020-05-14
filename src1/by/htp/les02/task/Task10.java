package by.htp.les02.task;

public class Task10 {

	public static void main(String[]args) {
		
		double x,y,z;
		
		x = 1.5;
		y = 1.6;
		
		z = ((Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)))*Math.tan(x)*y;
		
		System.out.println(z);
	}
}
