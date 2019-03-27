package geo;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import geo.Point;
import geo.Rectangle;
import geo.Triangle;
import geo.Segment;


import org.junit.jupiter.api.Test;

class Testunitaire {

	@Test
	void testPoint() {
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

	@Test
	void testPoint2() {
		Point a = new Point(2,2);
		//Point b = new Point(4,4);
		Point d = new Point(1,1);
		
		if(a.getX()==2 || a.getY()==2) {
			assertTrue(true);
		}
		a.deplacer(d);
			if(!(a.getX()==1) && !(a.getY()==1)) {
				fail("Point a correctement deplace.");
			}
	}
	

		@Test
		void testSegment() {
			Point a = new Point(2,2);
			Point b = new Point(4,4);
			Point d = new Point(1,1);
			
			Segment ab = new Segment(a,b);
			if(!(a.getX()==2) && !(a.getY()==2) && !(b.getX()==4) && !(b.getY()==4)) {
				fail("Segment ab correctement placer");
			}
			
			ab.deplacer(d);
			if(!(a.getX()==1)&& !(a.getY()==1)) {
				fail("Segment ab correctement deplacer");
			}
		}

		@Test
		void testTriangle() {
			
		}
		
		@Test
		void testRectangle() {
			
		}
	

	
}
