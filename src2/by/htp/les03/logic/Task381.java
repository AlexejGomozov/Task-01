package by.htp.les03.logic;

public class Task381 {
 public static void task() {
	/* Для данных областей составить линейную программу, которая печатает true,
	   если точка с координатами (х, у) принадлежит закрашенной области,
	   и false — в противном случае:  .... */
	 
   // вершины  треугольника (xa;ya), (xb;yb), (xc,yc) . наша точка (х, у).
	/*  Если точка лежит внутри треугольника, то ее можно
       соединить с вершинами треугольника и получить три
       маленьких треугольника.*/
	
	double  xa, xb, xc, x0,  ya, yb, yc, y0;
	
	double s, s1, s2, s3, s4;
	
	xa = -3;
	xb = 0;
	xc = 3;
	              //s= 1/2 |(xb - xa)(yc - ya) - (xc - xa)(yb - ya)| 
	ya = 0;
	yb = 4;
	yc = 0;
	
	x0 = -1;
	y0 = 1.5;
	
   s = Math.abs((xb - xa)*(yc - ya) - (xc - xa)*(yb - ya))/2;
	
   s1 = Math.abs((x0 - xa)*(yc - ya) - (xc - xa)*(y0 - ya))/2;
   
   s2 = Math.abs((x0 - xb)*(yc - yb) - (xc - xb)*(y0 - yb))/2;
   
   s3 = Math.abs((x0 - xa)*(yb - ya) - (xb - xa)*(y0 - ya))/2;
   
   
	
	//s1 = ((x2-x1)*(y0-y1)) - ((x0 - x1)*(y2 - y1));
	//s5 = Math.abs(s1)/2;
	
	//s2 = ((x2-x3)*(y0-y3)) - ((x0 - x3)*(y2 - y1));
	//s6 = Math.abs(s2)/2;
	
	//s3 = ((x3-x1)*(y0-y1)) - ((x0 - x1)*1);
	//s7 = Math.abs(s3)/2;
	
	s4 = s1 + s2 + s3;
	
	if (s == s4) {
		System.out.println("true");
	} else {
		System.out.println("false");
	}	
	System.out.println(s);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
}
}