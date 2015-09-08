import static org.junit.Assert.*;

import org.junit.Test;


public class Point2DTest {

	@Test
	public void testAdd() {
		  Point2D p1 = new Point2D();
		  Point2D p2 = p1.add(3, 5);
		  assertEquals("p2.x = 3", 3, p2.x);
		  assertEquals("p2.y = 5", 5, p2.y);
		}
	@Test
	public void testTranslate() {
		  Point2D p1 = new Point2D(3,5);
		  Point2D p2 = new Point2D(4,6);
		  p2.translate(p1);
		  assertEquals("p2.x = 3", 3, p2.x);
		  assertEquals("p2.y = 5", 5, p2.y);
		}
	@Test
	public void testDistance() {
		  Point2D p1 = new Point2D();
		  double dist = p1.distance(3.0, 4.0);
		  assertEquals("distance = 5", 5, dist, 0);
	
		}
	@Test
	public void testToString() {
		  Point2D p1 = new Point2D(7,9);
		  String point = p1.toString();
		  assertEquals("String = (7, 9)", "(7, 9)",point);
	
		}


}