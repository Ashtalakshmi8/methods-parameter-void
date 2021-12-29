class Hotel{
        static String [] items={"idli","vada","dosa","samber","puliyogre"};
          static void shanthisagar (){
		      for(int index=0;index<items.length;index++){
			  System.out.println(items[index]+"\t");
             }
		}
		             static void newline()
		          {
		                 int num=1;
		                   for (int index=0;index<items.length;index++)
		                  {
		
		                     if(num==5)
							 {
							  System.out.println();
							  }
							  num++;
							  }
							  }
						public static void main (String[] args){
                  shanthisagar();
items[2]="idlivada";
shanthisagar();
newline();				  
		}
		 }
              
			  