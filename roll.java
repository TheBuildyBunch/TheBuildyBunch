public class NewDimension {
	private double width;
	private double height;
	private double depth;

	public NewDimension(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getVolume() {
		return width * height * depth;
	}

	public double getSuperficialArea() {
		return (2 * (width  * height)) + (2 * (width * depth)) + (2 * (height * depth));
	}

	public double getDiagonal() {
		return Math.sqrt((width * width) + (height * height) + (depth * depth));
	}

	public void printDimensions() {
		System.out.println("Width is " + width);
		System.out.println("Height is " + height);
		System.out.println("Depth is " + depth);
	}
}