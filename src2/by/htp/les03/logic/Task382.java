package by.htp.les03.logic;

public class Task382 {
  public static void task() {
	  /* Для данных областей составить линейную программу, которая печатает true,
	    если точка с координатами (х, у) принадлежит закрашенной области, и false 
	    — в противном случае: .
	    Даны 2 прямоугольника с определенными кординатами
	    
	    1й прямоугольник с координатами a(xa; ya), b(xb; yb), c(xc; yc), d(xd; yd);
	    2й прямоугольник с координатами k(xk; yk), l(xl; yl), m(xm; ym), n(xn; yn);
	       координаты точки p(xp;yp).  */
	  
	  double xa = -2, xb = -2, xc = 2, xd =2;
	  double ya =  0, yb = 4, yc = 4, yd =0;
	  
	  double xk = -4, xl = -4, xm = 4, xn = 4;
	  double yk = -3, yl = 0, ym = 0, yn = -3;
	  
	  double xp = 4, yp = -1;
	   
	  if (((xp >= -2 & xp <= 2) & (yp >= 0 & yp <= 4)) | ((xp>= -4 & xp <= 4) & (yp >= -3 & yp <= 0))) {
	  //if (((xp > -xa & xp < xc) & (yp > ya & yp < yc)) | ((xp> -xk & xp < xm) & (yp > yk & yp < yl))) {	  
		  System.out.println("true");
		} else {
			System.out.println("false");
	  }
	  
      //c = Math.max(a,b);
	 // k = Math.min(a, b);
      
	  
	  
	  
  }
	
}
