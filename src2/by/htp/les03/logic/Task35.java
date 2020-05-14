package by.htp.les03.logic;

public class Task35 {
   public static void task () {
	   /*Даны натуральные числа М и N. Вывести старшую цифру дробной
	     части и младшую цифру целой части числа M/N. */
	   int b, c;
	   double M, N, a;
	   
	   M = 731;
	   N = 21;
	   
	   a = M/N;
	   b = (int)(a*10)%10; 
	   c = (int)a%10;
	   
	   System.out.println("Число M/N = "+ a +";");
	   System.out.println("старшая цифрa дробной части числа M/N = "+ b +";");
	   System.out.println("младшая цифра целой части числа M/N = "+ c +".");
   }
	
}
