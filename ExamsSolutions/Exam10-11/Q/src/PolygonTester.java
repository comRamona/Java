public class PolygonTester {

	public static void drawPolygon(Polygon poly) {

		Vector[] vs = poly.getVectors();
		Point[] bbox = poly.boundingBox();

		int width = bbox[1].getX() - bbox[0].getX();
		int height = bbox[1].getY() - bbox[0].getY();

		StdDraw.setCanvasSize(width * 100, height * 100);
		StdDraw.setXscale(bbox[0].getX(), bbox[1].getX());
		StdDraw.setYscale(bbox[0].getY(), bbox[1].getY());

		StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
		StdDraw.rectangle(bbox[0].getX() + width / 2.0, bbox[0].getY() + height
				/ 2.0, width / 2.0, height / 2.0);

		StdDraw.setPenColor();

		Point p = new Point();

		for (Vector v : vs) {
			Point q = v.translate(p);
			StdDraw.line(p.getX(), p.getY(), q.getX(), q.getY());
			p = q;
		}

	}

	public static String bboxstring(Point[] p) {
		return "(" + p[0].getX() + ", " + p[0].getY() + ") x (" + p[1].getX()
				+ ", " + p[1].getY() + ")";
	}

	public static void main(String[] args) {

		Vector v1 = new Vector(2, 2);
		Vector v2 = new Vector(3, -4);
		Vector v3 = new Vector(-5, 2);

		Vector[] vs = { v1, v2, v3 };

		Polygon p = new Polygon(vs);

		System.out.printf(
				"Method: perimeter\n\tExpected: 13.21\n\tActual: %.2f\n",
				p.perimeter());

		System.out.println("Method: isClosed\n\tExpected: true\n\tActual: "
				+ p.isClosed());

		System.out.printf("Method: area\n\tExpected: 7.00\n\tActual: %.2f\n",
				p.area(), p.area());

		System.out
				.println("Method: boundingBox\n\tExpected: (0, -2) x (5, 2)\n\tActual: "
						+ bboxstring(p.boundingBox()));

		drawPolygon(p);

	}

}
