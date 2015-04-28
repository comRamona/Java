
public class Input implements Circuit {

	boolean value;
	
	public Input() {
		this.value = false;
	}
	
	public void setValue( boolean value ) {
		this.value = value;
	}
	
	public boolean output() {
		return  value;
	}

}
