class humanReaction{
        static String [] fellings={"Anger","ego","fear","sadness","jealousy"};
          static void Bad (){
		      for(int index=0;index<fellings.length;index++){
			  System.out.print(fellings[index]+"\t");
             }
		}
		             static void newline()
		          {
		                 int num=1;
		                   for (int index=0;index<fellings.length;index++)
		                  {
		
		                     if(num==5)
							 {
							  System.out.println();
							  }
							  num++;
							  }
							  }
						public static void main (String[] args){
                  Bad();
				  
fellings[2]="ego";

newline();	
Bad();			  
		}
		 }
              
			  