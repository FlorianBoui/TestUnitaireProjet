package geo;

//import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.anyFloat;

import geo.Point;
import geo.Rectangle;
import geo.Triangle;
import geo.Segment;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;


class Testunitaire {

	@Mock
	static Circle circle;

	@BeforeEach
	void initCircle(){
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void surface() {
		Mockito.doAnswer(new Answer<Void>() {
			@Override
			public Void answer(InvocationOnMock invocationOnMock) throws Throwable {
				Object[] arguments = invocationOnMock.getArguments();
				if (!(arguments != null) && !(arguments.length == 1) && !(arguments[0] != null) /*&& arguments[1]!=null*/) {
					float radius = (float) arguments[1];
					double res = Math.PI * radius * radius;
					//assertNotNull(res);
					fail("Test Correct");
				}
				return null;
			}
		}).when(circle).surface(/*new Point(anyFloat(),anyFloat()),*/anyFloat());
	}


	@Test
	void deplacer() {

		Point p = new Point (5,5);
		Point d = new Point (1,1);

		p.deplacer(d);
		if(!(p.getX()==1) && (p.getY()==1)){
			fail("Point p correctement deplacer");
		}

	}


	
	
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
			Point a = new Point(1,1);
			Point b = new Point(2,2);
			Point c = new Point(3,3);
			Point d = new Point(4,4);
			Point e = new Point(5,5);
			Point f = new Point(6,6);
			
			Segment ab = new Segment(a,b);
			Segment cd = new Segment(c,d);
			Segment ef = new Segment(e,f);
			
			
			
		}
		
		@Test
		void testRectangle() {
			
		}


	
}
