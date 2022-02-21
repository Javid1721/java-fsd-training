//Write a program to implement Multi-level inheritance. Include atleast 3 classes.
package java_training2;

public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c=new Course(); 
		c.rollno();	 
		c.dname();
		c.code(); 
		}
	}
class Student { 
	void rollno() {
			System.out.println("BT-39");}  
}  
class Dept extends Student {  
	void dname(){
			System.out.println("Computer Science");
}  
}  
 class Course extends Dept
{  
	void code() {
		System.out.println("MA101");
}  
}  