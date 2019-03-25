import java.io.*;


public class Rectangle extends Graphics {
	Rectangle(Point a, Point b, Point c, Point d){
                this.s1 = new Segment(a,b);
                this.s2 = new Segment(b,c);
                this.s3 = new Segment(c,d);
                this.s4 = new Segment(a,d);
	}
	
	@Override
	public String toString() {
		return ("Rectangle:\n Segment 1 = " + this.s1.toString() + "\n Segment 2 = " + this.s2.toString() + "\n Segment 3 = " + this.s3.toString() + "\n Segment 4 = " + this.s4.toString());
	}
	
	
	@Override
	public void deplacer(Point p) {
                Point tmp = new Point(s1.p1.getX(),s1.p1.getY());
                Point ptmp = new Point (tmp.dist_x(p),tmp.dist_y(p));
                s1.deplacer(p);
                s4 = new Segment(tmp,s4.p2);
                s4.deplacer(p);
                s2.p2.deplacer(new Point(s2.p2.getX() - ptmp.getX(),s2.p2.getY() - ptmp.getY()));
        }
        
        public boolean realRectangle(){
                if(this.s1.taille() == this.s3.taille() && this.s2.taille() == this.s4.taille() && this.s1.taille() != this.s2.taille())
                        return true;
                else{
                        System.out.println("segment " + this.s1.taille() + " segment " + this.s2.taille() + " segment " + this.s3.taille() + " segment " + this.s4.taille());
                        return false;
                }
        }

        public double surface(){
                return this.s1.taille() * this.s2.taille();
        }
	
    private Segment s1;
    private Segment s2;
    private Segment s3;
    private Segment s4;
    
    
}
