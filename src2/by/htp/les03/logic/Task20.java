package by.htp.les03.logic;

public class Task20 {
   public static void task () {
	   
	   /* Известна длинна окружности. Найти площадь круга, ограниченного
	    этой окружностью
	    S=π⋅r^2 ;  L=2πr;   r=L/2π;   */
	   
	   final double π = 3.1415926536;
	   double l, r, s;
	   
	   l = 8;
	   
	   r = l/(2*π);
	   s = π* Math.pow(r, 2);
	   
	   System.out.println(s);
   }
}
