package by.htp.les03.logic;

public class Task37 {
	public static void task() {
		/*Составить линейную программу, печатающую значение true, если указанное высказывание 
		 является истинным, и false — в противном случае:
		 
         • Целое число N является четным двузначным числом.
         • Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
         • Сумма цифр данного трехзначного числа N является четным числом.
         • Точка с координатами (х, у) принадлежит части плоскости, лежащей между 
         прямыми х= m, х= n (m<n).
         • Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
         • Треугольник со сторонами а,b,с является равнобедренным.
         • Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.
         • Заданное число N является степенью числа а (показатель степени может находиться в
            диапазоне от 0 до 4).
         • График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п).  */
		
		int N;
		
		 N = 88;
		 
		 if ((N%2) == 0 & N>10 & N<100) {
			 System.out.println("true. число является четным двузначным");
		 }
			 else {
		    	System.out.println("false. число не является четным двузначным");
		    }
			 
		
		
		
		
	}

}
