package class8;

public class square extends shape{
	float side;

	public square() {
		side = 2.0f;
	}
	public square(float side) {
		this.side = side;
	}
	@Override
	void calArea() {
		super.area = side*side;
	}
}
