
<!-- saved from url=(0071)http://homepages.inf.ed.ac.uk/perdita/Inf1OPAdvanced2015/Question3.java -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=windows-1252"></head><body><div id="StayFocusd-infobar" style="display:none;">
    <img src="chrome-extension://laankejkbhbdhmipfmgcngdelahlfoji/common/img/eye_19x19_red.png">
    <span id="StayFocusd-infobar-msg"></span>
    <span id="StayFocusd-infobar-links">
        <a id="StayFocusd-infobar-never-show">hide forever</a>&nbsp;&nbsp;|&nbsp;&nbsp;
        <a id="StayFocusd-infobar-hide">hide once</a>
    </span>
</div>public class Question3 {
	// This was good enough, though we could indeed argue about how faithful it is
	public static boolean elem (Object x, Object[] ys) {
		// elem x ys = foldr (||) False (map (x ==) ys)	
		boolean[] mapXEqualsYs = new boolean[ys.length];
		for (int i=0; i &lt; ys.length; i++) {
			mapXEqualsYs[i] = x.equals(ys[i]);
		}
		
		boolean accum = false;
		for (int i=0; i &lt; ys.length; i++) {
			accum = accum || mapXEqualsYs[i];
		}
		
		return accum;
	}
	

	// programmer efficient!
	public static boolean elem2 (Object x, Object[] ys) {
		return java.util.Arrays.asList(ys).contains(x);
	}
	
	// time efficient!
	public static boolean elem3 (Object x, Object[] ys) {
		for(Object o: ys){
			if (x.equals(o)) return true;
		}
		return false;
	}
	
	
}
</body></html>
