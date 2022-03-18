package FibRecursive;

public class fibRecursiveMain {
	
	public static void main(String [] args) {
		
		long nano_startTime = System.nanoTime();
		
		int n = 50;
		
		for (int i = 0; i < n; i++) {
			  
            System.out.print(fibonacci(i) + " ");
            
		}
		
		long nano_endTime = System.nanoTime();
		
		System.out.println("\nIt took " + (nano_endTime - nano_startTime) + " nanoseconds to find the " + n + "th term in the Fibonacci series using the recursive.");
		
	}
	
	private static long fibonacci(int n) {
		
		if(n <= 1) {
			
			return n;
			
		}
		
		return (fibonacci(n - 1) + fibonacci(n - 2));
		
	}
	
}
