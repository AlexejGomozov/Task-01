package by.htp.les03.logic;

public class Task25 {
    public static void task () {
	/* Вычислить корни квадратного уравнения ax^2 + bx + c = 0, с заданным коэффициентами  
	 a, b и c (предполагается, что a не равно "0" и что дискриминант уравнения неотрицателен */
     //  формула корней x = (- b +/- √(b^2 - 4ac) )/2, дискриминант: d=(b^2 - 4ac) >=0.
	
    	double a, b, c;
    	double x1, x2;
    	
    	a = 1;
    	b = 7;
    	c = 1;
    	
        double d = (b*b) - (4*a*c);
    
    if  (d == 0) {
    	
    	x1 = (- 1*b + Math.sqrt(d))/2;
    	
    	
    	System.out.println("Если d=0, то имеет одно решение корня, x1=" + x1);
    }
    else if (d > 0) { 
    	x1 = (- 1*b + Math.sqrt(d))/2;
    	x2 = (- 1*b - Math.sqrt(d))/2; 
    	 
    	System.out.println("Если d>0, то имеет два решения корня, x1=" +   x1 + " и x2=" + x2);
    }
    	
    else {
    	
    	System.out.print("Нет решения");
    }
    	
}
}
