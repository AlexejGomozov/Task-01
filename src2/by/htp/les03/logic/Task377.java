package by.htp.les03.logic;

public class Task377 {
public static void task() {
//Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.

	int a, c, d, z, b, k, s;
	a = 131;
   
	c = (int)a/100;
	d = (int)(a %100)/10;
	z = (int)a %10;
	
	b = c + d;
	k = z + d;
	s = c + z;
	
	if (b==z) {
		System.out.println("true");
	} else if (k == c){
		System.out.println("true");	
	} else if (s==d) {
		System.out.println("true");	
		}
	else {
		System.out.println("false");
	}
	}
}

