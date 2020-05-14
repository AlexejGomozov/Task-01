package by.htp.les03.logic;

public class Task40 {
  public static void task() {
	  /* Дано значение х. Получить значения -2х + 3х - 4х и 1 + 2х + 3х + 4х . 
	    Позаботьтесь об экономии операций. */
	  
	  // -2х + 3х - 4х и 1 + 2х + 3х + 4х 
	  int a, x, s, s1;
	  
	  x = 3;
	  
	  a = (2*x + 4*x);
	  
      s = 3*x - a;
	      
	  s1 =  1 +  3*x + a;   
	      
	      System.out.println(s);
	      System.out.println(s1);
  }
  
}
