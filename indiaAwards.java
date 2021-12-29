class indiaAwards{
        static String [] famous={"baratRathana","padma-Vibhushan","padma-bhushan","pada-shri","    "};
          static void Raja(){
		      for(int index=0;index<famous.length;index++){
			  System.out.print(famous[index]+"\t");
             }
		}
		             static void newline()
		          {
		                 int num=1;
		                   for (int index=0;index<famous.length;index++)
		                  {
		
		                     if(num==5)
							 {
							  System.out.println();
							  }
							  num++;
							  }
							  }
						public static void main (String[] args){
                  Raja();
				  
famous[2]="pada-shri";

newline();	
Raja();			  
		}
		 }
              
		