
public class VideoStoreTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     VideoStore store=new VideoStore();
     store.addVideo("My Heart Will go on");
     store.addVideo("I will survive");
     store.checkOutVideo("My Heart Will go on");
     Video v1=store.getVideo("My Heart Will go on");
     Video v2=store.getVideo("I will survive");
     store.rateVideo(v1, 2);
     store.rateVideo(v1, 3);
     store.rateVideo(v2, 4);
     System.out.println(store.mostPopular());
	}

}
