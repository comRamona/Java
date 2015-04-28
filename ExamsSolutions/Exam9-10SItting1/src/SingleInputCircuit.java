
public class SingleInputCircuit implements Circuit {

	Circuit input;
	SingleInputGate op;
	
	public SingleInputCircuit( Circuit input, SingleInputGate op ) {
		this.input = input;
		this.op = op;
	}
	
	public boolean output() {
		return op.apply( input.output() );
	}

}
