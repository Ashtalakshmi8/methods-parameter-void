class Motors{
        static String [] parts={"stator","rotor","comutator","brush","slipring"};
          static void Dc (){
		      for(int index=0;index<parts.length;index++){
			  System.out.println(parts[index]+"\t");
             }
		}
		             static void newline()
		          {
		                 int num=1;
		                   for (int index=0;index<parts.length;index++)
		                  {
		
		                     if(num==5)
							 {
							  System.out.println();
							  }
							  num++;
							  }
							  }
						public static void main (String[] args){
                  Dc();
parts[3]="comutatorbrush";
Dc();
newline();				  
		}
		 }
              
			  