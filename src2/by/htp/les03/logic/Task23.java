package by.htp.les03.logic;

public class Task23 {
public static void task() {
//Найти площадь кольца, внутренний радиус которого равен r, а внешний - R(R>r).
//S=π⋅(R^2 - r^2) 
	final double π = 3.1415926536;
	   double r, R, s;
	   
	   r = 4;
	   R = 6;
	   
	   s = π* (Math.pow(R, 2) - Math.pow(r, 2));
	

	
	
	System.out.println(s);
}
}