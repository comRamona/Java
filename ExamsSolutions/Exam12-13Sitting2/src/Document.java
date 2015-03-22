
public class Document {
private String name;
private int pages;
public Document(String name,int pages){
	this.name=name;
	this.pages=pages;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPages() {
	return pages;
}
public void setPages(int pages) {
	this.pages = pages;
}
public String toString(){ return name+" ("+pages+")";}

}
