public class controller{
	public static void main(String[] args){
		//variable declaration
		view foo = new view();
		model mymodel = new model();
		char quit;
		int myint;
		double double3;
		double[] array2;
		double[] array3;
		boolean check;
		String mystring;
		//loop through all the menu info and consistently prompt user to input valid info
		do{
			do{
				mystring = foo.menu();
				if(mystring == "exit"){
					System.exit(0);
				}
				check = mymodel.stringcheck(mystring);
				if(check == false){
					foo.errorMassage();
				}
			}while(check == false);

			do{
				myint = foo.submenu();
				check = mymodel.intcheck(myint);
				if(check == false){
					foo.errorMassage();
				}else{
					array2 = new double[2];
					array3 = new double[3];
					array2 = foo.getinputs(myint);
					double3 = mymodel.operation(array2, mystring);
					foo.setresult(double3);
					foo.resultprint(array2, mystring);
				}
			}while(check == false);
			
			do{
				quit = foo.lastmenu();
				check = mymodel.charcheck(quit);
				if(check == false){
					foo.errorMassage();
				}
			}while(check == false);
		}while(quit != 'n');
	}
}