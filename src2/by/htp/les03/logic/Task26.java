package by.htp.les03.logic;

public class Task26 {
	public static void task() {
		/*  Найти площадь треугольника, две стороны которого равны
		  a и b, а угол между этими сторонами y. */
		// s=1/2 ab *sinå
		
	  double a, b, y, s;
	  
	  a = 4;
	  b = 5;
	  y = 45.03;
	  
	  s = (a*b*Math.sin(y))/2;
		
		System.out.println(s);
	}
	
}
