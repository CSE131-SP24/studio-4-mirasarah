package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(Color.black);
		StdDraw.rectangle(.5, .5, .4, .3);
		StdDraw.setPenColor(Color.yellow);
		StdDraw.filledRectangle(.5, .5, .4, .3);
		
		StdDraw.setPenColor(Color.pink);
		StdDraw.filledRectangle(.5, .5, .35, .25);
		
		StdDraw.setPenColor(Color.yellow);
		StdDraw.filledCircle(.5, .5, .15);
		
		StdDraw.setPenColor(Color.black);
		StdDraw.ellipse(.5, .47, .09, .075);
		
		StdDraw.setPenColor(Color.yellow);
		StdDraw.filledRectangle(.5, .5, .1, .05);
		
		StdDraw.setPenColor(Color.black);
		StdDraw.filledEllipse(.45, .55, .01, .01);
		
		StdDraw.setPenColor(Color.black);
		StdDraw.filledEllipse(.55, .55, .01, .01);
		
		StdDraw.text(.5, .7, "BE HAPPY");
		StdDraw.text(.5, .3, "BITCHES");
		
	}
}