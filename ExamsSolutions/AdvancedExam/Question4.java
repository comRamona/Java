
<!-- saved from url=(0071)http://homepages.inf.ed.ac.uk/perdita/Inf1OPAdvanced2015/Question4.java -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=windows-1252"></head><body><div id="StayFocusd-infobar" style="display:none;">
    <img src="chrome-extension://laankejkbhbdhmipfmgcngdelahlfoji/common/img/eye_19x19_red.png">
    <span id="StayFocusd-infobar-msg"></span>
    <span id="StayFocusd-infobar-links">
        <a id="StayFocusd-infobar-never-show">hide forever</a>&nbsp;&nbsp;|&nbsp;&nbsp;
        <a id="StayFocusd-infobar-hide">hide once</a>
    </span>
</div>import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question4 {
	// possible issue: we are assuming s is not null
	public static String findStudentIds(String s){
		StringBuilder sb = new StringBuilder();
		Pattern p = Pattern.compile("\\b[sS]\\d{7}\\b");
		Matcher m = p.matcher(s);
		while (m.find()) {
			sb.append(m.group());
			sb.append(',');
		}
		if (sb.length() > 0) {
			sb.setLength(sb.length() - 1);//lose the trailing comma
		}
		return sb.toString();
	}
	
	public static void main(String[] args){
		//String s = "s9782647_S9782647 and especially s0000001 but never s876.";
		String s = "s9782647 and S9782647 and especially s0000001 but never s876.";
		System.out.println(findStudentIds(s));		
	}

}
</body></html>
