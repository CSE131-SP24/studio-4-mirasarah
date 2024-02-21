package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File

		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean filled = in.nextBoolean();
		if (shape.equals("ellipse")) {
			double centerX = in.nextDouble();
			double centerY = in.nextDouble();
			double halfLength = in.nextDouble();
			double halfWidth = in.nextDouble();
			if (filled == false) {
				Color shade = new Color(red, green, blue);
				StdDraw.setPenColor(shade);
				StdDraw.ellipse(centerX, centerY, halfWidth, halfLength);
			}
			else {
				Color shade = new Color(red, green, blue);
				StdDraw.setPenColor(shade);
				StdDraw.filledEllipse(centerX, centerY, halfWidth, halfLength);

			}
		}
		if (shape.equals("rectangle")) {
			double centerX = in.nextDouble();
			double centerY = in.nextDouble();
			double halfLength = in.nextDouble();
			double halfWidth = in.nextDouble();
			if (filled == false) {
				Color shade = new Color(red, green, blue);
				StdDraw.setPenColor(shade);
				StdDraw.rectangle(centerX, centerY, halfWidth, halfLength);
			}
			else {
				Color shade = new Color(red, green, blue);
				StdDraw.setPenColor(shade);
				StdDraw.filledRectangle(centerX, centerY, halfWidth, halfLength);

			}
		}
		if	(shape.equals("triangle")) {
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			Color shade = new Color(red, green, blue);
			StdDraw.setPenColor(shade);
			double[] x = { x1, x2, x3};
			double[] y = {y1, y2, y3};
			if(filled == false){
				StdDraw.polygon(x, y);
			}
			else {
				StdDraw.filledPolygon(x, y);



			}	

		}



	}

}
