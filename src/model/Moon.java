package model;

public class Moon {

	double xPositionMoon;
	double xPositionCrater1;
	double xPositionCrater2;
	double xPositionCrater3;

	public Moon(double xPositionMoon, double xPositionCrater1, double xPositionCrater2, double xPositionCrater3) {
		this.xPositionMoon = xPositionMoon;
		this.xPositionCrater1 = xPositionCrater1;
		this.xPositionCrater2 = xPositionCrater2;
		this.xPositionCrater3 = xPositionCrater3;
	}
	public double getxPositionMoon() {
		return xPositionMoon;
	}
	public void moveRight() {
		xPositionMoon += 10;
		xPositionCrater1 += 10;
		xPositionCrater2 += 10;
		xPositionCrater3 += 10;
	}
	
	public void moveLeft() {
		xPositionMoon -= 10;
		xPositionCrater1 -= 10;
		xPositionCrater2 -= 10;
		xPositionCrater3 -= 10;
	}
	
	public double[] getPositions() {
		double[] xPositions = {xPositionMoon, xPositionCrater1,xPositionCrater2,xPositionCrater3};
		return xPositions;
	}
}
