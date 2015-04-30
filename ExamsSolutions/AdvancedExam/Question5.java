
<!-- saved from url=(0071)http://homepages.inf.ed.ac.uk/perdita/Inf1OPAdvanced2015/Question5.java -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=windows-1252"></head><body><div id="StayFocusd-infobar" style="display:none;">
    <img src="chrome-extension://laankejkbhbdhmipfmgcngdelahlfoji/common/img/eye_19x19_red.png">
    <span id="StayFocusd-infobar-msg"></span>
    <span id="StayFocusd-infobar-links">
        <a id="StayFocusd-infobar-never-show">hide forever</a>&nbsp;&nbsp;|&nbsp;&nbsp;
        <a id="StayFocusd-infobar-hide">hide once</a>
    </span>
</div>import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		if (args.length &lt; 1) {
			System.out.println ("Need a path as argument!");
			System.exit(-1);
		}
		Path p = Paths.get(args[0]);// any point in this?
		
		try (Scanner s = new Scanner(Files.newBufferedReader(p, java.nio.charset.StandardCharsets.UTF_8))) {
			String star;
			int flamsteed;
			int numRecords = 0;
			double starData;
			double totalStarData = 0;
			while (s.hasNext()) {
				star = s.next();
				flamsteed = s.nextInt();
				starData = s.nextDouble();
				System.out.println ("Star "+star+" has Flamsteed "+flamsteed+" and data "+starData);
				numRecords++;
				totalStarData += starData;
			}
			System.out.format("There were %s records and the average data was %.2f to 2dp.", numRecords, totalStarData/numRecords);
		} catch (IOException e) {
			System.err.println(e);
		} 
		}

	}

</body></html>