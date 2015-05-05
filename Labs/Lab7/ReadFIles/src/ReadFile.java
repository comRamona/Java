
public class ReadFile {
	public static void main(String[] args){
	In rf=new In("http://www.gutenberg.org/files/39063/39063-0.txt");
	while(!rf.isEmpty()) {
		String line=rf.readLine();
		if(line.contains("mountain")) System.out.println(line);
	} 
	In file = new In("myfile.txt");
	String s = file.readAll();
	String[] words = s.split("\\W+");  //non-word character
	for(int i=0;i<words.length;i++)
		System.out.println(words[i]);
	
	}

}
