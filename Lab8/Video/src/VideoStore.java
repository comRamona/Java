import java.util.ArrayList;


public class VideoStore {

private ArrayList<Video> videos=new ArrayList<Video>();
public boolean addVideo(String title){ for(Video i:videos) if(i.getTitle().equals(title)) { System.out.printf("%s is already in stock.",title); return false;}
videos.add(new Video(title)); return true;
}
public Video getVideo(String title) {
	for(Video i:videos) if(i.getTitle().equals(title)==true) return i;
	System.out.println("Sorry, cannot find the requested video in the catalogue"); return null;
}
public boolean checkOutVideo(String title){
	if(getVideo(title)==null)  return false;
	else
		return getVideo(title).checkOut();
	
}
public boolean returnVideo(Video video) {
	if(!videos.contains(video)){ System.out.println("Sorry, this video did not come from this store"); return false;}
	return video.returnToStore(); }
public void rateVideo(Video video,int rating) {video.addRating(rating); }
public double getAverageRatingForVideo(Video video) {return video.getAverageRating();}
public Video[] getCheckedOut() { int count = 0;
int i = 0;

for (Video video : videos) {
    if (video.isCheckedOut()) {
        count++;
    }
}
Video[] checkedOut = new Video[count];

for (Video video : videos) {
    if (video.isCheckedOut()) {
        checkedOut[i] = video;
        i++;
    }
}
return checkedOut;
}
public Video mostPopular() {Video mP=null;
double max=1;
for(Video i:videos)
	if(max<i.getAverageRating()) {max=i.getAverageRating(); mP=i;}
return mP; }


}
