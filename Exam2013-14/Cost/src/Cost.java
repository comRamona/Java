
public class Cost {
private int amount;
private String currency;
private static final String ps="pounds sterling", us="US dollars", eu="euros";
public Cost() {amount=0; currency="pounds sterling";}
public void setCurrency(String s) { if(s.equals(ps)||s.equals(us)||s.equals(eu)) currency=s;}
public String getCurrency() {return currency;}
public void setAmount(int n) {if(n>=0) amount=n;}
public int getAmount(){ return amount; }
public String secret() {String r=new String("S1427590"); return r; }
public void convert(String newCurrency, double rate){
	if(newCurrency.equals(ps)||newCurrency.equals(us)||newCurrency.equals(eu)){ setCurrency(newCurrency); setAmount((int)Math.round((double) amount/rate));
	}}
public String toString() {return String.format("%d %s",amount,currency); }
public static void main(String[] args) {
	Cost c=new Cost();
	c.setAmount(5);
	c.setCurrency("pounds sterling");
	c.convert("euros", 1.2);
	c.convert("lei",80);  //do nothing
	System.out.println(c.toString());
}
}
