package by.htp.les03.logic;

public class Task27 {
 public static void task() {
	 /* Дано значение a. Не используя никаких функций и никаких операций,
	    кроме умножения, получить значение a^3 за 3 операции и a^10  за 
	    четыре  операции. */
	  
	 int a, b, c, d, s;
	 
	 a = 2; 
	 
	// d = a*1;   //a^1   
	// s = a*a;   //a^2
	// c = d*s;   //a^3
	
	 
	 d = a*a;      //a^2
	 b = d*d;      //a^4
	 s = b*b;      //a^8
	 c = s*d;      //a^10
	 
	 
	 
	 System.out.println(c);
 }
}
