
// A class that implements a cardboard box.
class Box {

	private double width;
	private double height;
	private double length;
	private double side;

	// Constructors
	Box (double width, double height, double length) {

		this.width = width;
		this.height = height;
		this.length = length;
	}

	Box (double side) {
		this.side = side;
	}

	// Métodos

	public double getWidth() {
		return this.width;
	}

	public double getHeight() {
		return this.height;
	}

	public double getLength() {
		return this.length;
	}

	// Fixing problems, declaring required methods.

	public double area() {

		// Area = Width * Height
		return (this.width * this.height);

	}

	public double volume() {

		// Volume = Width * Height * Length
		return (this.width * this.height * this.length);

	}

	// Bigger Box
	public Box biggerBox (Box oldBox) {
		return new Box (1.25 * oldBox.getWidth(), 1.25 * oldBox.getHeight(), 1.25 * oldBox.getLength());
	}

	// Smaller Box
	public Box smallerBox (Box oldBox) {
		return new Box (0.75 * oldBox.getWidth(), 0.75 * oldBox.getHeight(), 0.75 * oldBox.getLength());
	}

}