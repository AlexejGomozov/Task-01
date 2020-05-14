package by.htp.les03.logic;

public class Task14 {
	public static void task () {
		// вычислить длинну окружности и площадь круга одного и того же заданного радиуса R
		
		int r;
		double s1,s2;
		final double Pi = 3.1415926536;
		
		r = 4;
		 
		s1 = (double)2*Pi*r;
		s2 = (double)Pi*Math.pow(r, 2);
		
		System.out.println(s1);
		System.out.println(s2);
	
	}

}
