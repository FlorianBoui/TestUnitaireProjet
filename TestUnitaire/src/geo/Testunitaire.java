package geo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testunitaire {

	@Test
	void test() {
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
	}

}
