
<!-- saved from url=(0083)http://homepages.inf.ed.ac.uk/perdita/Inf1OPAdvanced2015/StringMyArrayListTest.java -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=windows-1252"></head><body><div id="StayFocusd-infobar" style="display:none;">
    <img src="chrome-extension://laankejkbhbdhmipfmgcngdelahlfoji/common/img/eye_19x19_red.png">
    <span id="StayFocusd-infobar-msg"></span>
    <span id="StayFocusd-infobar-links">
        <a id="StayFocusd-infobar-never-show">hide forever</a>&nbsp;&nbsp;|&nbsp;&nbsp;
        <a id="StayFocusd-infobar-hide">hide once</a>
    </span>
</div>import static org.junit.Assert.*;

import org.junit.Test;


public class StringMyArrayListTest {

	@Test
	public void testConstruct() {
		MyArrayList a = new MyArrayList(7);
	}
	
	@Test
	public void testAddGet1() {
		MyArrayList a = new MyArrayList(0);
		a.add("Hello");
		String s = a.get(0);
		assertEquals("Hello",s);
	}
	
	
	@Test
	public void testAddGet2() {
		MyArrayList a = new MyArrayList(0);
		a.add("Hello");
		String s = a.get(0);
		assertEquals("Hello",s);
		a.add("World");
		String s1 = a.get(0);
		assertEquals("Hello",s1);
		String s2 = a.get(1);
		assertEquals("World",s2);	
	}
	
	@Test
	public void testAddGetNull() {
		MyArrayList a = new MyArrayList(0);
		a.add(null);
		String s = a.get(0);
		assertNull(s);
	}
	
// I didn't specify whether they were to implement the version of remove that
// takes an index, or the one that takes an object. Unless they did both,
// only one of these tests will compile.
	@Test
	public void testRemoveIndex() {
		MyArrayList a = new MyArrayList(0);
		a.add("Hello");
		a.add("World");
		a.add("Again");
		a.remove(1);
		String s1 = a.get(0);
		assertEquals("Hello",s1);
		String s2 = a.get(1);
		assertEquals("Again",s2);	
	}
	

//		@Test
//		public void testRemoveObject() {
//			MyArrayList a = new MyArrayList(0);
//			a.add("Hello");
//			a.add("World");
//			a.add("Again");
//			a.remove("World");
//			String s1 = a.get(0);
//			assertEquals("Hello",s1);
//			String s2 = a.get(1);
//			assertEquals("Again",s2);	
//		}

	@Test
	public void testIndexOf() {
		MyArrayList a = new MyArrayList(0);
		a.add("Hello");
		a.add("World");
		a.add("Again");
		int i = a.indexOf("World");
		assertEquals(1, i);
	}
	
	@Test
	public void testIndexOfFirst() {
		MyArrayList a = new MyArrayList(0);
		a.add("Hello");
		a.add("World");
		a.add("Again");
		int i = a.indexOf("Hello");
		assertEquals(0, i);
	}
	
	@Test
	public void testIndexOfNotPresent() {
		MyArrayList a = new MyArrayList(0);
		a.add("Hello");
		a.add("World");
		a.add("Again");
		int i = a.indexOf("Chocolate");
		assertEquals(-1, i);
	}
	
	@Test
	public void testIndexOfWithNull() {
		MyArrayList a = new MyArrayList(0);
		a.add(null);
		a.add("World");
		a.add("Again");
		int i = a.indexOf("World");
		assertEquals(1, i);
	}
	

	
}
</body></html>