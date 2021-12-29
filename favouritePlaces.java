class favouritePlaces{
        static String [] visiting={"Mountabu","Maharastra","Rajasthan","delhi","Bidar"};
          static void North (){
		      for(int index=0;index<visiting.length;index++){
			  System.out.print(visiting[index]+"\t");
             }
		}
		             static void newline()
		          {
		                 int num=1;
		                   for (int index=0;index<visiting.length;index++)
		                  {
		
		                     if(num==5)
							 {
							  System.out.println();
							  }
							  num++;
							  }
							  }
						public static void main (String[] args){
                  North();
				  
visiting[4]="delhi";

newline();	
North();			  
		}
		 }
              
			  