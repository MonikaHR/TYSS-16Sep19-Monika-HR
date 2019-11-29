
public class TestAbstract {
	public static void main(String[] args) {
		DogAbstract d = new DogAbstract();
		d.makeNoise();

		CatAbstract c = new CatAbstract();
		c.makeNoise();

		SnakeAbstract s = new SnakeAbstract();
		s.makeNoise();

		LionAbstract l = new LionAbstract();
		l.makeNoise();

	}
}
