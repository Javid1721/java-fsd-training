package java_training2;

public class MethodRide2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colour s;
		s = new Red();
		s.paint();
		s.spray();
		s = new LightRed();
		s.paint();
		s.spray();
	}

}
 class Colour {
	 void paint()
	 {
		 System.out.println("Colors are painted");
	 }
	 void spray()
	 {
		 System.out.println("Colors are spraying");
	 }
	 
 }
  class Red extends Colour {
	  void paint()
	  {
		  System.out.println("red is painted");
	  }
	  void spray()
		 {
			 System.out.println("red is spraying");
		 }
  }
  class LightRed extends Red {
	  void paint()
	  {
		  System.out.println("light red is painted");
	  }
	  void spray()
		 {
			 System.out.println("light red is spraying");
		 }
  }