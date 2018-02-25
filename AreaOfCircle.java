
public class AreaOfCircle {
	private double radius;
	
	public AreaOfCircle(double radius){
		radius = 0;
	}
	
	public double getradius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double Area() {
		return radius*radius*Math.PI;
	}

}
