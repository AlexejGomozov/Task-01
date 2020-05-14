package by.htp.les03.logic;

public class Task32 {
   public static void task () {
	   /* Текущее показание электронных часов: m ч (0<=m<=23) n мин (0<=n<=59)
	      k с (0<=k<=59). Какое время будут показывать часы через p ч, q мин, r с? */
	   
	   int  m, n, k, p, q, r, g, h, f;
	   
	   m = 23;
	   n = 37;
	   k = 57;
	   
	   p = 14;
	   q = 24;
	   r = 8; 
	   
	  
	   h = n + q;
	   f = k + r;
	   
	if (h>59 & f>59)   {
		 m = m + 1; 
		 q = q +1;
		 
		 g = (m + p)%24;
         System.out.println(g+"ч");    


                            
                    h = (n + q)%60;
                     System.out.println(h+"мин");

                                  f = (k + r)%60;
	                                  System.out.println(f+"с");
	}
	else if (h>59 ) {
		 m = m + 1;
		 g = (m + p)%24;
         System.out.println(g+"ч");    


                            
                    h = (n + q)%60;
                     System.out.println(h+"мин");

                                  f = (k + r)%60;
	                                  System.out.println(f+"с");
	}  
	
	else if (f>59) {
		q = q +1;
		     g = (m + p)%24;
            System.out.println(g+"ч");    


                           
                   h = (n + q)%60;
                    System.out.println(h+"мин");

                                 f = (k + r)%60;
                                  System.out.println(f+"с");
	}
		   else    { g = (m + p)%24;
                    System.out.println(g+"ч");    
	 
	   
	                                   
		                       h = (n + q)%60;
		                        System.out.println(h+"мин");
		   
	                                         f = (k + r)%60;
			                                  System.out.println(f+"с");
	  
   }
}
}