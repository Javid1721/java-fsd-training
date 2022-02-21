//Write Two program  to implement method overriding. Create 2 parent classes with methods each, which are overridden.
package java_training2;

public class MethodRide1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trees f = new MangoTree(); //
		Trees s = new Trees();
		Sea h = new River();
		River i = new River();
		f.grow();
		f.cut();
		h.flow();
		s.grow();
		i.flow();
		i.wave();
	}

}
 class Trees {
	 void grow()
	 {
		 System.out.println("All Trees are growing");
	 }
	 void cut()
	 {
		 System.out.println("Trees are cutting");
	 }
 }

 class MangoTree extends Trees {
	 void grow()
	 {
		 System.out.println("Mango tree is growing");
	 }
	 void cut()
	 {
		 System.out.println("Mango Tree is cutting");
	 }
 }
 
 class Sea {
	 void flow()
	 {
		 System.out.println("Sea is flowing ");
	 }
	 void wave()
	 {
		 System.out.println("Sea is waving ");
	 }
 }
 class River extends Sea {
	 void flow()
	 {
		 System.out.println("River is flowing ");
	 }
	 void wave()
	 {
		 System.out.println("River is waving ");
	 }
 }