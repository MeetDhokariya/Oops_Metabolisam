public class Book{
   
   public static void main(String args[]){
   
	  Author author = new Author(343,"Aa Che Siyachen ");
      Author author1 = new Author();
     
	   
   }
}

class Author{
    Author(){
	 System.out.println("Author Name : Harshal Pushkarna");
	}
	
	Author(int book_id,String book_title){
	   
	   System.out.println("Book Id = "+book_id);
	   System.out.println("Book Name = "+book_title);
	     
	}
}