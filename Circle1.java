package Bai1;

public class Circle1 {
	private double radius =1.0;
	private String color = "red";
	 
	public Circle1(){
		this.radius=1.0;
		this.color = "red";
	}
	public Circle1(double radius){
		this.radius = radius;
	}
	public Circle1(double radius,String color){
		this.radius = radius;
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea(){
		return radius*radius*3.14;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", Area="
				+ getArea() + "]";
	}
	
	
}
