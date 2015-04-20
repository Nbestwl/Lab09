import java.util.Scanner;

public class view{
	//variable declaration
	int choice = 0;
	char boo;
	String mystring;
	double[] array1;
	int myint = 0;
	double result = 0;
	Scanner input = new Scanner(System.in);
	model mymodel = new model();

	/**
	 * this function will print out he main menu and return the operation type
	 */
	public String menu(){
		System.out.println("\n===============Caculator==============\nPlease select an option below:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
		choice = input.nextInt();

		switch(choice){
			case 1:	//do addition here
					mystring = "add";
					break;
			case 2:	//do subtraction here
					mystring = "sub";
					break;
			case 3:	//do multiplication here
					mystring = "mult";
					break;
			case 4:	//do division here
					mystring = "div";
					break;
			case 5:	//exit here
					mystring = "exit";
					break;
			default: 
					mystring = "haha";
					break;
		}
		return mystring;
	}

	/**
	 * this function will print out the submenu and return an integer
	 */
	public int submenu(){
			System.out.println("\nWould you like to use the previous result for:\n1. first number\n2. second number\n3. neither");
			choice = input.nextInt();

			switch(choice){
				case 1: //do first number here
						return 1;
				case 2: //do second number here
						return 2;
				case 3: //do neither
						return 3;
				default:
						return 0;
			}
	}

	public void setresult(double double2){
		result = double2;
	}

	/**
	 * [getinputs description]
	 * @param  takes in an parameter which decides what option user picks
	 * @return  an array contains the user inputs
	 */
	public double[] getinputs(int choice){
		array1 = new double[2];
		System.out.print("\nPlease input an integer: ");
		myint = input.nextInt();
		switch(choice){
			case 1: //do first number here
					array1[0] = result;
					array1[1] = myint;
					break;
			case 2: //do second number here
					array1[1] = result;
					array1[0] = myint;
					break;
			case 3: //do neither
					array1[0] = myint;
					System.out.print("\nPlease input an integer: ");
					myint = input.nextInt();
					array1[1] = myint;
					break;
		}
		return array1;
	}

	public char lastmenu(){
		System.out.println("\nDo you want to perform another operation?(y/n)");
		boo = input.next().charAt(0);
		System.out.println();

		switch(boo){
			case 'y': 	return 'y';
				 	 
			case 'n': 	return 'n';
			default:
					return 'c';
		}	
	}

	public void errorMassage(){
		System.out.println("Invalid Input");
	}

	public void resultprint(double[] myarray, String type){
		System.out.println("\n" + myarray[0] + " " + type + " " + myarray[1] + " = " + result);
	}
}
