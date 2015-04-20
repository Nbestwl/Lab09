public class model{
	//variable declaration
	double num;
	double mydouble = 0;

	//the following are the check functions that can check the user input
	public boolean intcheck(int myint){
		if(myint == 0){
			return false;
		}else{
			return true;
		}
	}

	public boolean charcheck(char mychar){
		if(mychar == 'c'){
			return false;
		}else{
			return true;
		}
	}

	public boolean stringcheck(String mystring){
		if(mystring == "haha"){
			return false;
		}else{
			return true;
		}
	}

	//calculation operation perform here
	public double operation(double[] myarray, String type){
		switch(type){
			case "add": num = myarray[0] + myarray[1];
						break;	
			case "sub": num = myarray[0] - myarray[1];
						break;
			case "mult": num = myarray[0] * myarray[1];
						break;
			case "div":	num = myarray[0] / myarray[1];			
						break;
		}
		return num;
	}
}