import java.util.Scanner;

public class miniproject {
 public static void main(String args[]) {
	 
	 char repeat = 'y';
	 Scanner sc = new Scanner(System.in);
	 
	 while(repeat == 'y' || repeat == 'Y') {
		 
		 System.out.println("1. Addition Program");
		 System.out.println("2. Swap");
		 System.out.println("3. Even or odd");
		 System.out.println("4. prime");
		 System.out.println("please select your choice of program :");
		 System.out.println("For git");
		 
		 int choice = sc.nextInt();
		 
		 switch(choice) {
		 case 1 : swap() ; break;
		 case 2 : addition(); break;
		 case 3 : evenodd(); break;
		 case 4 : prime(); break;
		 
		 default : System.out.println("Entered choice is wrong...");
		 }
		 
		 System.out.println("Do you want to continue....");
		 repeat = sc.next().charAt(0);
	 }
	 
	 System.out.println("*********Thanks for visting my project ....visit again....*****");
 }
 
 // This function is of swap of two variables....
 public static void swap() {
	 int a = 10 , b = 20 ;
	 
	 System.out.println("Before swap a-"+a+" and b="+b);
	 int temp = a;
	 a = b;
	 b = temp;
	 System.out.println("After swap a-"+a+"and b="+b);
 }
 // Ended swap program
 
 
 // This function is of addition of two variables....
  public static void addition() { 
	  int a = 10 , b = 20 ;
	  int c = a + b;
	  System.out.println(c);
  }
  // Ended addition program
  
  
  // This function is of even or odd
  public static void evenodd() {
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a number to known even or odd:");
	  int num = sc.nextInt();
	  
	  if(num % 2 == 0) 
		  System.out.println("It is even number....");
	  else
		  System.out.println("It is odd number....");
  }
  // Ended evenodd program
  
  
  // This function is to find prime number
  public static void prime() {
	  
	  
  }
}
