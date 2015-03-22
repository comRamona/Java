import java.util.ArrayList;


public class Book extends Document {
	private ArrayList<Document> chapters;
	public Book(String name,int pages){
		super(name,pages);
		chapters=new ArrayList<Document>();
	}
	public ArrayList<Document> getChapters() {
		return chapters;
	}
	public void setChapters(ArrayList<Document> chapters) {
		this.chapters = chapters;
	}
	public String toString() {
		String s=super.toString()+"\nContains:";
		for(Document d:chapters)
			s=s+"\n"+d;
		return s;
	}
    public static void main(String[] args) {
		Document c1=new Document("Chapter 1",7);
		Document c2=new Document("Chapter 2",8);
		ArrayList<Document> chapters=new ArrayList<Document>();
		chapters.add(c1);
		chapters.add(c2);
		Book b=new Book("Great Book",15);
		b.setChapters(chapters);
		System.out.println(b);
		
		
	}
}
