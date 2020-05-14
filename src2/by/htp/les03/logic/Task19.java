package by.htp.les03.logic;

public class Task19 {
    public static void task () {
    	/* Дана сторона равностороннего треугольника . Найти площадь
    	  этого треугольника, его высоту, радиусы вписанной и описанной
    	   окружностей.*/
    	
    	double a, s, h, r1, r2;
    	
    	a = 5;
    	
    	s = (Math.pow(a, 2)* Math.sqrt(3))/4;
    	
    	h = (Math.sqrt(3)/2)*2;
    	
    	r1 = (Math.sqrt(3)/6)* a;
    	
    	r2 = (Math.sqrt(3)/3)* a;
    			
    	System.out.println(s);
    	System.out.println(h);
    	System.out.println(r1);
    	System.out.println(r2);
    }
	
}
