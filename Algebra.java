// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
			if (x1 < 0 && x2 < 0)
		{
			for( int i = x2; i <  0; i++)
		{
			x1 -= 1;
		}
		return x1;
		}
		else{
			for( int i = 0; i < x2; i++)
		{
			x1++;
		}
			return x1;
		}
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		int result = x1;
		int count = 0;
	    while (count < x2) {
	    	result--;
	    	count++;
	    }
		if( x1 < 0 && x2 < 0)
			return plus(x1,-x2);
		
		
	    return result;

	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
				int temp = 0;

		if(x1 >= 0 && x2 >= 0)
		{
			for (int i = 0; i < x1; i++) {

				for (int j = 0; j < x2; j++) {
					temp ++;
			}
			
		}
		}
		 if(x1 >= 0 && x2 <= 0)
		{
			for (int i = 0; i < x1; i++) {

				for (int j = x2; j < 0; j++) {
					temp ++;
			}
		}
			return -temp;
		
	}
		if(x1 <= 0 && x2 >= 0)
		{
			for (int i = x1; i < 0; i++) {

				for (int j = 0; j < x2; j++) {
					temp ++;
				}
			}
			return -temp;
		}
		if(x1 <= 0 && x2 <= 0){
			
			for (int i = x1; i < 0; i++) {

				for (int j = x2; j < 0; j++) {
					temp ++;
				}
			}
			return temp;
		}
		return temp;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
			int temp = x;
		if( n == 0)
			return 1;

		for(int i =1 ; i < n; i++)
		{
			temp = times(temp,x);
		}
		
		return temp;

	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
				int count = 0;
		int temp =x2;

		if(x1 > 0 && x2 > 0)
		{
		while(x1 >= x2)
		{
			x2 = plus(x2,temp);
		count ++;
		}
		
		return count;
		}
		if(x1 < 0 && x2 > 0)
		{
			x1 = times(-1,x1);
			while(x1 >= x2)
			{
			x2 = plus(x2,temp);
			count ++;
		}
		return times(-1, count);
		}
		if(x1 > 0 && x2 < 0)
		{
			temp =-temp;
			x2 = -x2;
			while(x1 >= x2)
			{
			x2 = plus(x2,temp);
			count ++;
			}	
			return times(-1, count);
		}
		if(x1 < 0 && x2 < 0)
		{
			x1 = -x1;
			x2= - x2;
			temp = times(-1, temp);
			while(x1 >= x2)
			{
			x2 = plus(x2,temp);
			count ++;
		}
		return count;

		}
		return 0;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		int temp = x1;

		while( temp >= x2)
		{
		temp = minus(temp, x2);
			if(temp == 0)
			return temp;
		}
		return temp;

	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		int num1 =0; int num2 =0;

		while(num1 * num2 <= x)
		{
			if (times(num1,num2) == x)
			{
				return num1;
			}
			else if(num1 <= num2){
				num1++;
			}
			else if(num1 > num2)
			{
				num2 ++;
			}
		}
		return num1-1;

	}	  	  
}
