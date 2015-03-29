
public class Cast {

public static void test(Animal a) {
System.out.println("I am smart\n");	
((Dog) a).bark();
}
	
public static void main(String[] args) {
	Object obj=new Object();
	//int x=(int) obj; //Runtime exception
	obj=3;  
	int y=(int) obj; //works now
	System.out.println(2*(int)obj);
	Animal a=new Cat();
	(a).sound();  //===>> Meow
	((Animal) a).sound();  //====>Meow
	
	Animal b=new Animal();
	//Cat c=(Cat) b;   // Throws an Runtime exception
	Cat f=new Cat();
	Animal d=f;
	d.sound(); //meow
	Cat q=new Cat();
	System.out.println(q instanceof Animal); //true
	Animal p=q;
	Dog doggy=new Dog();
	test(doggy);
	Cat kitty=new Cat();
	Animal kitty2=(Animal) kitty;
	Animal kitty3=kitty; //upcasting

}
}