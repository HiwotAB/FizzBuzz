package FizzBuzz;

public class FizzBuzzPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Print Numbers 1 to 100");// Display the message to the user that what the program work for.  
	for(int i=1;i<=100;i++){// for loop that is used to intializes value ,check at maximum limits and increment the value by one.
		if(i%3==0 && i%5==0){// check the print number is multiply by 3 and by 5
			System.out.println("FizzBuzz");//Print the message if it is multiply with both.
		}
		else if(i%3==0){// check the print number is multiply by 3 
			System.out.println("Fizz");//Print the message if it is multiply with
		}
		else if(i%5==0)// check the print number is multiply by 5 
		{
			System.out.println("Buzz");//Print the message if it is multiply with
		}
		
		else
			System.out.println(i);//Print the message if it is not  multiply with both number.
	}

}

}
