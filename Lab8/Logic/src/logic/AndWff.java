package logic;

public class AndWff extends BinaryWff { 
public AndWff(Wff left, Wff right)
{super(left,right); setOp(Operator.AND);}

/*public boolean eval(Valuation val){
    if(getLeft() instanceof PropVar&&getRight() instanceof PropVar) return (val.get((PropVar)getLeft()))&&(val.get((PropVar)getRight()));
    if(getLeft() instanceof PropVar) return (val.get((PropVar)getLeft()))&&(getRight().eval(val));
    if(getRight() instanceof PropVar) return (val.get((PropVar)getRight()))&&(getLeft().eval(val));
    return getRight().eval(val)&&getLeft().eval(val);*/
	
	public boolean eval(Valuation val){
		return (getLeft().eval(val)&&getRight().eval(val));
	}

}

