
<!-- saved from url=(0073)http://homepages.inf.ed.ac.uk/perdita/Inf1OPAdvanced2015/MyArrayList.java -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=windows-1252"></head><body><div id="StayFocusd-infobar" style="display:none;">
    <img src="chrome-extension://laankejkbhbdhmipfmgcngdelahlfoji/common/img/eye_19x19_red.png">
    <span id="StayFocusd-infobar-msg"></span>
    <span id="StayFocusd-infobar-links">
        <a id="StayFocusd-infobar-never-show">hide forever</a>&nbsp;&nbsp;|&nbsp;&nbsp;
        <a id="StayFocusd-infobar-hide">hide once</a>
    </span>
</div>// String only version
public class MyArrayList {

	private String[] data;
	private int maxindex = -1;
	
	public MyArrayList(int size) {
		data = new String[size];
	}
	
	public MyArrayList() {
		this(10);
	}
	
	public String get(int index) {
		if (index &gt;= 0 &amp;&amp; index &lt; data.length) {
			return data[index];
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public void add(String i) {
		if (maxindex &lt; data.length - 1) {
			maxindex++;
			data[maxindex] = i;
		} else {
			// +1 just to avoid annoying data.length==0 case!
			String[] newdata = new String[data.length * 2 + 1];
			for (int j = 0; j &lt;= maxindex; j++) {
				newdata[j] = data[j];
			}
			data = newdata;
			add(i);
		}
	}
	
	public int indexOf(String o) {
		for (int i = 0; i &lt;= maxindex; i++) {
			// paste the condition out of the documentation!
			if (o==null ? get(i)==null : o.equals(get(i))) {
				return i;
			}
		}
		return -1;
	}
	
	public void remove(int i) {
	// decide whether we need to shrink the list
		if (maxindex * 2 &lt; data.length) {
			String[] newdata = new String[maxindex];
			for (int j = 0; j &lt; i; j++) {
				newdata[j] = data[j];
			}
			for (int j = i+1; j &lt;= maxindex; j++) {
				newdata[j-1] = data[j];
			}
			data = newdata;
			maxindex--;
		} else {
			for (int j = i+1; j &lt;= maxindex; j++) {
				data[j-1] = data[j];
			}
			maxindex--;
		}
	}
	
}
</body></html>