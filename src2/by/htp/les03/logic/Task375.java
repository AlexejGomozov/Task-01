package by.htp.les03.logic;

public class Task375 {
	public static void task () {
		// Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
		
		
		double a, c, s, k, d, z, b;
		a = 671;
	   
		c = (int)a/100;
		d = (int)(a %100)/10;
		z = (int)a %10;
		
		s = Math.pow(a, 2);
		 
		b = c + d + z;
		
		k = Math.pow(b, 3);
		
		
		if (s==k) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
