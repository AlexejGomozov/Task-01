package by.htp.les03.logic;

public class Task13 {
	public static void task() {
		
		int x1, x2, x3, y1, y2, y3;
		double d, c, h, s1, s2;
		
		x1 = 1;
		x2 = 4;
		x3 = 6;
		y1 = 1;
		y2 = 4;
		y3 = 6;
		
		d = (double)Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2)));
		c = (double)Math.sqrt((Math.pow((x3-x2), 2)) + (Math.pow((y3-y2), 2)));
		h = (double)Math.sqrt((Math.pow((x3-x1), 2)) + (Math.pow((y3-y1), 2)));
		
		s1 = d + c + h;
		
		//заданы координаты трех вершин треугольника. найти периметр и площадь
		//d= √(x2−x1)^2+(y2−y1)^2 формула нахождения Расстояние между двумя точками 
		// площадь треугольника находим как площадь паралелаграмма /2
		
		s2 = (d*c)/2;
				
		System.out.println(s1);
		System.out.println(s2);
	}

}
