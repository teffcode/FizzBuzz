
public class FizzB {

	public static void main(String arg[]){
		
		for(int i=1; i<=50; i++){
			
			if(i%3==0 & i%5==0){
				System.out.println("Fizz Buzz");
			}
			else if(i%3==0){
				System.out.println("Fizz");
			}
			else if(i%5==0){
				System.out.println("Buzz");
			}
			System.out.println(i);
		}
	
	}
}