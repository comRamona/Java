public class Combinations {
    private StringBuilder out = new StringBuilder();
    private final String in;
    private int n;
    public Combinations( final String str, int n ){
        in = str;
        this.n=n;
    }
    public void combine(int k ){
        if( out.length()==n){
            System.out.println( out );
            return;
            
        }
        for( int i = k; i < in.length(); ++i ){
            out.append( in.charAt(i) );
            combine(i+1);
            out.setLength( out.length() - 1 );
        }
    }
public static void main(String[] args){
 Combinations a=new Combinations("abcd",3);
 a.combine(0);
}

}
