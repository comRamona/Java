public class Arrangements {
    private boolean[] used;
    private StringBuilder out = new StringBuilder();
    private final String in;
    private int n;
    public Arrangements( final String str, int n ){
        in = str;
        used = new boolean[ in.length() ];
        this.n=n;
    }
    public void arrange( ){
        if( out.length()==n){
            System.out.println( out );
            return;
        }
        for( int i = 0; i < in.length(); ++i ){
            if( used[i] ) continue;
            out.append( in.charAt(i) );
            used[i] = true;
            arrange();
            used[i]=false;
            out.setLength( out.length() - 1 );
        }
    }
public static void main(String[] args){
 Arrangements a=new Arrangements("abc",2);
 a.arrange();
}
}