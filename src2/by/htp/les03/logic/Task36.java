package by.htp.les03.logic;

public class Task36 {
	   
	public static void task() {
		/*Найти частное произведений четных и
		  нечетных цифр четырехзначного числа. */
		int b, c, d, z;
		double s;
		
		int pch = 1;  // четные числа
		int pnch = 1; // нечетные числа
		
		double a;
		a = 3278;
		
		b = (int)a/1000;
		if(b%2==0) {
			pch=pch*b;
		}else {
			pnch=pnch*b;
		}
	
		c = (int)(a %1000)/100;
		if(c%2==0) {
			pch=pch*c;
		}else {
			pnch=pnch*c;
		}
		
		d = (int)(a %100)/10;
		if(d%2==0) {
			pch=pch*d;
		}else {
			pnch=pnch*d;
		}
		
		z = (int)a%10;
		if(z%2==0) {
			pch=pch*z;
		}else {
			pnch=pnch*z;
		}
		s = (double) pnch/pch;
		/* for (int i=1; i<5;i++) {
			if(i%2==0) {
				pch=pch*i;
			}else {
				pnch=pnch*i;
			}  */
			
		
		System.out.println(s);	    
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(z);
		System.out.println(pch);
		System.out.println(pnch);
		
	}

}
