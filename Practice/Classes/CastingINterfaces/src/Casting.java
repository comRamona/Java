
public class Casting {
public static void main(String[] args) {Animal d=new Cat();
d.sound();
d.attack();
System.out.println(d.getClass()); //Cat
Cat f=(Cat) d;
f.sound();
Animal r=f;
Cat kitty=new Cat();
Animal kitty2=(Animal) kitty;
}
}
