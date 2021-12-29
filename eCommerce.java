class eCommerce{
        static String [] company={"Amazon","eBay","samung","flipkart","Ajio"};
          static void Top(){
		      for(int index=0;index<company.length;index++){
			  System.out.print(company[index]+"\t");
             }
		}
		             static void newline()
		          {
		                 int num=1;
		                   for (int index=0;index<company.length;index++)
		                  {
		
		                     if(num==5)
							 {
							  System.out.println();
							  }
							  num++;
							  }
							  }
						public static void main (String[] args){
                  Top();
				  
company[2]="eBay";

newline();	
Top();			  
		}
		 }
              