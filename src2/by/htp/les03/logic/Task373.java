package by.htp.les03.logic;

public class Task373 {
	public static void task() {
		/* Составить линейную программу, печатающую значение true, если 
		  указанное высказывание является истинным, и false — в противном случае:
		  - Сумма цифр данного трехзначного числа N является четным числом.*/
		
		int a, c, d, z, b;
		a = 131;
	   
		c = (int)a/100;
		d = (int)(a %100)/10;
		z = (int)a %10;
		
		b = c + d + z;
		
		if (b%2==0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
