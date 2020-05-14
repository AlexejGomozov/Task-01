package by.htp.les03.logic;

public class Task17 {
  public static void task () {
	 /* даны 2 числа . найти ср. арифметическое кубов этих чисел 
	и ср. геометрическое модулей этих чисел .
	 Чтобы найти среднее 
	геометрическое, нужно перемножить все числа и извлечь из них корень.
	 Степень корня определяется количеством чисел.
	         Метод Math.abs() — дает абсолютное значение аргумента, 
	 простыми словами — мы получаем модуль числа.
	  Аргумент может быть int, float, long, double, short, byte.*/



	  double a, b, c, d;
	  
	  a = 4.4;
	  b = -1.8;
	  c = (Math.pow(a,3) + Math.pow(b, 3))/2;
	  
	  d = Math.sqrt (Math.pow(a,3) * Math.pow(b, 3));
	  
	  System.out.println(Math.abs(c));
	  System.out.println(Math.abs(d));
  }
}
