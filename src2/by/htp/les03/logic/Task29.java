package by.htp.les03.logic;

import static java.lang.Math.cos;
import static java.lang.Math.acos;
import static java.lang.Math.pow; 

public class Task29 {
	public static void task() {
		/* Найти (в радианах, в градусах) все углы треугольника со сторонами
		   a, b, c.  */
		/* Теорема косинусов звучит так: квадрат длины стороны треугольника равен
		   сумме квадратов двух других длин его сторон минус удвоенное произведение
		   этих длин сторон на косинус угла между ними. То есть составьте три равенства:
		     a²=b²+c²−2×b×c×cos(β); b²=a²+c²−2×a×c×cos(γ); c²=a²+b²−2×a×b×cos(α).*/
		 
		/* Из полученных равенств выразим косинусы углов: 
		 cos(β)=(b²+c²−a²)÷(2×b×c); cos(γ)=(a²+c²−b²)÷(2×a×c); cos(α)=(a²+b²−c²)÷(2×a×b).
		   Теперь, когда известны косинусы углов треугольника, чтобы найти сами углы 
		    воспользуйтесь таблицами Брадиса или возьмите из этих выражений арккосинусы:
		    β=arccos(cos(β)); γ=arccos(cos(γ)); α=arccos(cos(α)). */
				
		double a, b, c;
		double y, x, z;
		double k,l,m;
		final double π = 3.1415926536;
		
		a = 8; //4;             //cos(x)=(b²+c²−a²)÷(2×b×c);
		b = 12;//3;             //cos(z)=(a²+c²−b²)÷(2×a×c);
		c = 18; //5;            //cos(y)=(a²+b²−c²)÷(2×a×b);
		
		
		
		double temp1, temp2, temp3;
		
		temp1 = (pow(b,2)+ pow(c,2) - pow (a,2)) + (2*b*c);
		temp2 = (pow(a,2)+ pow (c,2) - pow (b,2)) + (2*a*c);
		temp3 = (pow(a,2)+ pow(b,2) - pow (c,2)) + (2*a*b);
		
		x = acos (cos (temp1));
		y = acos (cos (temp2));
		z = acos (cos(temp3));
		
		// формула перевода радианов в градусы x = (x*180)/π;
		
		k = (x*180)/π;
		l = (y*180)/π;
		m = (z*180)/π;
		
		System.out.println("углы треугольника в радианах x="+x+", y="+y+", z="+z);
		System.out.println("углы треугольника в углах k="+k+", l="+l+", m="+m);
	}

}
