package pkg;


public class Segment extends Graphics {
	Segment(Point a, Point b){
		this.p1 = a;
		this.p2 = b;
	}


	
	@Override
	public String toString() {
		return ("Segment " + this.p1.toString() + this.p2.toString());
	}
	
	
	@Override
	public void deplacer(Point p) {
		
		
		Point ptmp= new Point (this.p1.dist_x(p),this.p1.dist_y(p));
		p2.deplacer(ptmp);
		this.p1.deplacer(p);
	}
	
	Point p1;
	Point p2;
	
}
