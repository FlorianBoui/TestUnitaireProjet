import java.io.*;

public class Test {

	public static void main(String[] argc) {
		System.out.println("formes");
		
		Point p = new Point( 5 , 5);
		System.out.println(p);
		
		p.deplacer(new Point(3,3));
		System.out.println(p);
		
		Segment s1 = new Segment(new Point(1, 1), new Point(2, 2));
		s1.afficher();
		s1.deplacer(new Point(5, 5));
		s1.afficher();

		Triangle t1 = new Triangle(new Point(1, 1), new Point(2, 2), new Point(3,3));
		t1.deplacer(new Point(0,0));
	}

}
