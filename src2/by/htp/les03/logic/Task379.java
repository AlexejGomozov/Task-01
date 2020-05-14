package by.htp.les03.logic;

public class Task379 {
  public static void task(){
	/* График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п).  
     грифик этой функции проходит через точку с координатами (m,n) 
      т.е. подставить координаты точки в значение функции. Равняется ли 
      x = x1 и y = y1. для проверки вывел в консоль значение y. */
      
	  double y, x, y1, x1;
	  
	  x = 4;
	  y1 = 103.0;
	  x1 = 4;
	  
	  
	 // у = ах2 + bх+ с;
	  
	  y = 5*Math.pow(x,2) + (4*x) + 7 ;
	   
	  if (x==x1 & y==y1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	  System.out.println(y);  
  }
  }
