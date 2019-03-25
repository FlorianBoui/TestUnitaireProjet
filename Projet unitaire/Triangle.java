import java.io.*;


public class Triangle extends Graphics {
	Triangle(Point a, Point b, Point c){
        this.s1 = new Segment(a,b);
        this.s2 = new Segment(a,c);
        this.s3 = new Segment(b,c);

	}
	
	@Override
	public String toString() {
		return ("Triangle " + this.s1.p1.toString() + this.s1.p2.toString() + this.s3.p2.toString());
	}
	
	
	@Override
	public void deplacer(Point p) {
        Point tmp = new Point(s1.p1.getX(),s1.p1.getY());
        s1.deplacer(p);
        s2 = new Segment(tmp,s2.p2);
        s2.deplacer(p);
        s3 = new Segment(s1.p2,s2.p2);


        }

        public void type(){
                double dist1 = s1.taille();
                double dist2 = s2.taille();
                double dist3 = s3.taille();
                double distc1 = dist1*dist1;
                double distc2 = dist2*dist2;
                double distc3 = dist3*dist3;
                if(dist1 == dist2 && dist2 == dist3){
                        System.out.println("triangle equilateral");
                }else if(dist1 == dist2 || dist2 == dist3 || dist3 == dist1){
                        System.out.println("triangle isocèle");        
                }else if(distc1 + distc2 == distc3 || distc1 + distc3 == distc2 || distc3 + distc2 == distc1){
                        System.out.println("triangle rectangle");      
                }else{
                        System.out.println("triangle quelconque");
                }
        }
        
        public double surface(){
                double dist1 = s1.taille();
                double dist2 = s2.taille();
                double dist3 = s3.taille();
                double distc1 = dist1*dist1;
                double distc2 = dist2*dist2;
                double distc3 = dist3*dist3;
                if(dist1 == dist2 && dist2 == dist3){
                        System.out.println("triangle equilateral");
                        return (Math.sqrt(3)/4) * s1.taille();
                }else if(dist1 == dist2 || dist2 == dist3 || dist3 == dist1){
                        System.out.println("triangle isocèle");
                        if(dist1 == dist2){
                                Point need = s3.middle();
                                Segment need2 = new Segment(need,s1.p1);
                                return (dist3 * need2.taille()) / 2; 
                        }else if(dist2 == dist3){
                                Point need = s1.middle();
                                Segment need2 = new Segment(need,s2.p2);
                                return (dist1 * need2.taille()) / 2; 
                        }else if(dist1 == dist3){
                                Point need = s2.middle();
                                Segment need2 = new Segment(need,s3.p1);
                                return (dist2 * need2.taille()) / 2; 
                        }        
                }else if(distc1 + distc2 == distc3 || distc1 + distc3 == distc2 || distc3 + distc2 == distc1){
                        System.out.println("triangle rectangle");
                        if(distc1 + distc2 == distc3){
                                Point need = s3.middle();
                                Segment need2 = new Segment(need,s1.p1);
                                return (dist3 * need2.taille()) / 2; 
                        }else if(distc3 + distc2 == distc1){
                                Point need = s1.middle();
                                Segment need2 = new Segment(need,s2.p2);
                                return (dist1 * need2.taille()) / 2; 
                        }else if(distc1 + distc3 == distc2){
                                Point need = s2.middle();
                                Segment need2 = new Segment(need,s3.p1);
                                return (dist2 * need2.taille()) / 2; 
                        }       
                }else{
                        System.out.println("triangle quelconque");
                        float semiperimeter = (dist1 + dist2 + dist3)/2;
                        return Math.sqrt(semiperimeter * (semiperimeter - dist1) * (semiperimeter - dist2) * (semiperimeter - dist3));
                }

        }
	
    private Segment s1;
    private Segment s2;
    private Segment s3;
    
}
