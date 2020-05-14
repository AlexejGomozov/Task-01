package by.htp.les03.logic;

public class Task12 {

	public static void task () {
		
		int x1, x2, y1, y2;
		double d;
		
		x1 = 3;
	    x2 = 7;
	    y1 =4;
	    y2 = 9;
	    
	    double temp1;
		double temp2;
		
		temp1 = Math.pow((x2-x1),2);
		temp2 = Math.pow((y2-y1),2);
		
		d = (double)Math.sqrt(temp1+ temp2);
	    
	    		//d= √(x2−x1)^2+(y2−y1)^2 формула нахождения Расстояние между двумя точками

	    System.out.println(d);
	}
}
