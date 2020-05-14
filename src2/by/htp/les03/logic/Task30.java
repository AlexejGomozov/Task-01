package by.htp.les03.logic;

public class Task30 {
  public static void task() {
	  /* Три сопротивления R1, R2, R3 соединины параллельно.
	      Найдите сопротивлене соединения  */
	  
	  /* общее сопротивление при параллельном соединении формула для трех компонентов:
	      Rобщ = R1*R2*R3/(R1*R2 + R2*R3 + R1*R3; */
	  
	  double R1, R2, R3, Rобщ;
	  
	  R1 = 7;
	  R2 = 11;
	  R3 = 5;
	  
			  Rобщ = (R1*R2*R3)/((R1*R2) + (R2*R3) + (R1*R3));
	  
	  System.out.println(Rобщ);
  }
}
