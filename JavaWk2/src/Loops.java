
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int i = 0;
		
		System.out.println("A while loop that prints all even numbers from 0 to 100");
		while (i <= 100) {
			if(i%2 == 0) {
				System.out.println(i);
			}
			i++;
		}
				
		i=100;
			
		System.out.println();	
		System.out.println("A while loop that prints every 3rd number going backwards from 100 until we reach 0");
		while (i >= 0) {
			System.out.println(i);
			i = i-3;
		}
				
		System.out.println();
		System.out.println("A for loop that prints every other number from 1 to 100");
	    for (i=1; i <= 100; i++) {
	    	if(i%2 == 1) {
	    		System.out.println(i);
	        }
		}
	   	   
	    System.out.println();
		System.out.println("A for loop 1 to 100 where /3 is Hello, /5 is World, and /3&/5 is HelloWorld");
	    for (i=1; i <= 100; i++) {
	    	if((i%3 == 0)||(i%5==0)) {
	    		if (i%3 != 0) {
	    			System.out.println("World");
	    		}else if (i%5 != 0) {
	    			System.out.println("Hello");
	    		}else {
	    			System.out.println("HelloWorld");
	    		}
	    		
	        }else {
	        	System.out.println(i);
	        }
		}
	}	
}

