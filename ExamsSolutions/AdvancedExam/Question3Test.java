
<!-- saved from url=(0075)http://homepages.inf.ed.ac.uk/perdita/Inf1OPAdvanced2015/Question3Test.java -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=windows-1252"></head><body><div id="StayFocusd-infobar" style="display:none;">
    <img src="chrome-extension://laankejkbhbdhmipfmgcngdelahlfoji/common/img/eye_19x19_red.png">
    <span id="StayFocusd-infobar-msg"></span>
    <span id="StayFocusd-infobar-links">
        <a id="StayFocusd-infobar-never-show">hide forever</a>&nbsp;&nbsp;|&nbsp;&nbsp;
        <a id="StayFocusd-infobar-hide">hide once</a>
    </span>
</div>import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class Question3Test {
	
	String[] os = {"Hello", "world", "again"};

	@Test
	public void testElem1() {
		assertTrue(Question3.elem("world", os));
	}

	@Test
	public void testElem2() {
		assertFalse(Question3.elem("chocolate", os));
	}

}
</body></html>