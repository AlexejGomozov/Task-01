package by.htp.les02.task;
//Вычислить значение выражения по формуле (все переменные принимают действительные значения): 𝑏 + √𝑏2 + 4𝑎𝑐 3 −2 −𝑎 𝑐+𝑏 2𝑎
//Calculate the value of an expression using the formula (all variables take valid values):
public class Task8 {

	 public static void main(String[]args) {
		 
		 double a,b,c;
		 
		 a=1.2;
		 b=2.4;
		 c=3.7;
		 
		 double d;
		
		 double temp1,temp2;
		 
		 temp1= Math.sqrt((Math.pow(b,2) + 4*a*c))/(2*a);
		 
		 temp2=Math.pow(b,-2);
		
		 //d=b+ Math.sqrt((Math.pow(b,2) + 4*a*c))/(2*a) - Math.pow(a,3)*c + Math.pow(b,-2);
		 
		 d= b + temp1 - Math.pow(a,3)*c + temp2;
				 System.out.println(d);
	 }
}
