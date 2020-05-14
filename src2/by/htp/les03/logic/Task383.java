package by.htp.les03.logic;

public class Task383 {
   public static void task() {
	   /* Для данных областей составить линейную программу, которая печатает true,
	    если точка с координатами (х, у) принадлежит закрашенной области, и false 
	    — в противном случае: 2е четверти разны кругов. 
	    Чтобы координаты точки были не более радиуса в положительной области
	    координаты x и y, в первом случает и положительной x координат и отрицательной
	    y координате во втором случае.  */
	   
	  double r1, r2;
	  double x1, y1, x2, y2, s;
	  final double x = 0;
	  final double y = 0;
	  
	  r1 = 4;
	  r2 = 5; 
	  
	  x1 = 1;
	  y1 = 3;
	  
	  x2 = x1 - x;
	  y2 = y1 - y;
	  
	  
	  s = Math.sqrt(Math.pow(x2,2) + Math.pow(y2, 2));  /* AB = √((x2-x1)^2 + (y2 - y1)^2); 
	                                                       формула вычисления отрезка;*/
	  
	  if (((s <= r1) & (x1 <= r1) & (y1 <= r1)) |  ((s <= r2) & (x1 <= r2) & (y1 <= -r2))){
		  
		 System.out.println("true");
		 
		} else {
		System.out.println("false");
		}
	  System.out.println(s);
	  }
	  }
  // }

