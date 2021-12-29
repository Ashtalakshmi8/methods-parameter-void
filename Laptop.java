class Laptop{
        static String [] various={"Dell","hp","AcER","Apple","lenovo"};
          static void iph (){
		      for(int index=0;index<various.length;index++){
			  System.out.print(various[index]+"\t");
             }
		}
		             static void newline()
		          {
		                 int num=1;
		                   for (int index=0;index<various.length;index++)
		                  {
		
		                     if(num==5)
							 {
							  System.out.println();
							  }
							  num++;
							  }
							  }
						public static void main (String[] args){
                  iph();
				  
various[4]="Apple";

newline();	
iph();			  
		}
		 }
              
			  