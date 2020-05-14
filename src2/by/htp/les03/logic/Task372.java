package by.htp.les03.logic;

public class Task372 {
	public static void task() {
		/*Составить линейную программу, печатающую значение true, если указанное 
		  высказывание 
		  является истинным, и false — в противном случае:
		  - Сумма двух первых цифр заданного четырехзначного числа равна сумме 
		  двух его последних цифр.*/
		
		int a, b, c, d, z;
		a = 2332;
		
		
        b = (int)a/1000;
		c = (int)(a %1000)/100;
		d = (int)(a %100)/10;
		z = (int)a %10;
		
		if ((b+c) == (d+z)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	
	}
	
}
