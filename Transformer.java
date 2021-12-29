class Transformer{
        static String [] types={"wound","toroidal","bar","sumation","pt"};
          static void Ac (){
		      for(int index=0;index<types.length;index++){
			  System.out.print(types[index]+"\t");
             }
		}
		             static void newline()
		          {
		                 int num=1;
		                   for (int index=0;index<types.length;index++)
		                  {
		
		                     if(num==5)
							 {
							  System.out.println();
							  }
							  num++;
							  }
							  }
						public static void main (String[] args){
                  Ac();
				  
types[2]="sumationpt";

newline();	
Ac();			  
		}
		 }
              
			  