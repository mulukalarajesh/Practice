package Practice;
import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {

	
	
	/*
	Max Profit
	Given an array of values which represent prices of an item at different instances of time, compute best buying and selling times (max profit). The timestamps in the array are in chronological order.

	Example:
	Given that [ (02:00, 7.5), (03:30, 7.9), (04:00, 8.0), (05:30, 6.8), (10:00, 9.01)]
	Output should be: Buy at 05:30 and Sell at 10:00, profit would have been 2.21
*/
	public static void main(String[] args) {
		
	int x[]=new int[] {10,20,30,40,50,60};
	Arrays.sort(x);
	int index=Arrays.binarySearch(x, 30);
	System.out.println("binary Search " + index);
	int s=30;
	int t=x.length;
	
int i=0;

while(i<t) {
	if(x[i]==s) {
		System.out.println("index of 30 is "+i);
		break;
	}else {
		i++;
	}
}



int y[]=Arrays.copyOfRange(x, 0, 2);
	int z[]=Arrays.copyOfRange(x,2,3);
	
	System.out.println(Arrays.toString(z));
	System.out.println(	Arrays.toString(y));
	ArrayList<Integer> l=new ArrayList<>();
	l.add(29);
	l.add(-10);
	l.add(39);
	l.add(0);
	l.add(26);
	l.add(5);
	l.add(21);
	l.add(35);
	l.add(18);
	l.add(45);
	System.out.println(l.toString());
	
	System.out.println(l.subList(0, 6));
	System.out.println(l.subList(6, 9));
	
	}
}
