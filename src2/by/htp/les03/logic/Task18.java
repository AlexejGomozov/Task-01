package by.htp.les03.logic;

public class Task18 {
	public static void task () {
		/* Дана длина ребра куба. Найти площадь грани, площадь полной поверхности
		и объем этого куба */
		
		double x, s1, s2, v;
		x = 7;
		
		s1 = Math.pow(x, 2);
		
		s2 = 6*s1;
		
		v = Math.pow(x, 3);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(v);
	}

}
