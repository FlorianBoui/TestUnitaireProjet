package pkg;

public class Triangle extends Graphics {
	Triangle(Point a, Point b, Point c){
		this.p1 = a;
        this.p2 = b;
        this.p3 = c;
        this.s1 = new Segment(p1,p2);
        this.s2 = new Segment(p1,p3);
        this.s3 = new Segment(p2,p3);

	}
	
	@Override
	public String toString() {
		return ("Segment " + this.p1.toString() + this.p2.toString() + this.p3.toString());
	}
	
	
	@Override
	public void deplacer(Point p) {
        Point tmp = new Point(p1.getX(),p1.getY());
        System.out.println("seg before moving 1 " + this.s1.p1 + this.s1.p2);
        s1.deplacer(p);
        System.out.println("seg before moving 1 " + this.s1.p1 + this.s1.p2);
        
        s2 = new Segment(tmp,s2.p2);
        System.out.println("seg before moving 2 " + this.s2.p1 + this.s2.p2);
        s2.deplacer(p);
        System.out.println("seg after moving 2 " + this.s2.p1 + this.s2.p2);
        
        // System.out.println(this.p1);
        // System.out.println(this.p2);
        // System.out.println(this.p3);


	}
	
	private Point p1;
    private Point p2;
    private Point p3;
    private Segment s1;
    private Segment s2;
    private Segment s3;
    
}
