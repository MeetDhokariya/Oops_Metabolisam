public class Factorial{

      public static void main(String args[]){

        Fact f = new Fact();
        f.factorial();		
   
	  }
}

class Fact{
       
	    int n=5,fact = 1;
      
        void factorial(){
		   for(int i=1;i<=n;i++){
		     fact = fact*i;
			 
		   }
		   System.out.println("Factorial = "+fact);
		}
}