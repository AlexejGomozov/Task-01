package by.htp.les03.logic;

public class Task24 {
public static void task() {
/* Найти площадь равнобедренной трапеции с основаниями a и b
	                      и углом x при большем основании a.
	      𝑆=((𝑏2−𝑎2)/2)*tan𝛼 */
	
	double a ,b, x, s;
	
	a = 4;
	b = 7;
	x = 45.03;
	 s = (Math.pow(b, 2) - Math.pow(a, 2)/2) * Math.tan(x);
	
	System.out.println(s);
}
}
