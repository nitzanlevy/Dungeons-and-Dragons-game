package Control;

import java.util.Random;

public class RandomNumber implements RandomGenerator {
	Random r;
	
	public RandomNumber() {
		r = new Random(123);
	}
	
	@Override
	public int nextInt(int n) {
		return r.nextInt(n);
	}

}
