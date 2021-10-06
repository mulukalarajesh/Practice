package Practice;

public class ArraySort {
public static void main(String[] args) {
	
	int []a= {50,10,20,30,40};

	for(int i=0;i<a.length;i++) {
		
		
		for(int j=i+1;j<a.length;j++) {
			int temp=0;
			if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
			
				a[j]=temp;
				
				
			}
			
			
		}
	}
	
	System.out.println(a[4]);
	
}
}
