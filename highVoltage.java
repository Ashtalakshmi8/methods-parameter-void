class highVoltage{
        static String [] Station={"kptcl","Bescom","hescom","Gescom","mescom"};
          static void current (){
		      for(int index=0;index<Station.length;index++){
			  System.out.print(Station[index]+"\t");
             }
		}
		             static void newline()
		          {
		                 int num=1;
		                   for (int index=0;index<Station.length;index++)
		                  {
		
		                     if(num==5)
							 {
							  System.out.println();
							  }
							  num++;
							  }
							  }
						public static void main (String[] args){
                  current();
				  
Station[4]="mescom";

newline();	
current();			  
		}
		 }
              
			  