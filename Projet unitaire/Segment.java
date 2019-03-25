import java.io.*;


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
		Point ptmp = new Point (this.p1.dist_x(p),this.p1.dist_y(p));
		p2.deplacer(new Point(p2.getX() - ptmp.getX(),p2.getY() - ptmp.getY()));
		this.p1.deplacer(p);
	}

	public double taille(){
		return Math.sqrt(Math.pow((double)this.p2.getX() - (double)this.p1.getX(), 2) + Math.pow((double)this.p2.getY() - (double)this.p1.getY(), 2));
	}
	
	public Point middle(){
		return new Point((p1.getX() + p2.getX())/2 , (p1.getY() + p2.getY())/2);
	}

	Point p1;
	Point p2;
	
}
