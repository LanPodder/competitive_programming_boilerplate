import java.math.BigInteger;

public class FibonacciSequence {
	public static void main(String[] args) {
		FibonacciSequence seq = new FibonacciSequence();
		for(int i = 0; i < 100; i++) {
			System.out.println(seq.next().toString());
		}
	}
	
	private BigInteger first;
	private BigInteger second;

	public FibonacciSequence() {
		second = BigInteger.ONE;
		first = BigInteger.ZERO;
	}

	public BigInteger next() {
		BigInteger returnVal = second;
		updateValues();
		return returnVal;
	}

	private void updateValues() {
		BigInteger t = second;
		second = first.add(t);
		first = t;
	}
}