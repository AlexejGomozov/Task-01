package by.htp.les03.logic;

public class Task33 {
  public static void task() {
	  
/* Ввести любой символ и определить его порядковый номер, а так же 
 указать предыдудущий и последующий символы. */
	  
	  int u;
	  char c, b, h;
	   c = 'A';
	  
	    u = (int) c;
	   
	    b = (char)(u +1);
	
	    h = (char)(u-1);
	  
	 
	  
	  System.out.println("Порядковый номер введенного символа = "+
	  u + "\n" +"Последующий символ = " + b + "\n" +"Предыдущий символ = " + h);
	 
	  
  }
}
