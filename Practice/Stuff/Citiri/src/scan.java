import java.util.Scanner;

class scan{
 static String str() {Scanner r=new Scanner(System.in);
             String q=r.next();
             r.close();
             return q;
             }
 static int in(){ Scanner r=new Scanner(System.in);
          int i=r.nextInt();
          r.close();
          return i; }
 static float fl() { Scanner r=new Scanner(System.in);
 float i=r.nextFloat();
 r.close();
 return i; }
 }