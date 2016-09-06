import java.lang.Math;

public class MyAlgorithm {

  public double findLargestDistance (Pointd[] points)
  {
  	double max = 0;
  	for(Pointd point : points) {
  		for(Pointd point1 :  points) {
  			double x = Math.pow(point.x - point1.x, 2);
  			double y = Math.pow(point.y - point1.y, 2);
  			double fin = Math.sqrt(x+y);
  			if(fin > max)
  				max = fin;
  		}
  	}
  	return max;
  }
}
