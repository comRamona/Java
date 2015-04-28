public class CircuitTester {

	public void TestOr() {
		System.out.println("\nTesting OrGate");
		Input in1 = new Input();
		Input in2 = new Input();
		Circuit or = new DoubleInputCircuit(in1, in2, new OrGate());
		for (int i = 0; i < 2; i++) {
			in1.setValue(i == 1);
			for (int j = 0; j < 2; j++) {
				in2.setValue(j == 1);
				System.out
						.printf("Input: %s, %s\t", in1.output(), in2.output());
				boolean o = or.output();
				System.out.printf("Output: %s\t", o);
				boolean success = (o == (in1.output() || in2.output()));
				System.out.printf("Result: %s\n", (success ? "Success"
						: "Failure"));
			}
		}
	}

	/* ********************************************************
	 * All the following tests are to be added by the students
	 * *********************************************************
	 */

	public void TestAnd() {
		// ADD CODE HERE
		System.out.println("\nTesting AndGate");
		Input in1 = new Input();
		Input in2 = new Input();
		Circuit and = new DoubleInputCircuit(in1, in2, new AndGate());
		for (int i = 0; i < 2; i++) {
			in1.setValue(i == 1);
			;
			for (int j = 0; j < 2; j++) {
				in2.setValue(j == 1);
				System.out
						.printf("Input: %s, %s\t", in1.output(), in2.output());
				boolean a = and.output();
				System.out.printf("Output: %s\t", a);
				boolean success = (a == (in1.output() && in2.output()));
				System.out.printf("Result: %s\n", (success ? "Success"
						: "Failure"));
			}
		}

	}

	public void TestNeg() {
		// ADD CODE HERE
		System.out.println("\nTesting NotGate");
		Input in1 = new Input();
		Circuit not = new SingleInputCircuit(in1, new NotGate());
		for (int i = 0; i <= 3; i++) {
			in1.setValue(i % 2 == 0);
			System.out.printf("Input: %s\t", in1.output());
			boolean n = not.output();
			System.out.printf("output: %s\t", n);
			boolean success = (n == !in1.output());
			System.out
					.printf("Result: %s\n", (success ? "Success" : "Failure"));
		}
	}

	public void TestDblNeg() {
		// ADD CODE HERE
		System.out.println("\nTesting DblNeg");
		Input in1 = new Input();
		Input in2 = new Input();
		Circuit one = new SingleInputCircuit(in1, new NotGate());
		Circuit two = new SingleInputCircuit(in2, new NotGate());
		for (int i = 0; i <= 3; i++) {
			in1.setValue(i % 2 == 0);
			System.out.printf("Input: %s\t", in1.output());
			in2.setValue(one.output());
			boolean dn = two.output();
			System.out.printf("output: %s\t", dn);
			boolean success = (dn == in1.output());
			System.out
					.printf("Result: %s\n", (success ? "Success" : "Failure"));
		}

	}

	public void TestXor() {
		// ADD CODE HERE
		System.out.println("\nTesting Xor");
		Input in1 = new Input();
		Input in2 = new Input();
		Circuit nin1 = new SingleInputCircuit(in1, new NotGate());
		Circuit nin2 = new SingleInputCircuit(in2, new NotGate());
		Input in3 = new Input();
		Input in4 = new Input();
		Circuit a1n2 = new DoubleInputCircuit(in1, in4, new AndGate());
		Circuit a2n1 = new DoubleInputCircuit(in2, in3, new AndGate());
		Input i5 = new Input();
		Input i6 = new Input();
		Circuit finalor = new DoubleInputCircuit(i5, i6, new OrGate());
		for (int i = 0; i < 2; i++) {
			in1.setValue(i == 1);
			for (int j = 0; j < 2; j++) {
				in2.setValue(j == 1);
				System.out
						.printf("Input: %s, %s\t", in1.output(), in2.output());
				in3.setValue(nin1.output());
				in4.setValue(nin2.output());
				i5.setValue(a1n2.output());
				i6.setValue(a2n1.output());
				boolean o = finalor.output();
				System.out.printf("Output: %s\t", o);
				boolean success = (o == (in1.output() && !in2.output()) || (!in1
						.output() && in2.output()));
				System.out.printf("Result: %s\n", (success ? "Success"
						: "Failure"));
			}
		}
	}

	public static void main(String[] args) {

		CircuitTester tester = new CircuitTester();

		tester.TestOr();
		tester.TestAnd();
		tester.TestNeg();
		tester.TestDblNeg();
		tester.TestXor();
	}

}
