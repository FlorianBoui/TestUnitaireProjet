package pkg;

public class Point extends Graphics {
	
	Point(float x, float y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		
		return "Point : (" + this.getX()  + " , " + this.getY() + ")" ; 
		
	}
	
	float dist_x (Point p) {
		return this.getX() - p.getX();
	}
	
	float dist_y (Point p) {
		return this.getY() - p.getY();
	}
	
	

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	@Override
	public void deplacer(Point p) {
		this.x = p.x ;
		this.y = p.y ;
		
	}
	
	float x; 
	float y;
	
}
