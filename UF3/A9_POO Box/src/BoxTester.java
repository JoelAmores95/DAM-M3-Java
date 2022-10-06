class BoxTester {

	public static void main (String[] args) {

		Box box = new Box(2.5, 5.0, 6.0);

		// De primeras no compila porque los métodos que usa ( area(), volume() )
		// no están declarados en la clase Box, se deben declarar allí.

		System.out.println("Area: " + box.area() + " volume: " + box.volume());

		// Las propiedades son privadas, no tiene acceso esta clase.
		// Las opciones para solucionarlo son:

		// 1 - Hacer públicas las propiedades (NO)
		// 2 - Hacer uso de los metodos getX() para tener el valor (SÍ)
		// X = parámetro a buscar

		System.out.println("Length: " + box.getLength() + " height: " + box.getHeight() + ", width: " + box.getWidth());

		// Hago una caja un 25% más grande
		Box biggerBox = box.biggerBox(box);
		System.out.println("Length: " + biggerBox.getLength() + " height: " + biggerBox.getHeight() + ", width: " + biggerBox.getWidth());

		// Hago una caja un 25% más pequeña
		Box smallerBox = box.smallerBox(box);
		System.out.println("Length: " + smallerBox.getLength() + " height: " + smallerBox.getHeight() + ", width: " + smallerBox.getWidth());
	}



}
