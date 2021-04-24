package infoLab1;

public class GitLab {

	//hi Muhammed, this is a project that i sent you to work on
	
	public static void main (String[] args) {
		loneSum (2,5,7);
		luckySum(2, 2, 13);
	}
	// i will work on this method and you will do the other, 
	/**
	 * return sum of the values from a,b and c.
	 * if one of the values are the same, dont count them
	 * Author: Lana Alzbibi
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return sum
	 */
	// so this is the method that you should work on, i already set it up for you. please complete it and send it back through GitHub
	public static int loneSum(int a, int b, int c) {
	int sum=0;
	sum = a+b+c;
	if(a==b && a==c && b==c) {
		return 0;
	}
	else if (a==b) {
		return c;
	}
	else if (b==c) {
		return a;
	}
	else if (c==a) {
		return b;
	} else {
		return sum;
	}
	}
	/**
	 * Author: Muhammad jazzar
	 * @param a
	 * @param b
	 * @param c
	 * @return sum of the values on the left of the number 13 if exist, if not return the sum
	 */
	public static int luckySum(int a, int b, int c) {
		if(a==13)
		    return 0;
		  else if(b==13)
		    return a;
		  else if(c==13)
		    return a+b;
		  else
		    return a+b+c;
	}
 }
