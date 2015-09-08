import java.lang.Math;

public class Point2D {
public int x;
public int y;

public Point2D(){
	this.x = 0;
	this.y = 0; 
}

public Point2D(int s, int r){
	this.x = s;
	this.y = r;
}
	
	public Point2D add(int dx, int dy)
	{
		Point2D p = new Point2D(x+dx, y+dy);
		return p;
	}
	
	public void translate(Point2D point){
		this.x = point.x;
		this.y = point.y;
	}
	
	public double distance(double x, double y)
	{
		double distance;
		distance = Math.sqrt(Math.pow((this.x -x), 2) + Math.pow((this.y -y), 2));
		return distance;
	}
	
	public String toString()
	{
		String str = "(" + x + ", " +y  +")";
		return str;
	}	
	
}
