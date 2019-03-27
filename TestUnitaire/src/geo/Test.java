package geo;

public class Test {

	public static void main(String[] args) {
		System.out.println("formes");
		
		 Point p = new Point( 5 , 5);
		 System.out.println(p);
		
		 p.deplacer(new Point(3,3));
		 System.out.println(p);
		
		 Segment s1 = new Segment(new Point(1, 1), new Point(2, 2));
		 Segment s2 = new Segment(new Point(2, 2), new Point(2, 1));
		 System.out.println("first segment: " + s1.taille() + " second segment " + s2.taille());
		 s1.afficher();
		 s1.deplacer(new Point(5, 5));
		 System.out.println(s1);

		 Triangle t1 = new Triangle(new Point(0, 0), new Point(0, 4), new Point(3, 0));
		 t1.deplacer(new Point(0,0));
		 t1.type();
		 System.out.println(t1);

		 Rectangle r1 = new Rectangle(new Point(1, 1), new Point(1, 3), new Point(2,3), new Point(2,1));
		 if(r1.realRectangle() == true){
		 	System.out.println("real rect");
		 }else{
			 System.out.println("false rect");
		 }
		 System.out.println(r1.surface());
		 r1.deplacer(new Point(0,0));
		 System.out.println(r1);

	}

}
