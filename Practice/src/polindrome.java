
public class polindrome {
public static void main(String[] args) {

String s="rar";
String temp="";
if(s.length()<0){
System.out.println("s is polindrome");
}

for(int i=s.length()-1;i>=0;i--){
	temp=temp+s.charAt(i);

	
}
if(s.equals(temp)){
System.out.println("polindrome");
}
}
}
