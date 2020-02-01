import java.awt.Color;

public class Voronoi {

	public static double pointDist(Point2D point1, Point2D point2) {

		double distance = 0.0;

		int x1 = point1.getX();
		int x2 = point2.getX();
		int y1 = point1.getY();
		int y2 = point1.getY();

		distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

		return distance;
	}

	public static int findClosestPoint(Point2D point, Point2D[] sites) {

		double d =pointDist(point, sites[0]);
		int min = 0;

		for (int i = 0; i < sites.length - 1; i++) {
			
			if(d <=pointDist(point,sites[i])){
			
			d= pointDist(point,sites[i]);	
			min = i;
			}
		}

		return min;
	}

	public static int[][] buildVoronoiMap(Point2D[] sites, int width, int height) {

		int w = width;
		int h = height;
		int[][] indexmap = new int[w][h];

		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {

				indexmap[i][j] = findClosestPoint(new Point2D(i, j), sites);

			}
		}

		return indexmap;

	}

	public static void plotVoronoiMap(Point2D[] sites, Color[] colors, int[][] indexMap) {

		int width = indexMap.length;
		int height = indexMap[0].length;

		StdDraw.setCanvasSize(width, height);
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);

		for (int i = 0; i < width; i++) {

			for (int j = 0; j < height; j++) {

				StdDraw.setPenColor(colors[indexMap[i][j]]);

				StdDraw.point(i, j);

			}

		}

		StdDraw.setPenColor(Color.BLACK);

		for (int k = 0; k < sites.length; k++) {
			StdDraw.filledCircle(sites[k].getX(), sites[k].getY(), 3.0);
		}

	}

	public static void main(String[] args) {
		int width = 200;
		int height = 200;

		int nSites = 5;
		Point2D[] sites = new Point2D[nSites];
		sites[0] = new Point2D(50, 50);
		sites[1] = new Point2D(100, 50);
		sites[2] = new Point2D(50, 100);
		sites[3] = new Point2D(125, 50);
		sites[4] = new Point2D(100, 175);

		Color[] colors = new Color[nSites];
		colors[0] = Color.BLUE;
		colors[1] = Color.GREEN;
		colors[2] = Color.YELLOW;
		colors[3] = Color.ORANGE;
		colors[4] = Color.MAGENTA;

		int[][] indexmap = buildVoronoiMap(sites, width, height);
		plotVoronoiMap(sites, colors, indexmap);

	}

}