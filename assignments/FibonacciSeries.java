package week1.day2.assignments;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		int range = 8;
		int sum = 0;
		
		System.out.println(num1);
		
		for (int i = 1; i <range; i++) {
			
		
			sum=num1+num2;
			num1=num2;
			num2=sum;
			
			System.out.println(sum);
			
			
			
		}
	}

}
