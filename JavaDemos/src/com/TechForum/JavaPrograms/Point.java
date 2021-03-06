package com.TechForum.JavaPrograms;

public class Point {
	double x;
	double y;
	double dis;
	public Point() {

	}
	Point(double x, double y) {
		 this.x = x;
		 this.y = y;

	}

	public static void main(String[] args) {
		Point p = new Point();
		System.out.println("Calling constructors to initialize variables.");
		Point p1 = new Point(4,4);
		Point p2 = new Point(8,8);
		System.out.println();
		System.out.println("Passing the objects p1 and p2 to calculate distance");
		double ans = p.distance(p1, p2);
		System.out.println("Distance between" + "(4.0,4.0)," + "(8.0,8.0)===>" + ans);
	}

	public double distance(Point p1, Point p2) {
		
		double x1 = p1.x;
		System.out.println("x1="+x1);
		double y1 = p1.y;
		System.out.println("y1="+y1);
		double x2 = p2.x;
		System.out.println("x2="+x2);
		double y2 = p2.y;
		System.out.println("y2="+y2);
		dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return dis;
	}
}
