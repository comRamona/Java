
public class DoubleInputCircuit implements Circuit{
     Circuit input1, input2;
     DoubleInputGate op;
     public DoubleInputCircuit(Circuit input1, Circuit input2, DoubleInputGate op){
    	 this.input1=input1;
    	 this.input2=input2;
    	 this.op=op;
     }
     public boolean output(){
    	return  op.apply(input1.output(), input2.output());
     }
}
