import java.util.ArrayList;


public class Video {

private String title;
private boolean flag=false;
private int nrr=0;
private ArrayList<Integer> ratings=new ArrayList<Integer>();
public Video(String title) {this.title=title; }
public String getTitle() { return title; }
public boolean addRating(int rating) {if(rating<=5&&rating>=1) { nrr++; ratings.add(rating); return true;}
else { System.out.printf("%d should be between 1 and 5.\n",rating); return false; }
}
public double getAverageRating() {double av=0;
if(nrr==0) return av;
else
{ for(int i:ratings)
	av+=i;
  return (av/((double) ratings.size()));
 
}
}
public boolean checkOut() { if(flag==true) {System.out.printf("%s is already checked out.\n",toString()); return false; }
else { flag=true;; return true; }
}
public boolean returnToStore() {
	if(flag==false) { System.out.printf("%s is not checked out.\n",toString()); return false; }
	else {flag=false; return true; }
}
public boolean isCheckedOut() {return flag; }
public String toString() { return String.format("Video[title=\"%s\", checkedOut=%s]",title,flag); }

}
