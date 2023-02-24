package week1.day2;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		
 int Range=10;
 int firstnum=0;
 int secnum=1;
 System.out.println(firstnum);
 System.out.println(secnum);
 for (int i=0;i<=Range--;i++) {
	 int sum= firstnum+secnum;
	 System.out.println(sum);
	 firstnum=secnum;
	 secnum=sum;
	 
	 
	 
 }
 
	}

}
