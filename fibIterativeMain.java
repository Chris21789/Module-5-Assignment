package FibIterative;

public class fibIterativeMain {
	
	public static void main(String [] args) {
		
		long nano_startTime = System.nanoTime();
		
		int n = 49;
		
		fibonacci(n);
		
		long nano_endTime = System.nanoTime();
		
		System.out.println("\nIt took " + (nano_endTime - nano_startTime) + " nanoseconds to find the " + n + "th term in the Fibonacci series using the iterative method.");
		
	}

	static void fibonacci(int n)
    {
        int x = 0, y = 1;
  
        int i = 0;
  
        while (i < n) {
  
            System.out.print(x + " ");
  
            int z = y + x;
            x = y;
            y = z;
            i = i + 1;
            
        }
        
    }
	
}
