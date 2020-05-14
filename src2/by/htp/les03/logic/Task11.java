package by.htp.les03.logic;


public class Task11 {
	
public static void task () {
    
	
	double a,b,c,s1,s2;
	
	a = 3;
	b = 4;
	
	double temp1;
	double temp2;
	
	temp1 = Math.pow(a,2);
	temp2 = Math.pow(b,2);
	
	c = Math.sqrt(temp1+ temp2);
	
	//c = Math.sqrt((c*c));
	
	// c^2 = a^2 + b^2; . формула для вычисления гипотенузы, по т.Пифагора для вычисления периметра
		//
		// формула для вычисления периметра -- сумма всех сторон
		s1 = a + b + c;
		// площадь прямоугольного треугольника s = 1\2 a*b
		
		s2 = (a*b)/2;
			
	    System.out.println(s1);
		
		System.out.println(s2);
}
}

