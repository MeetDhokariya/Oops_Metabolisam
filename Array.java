public class Array{
  public static void main(String args[]){
	  Minmax m = new Minmax();
	  m.minimum();
	  
  }
}

class Minmax{
	
	void minimum() {
		int a[]={15,56,84,1,26};
		int min= a[0],max=a[0];
		
		for(int i = 1;i < a.length ; i++){
			if(a[i]>max){
				max = a[i];
			}
			if(a[i]<min){
				min = a[i];
				
			}
		}
		System.out.println("Minimum Number = "+min);
		System.out.println("Maximum Number = "+max);
		
		
	}
}