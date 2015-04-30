
<!-- saved from url=(0071)http://homepages.inf.ed.ac.uk/perdita/Inf1OPAdvanced2015/Question1.java -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=windows-1252"></head><body><div id="StayFocusd-infobar" style="display:none;">
    <img src="chrome-extension://laankejkbhbdhmipfmgcngdelahlfoji/common/img/eye_19x19_red.png">
    <span id="StayFocusd-infobar-msg"></span>
    <span id="StayFocusd-infobar-links">
        <a id="StayFocusd-infobar-never-show">hide forever</a>&nbsp;&nbsp;|&nbsp;&nbsp;
        <a id="StayFocusd-infobar-hide">hide once</a>
    </span>
</div>public class Question1 {
  public static boolean isOdd(int i) {
    return i % 2 == 1;
  }
  
  public static boolean isTrulyOdd(int i) {
	  return i % 2 != 0;
  }
  
  public static void main(String[] args) {
	  System.out.println("The method claims it is "+isOdd(-3)+" that -3 is odd");
	  
	  //q1b();
	  //q1c();
  }
  
  
  public static void q1b() {
	  double i = Double.POSITIVE_INFINITY;
	  while (i == i+1) {}
  }
  
  public static void q1c() {
	  double i = Double.NaN;
	  while (i != i) {}
  }
}
</body></html>