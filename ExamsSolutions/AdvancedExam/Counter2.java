
<!-- saved from url=(0070)http://homepages.inf.ed.ac.uk/perdita/Inf1OPAdvanced2015/Counter2.java -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=windows-1252"></head><body><div id="StayFocusd-infobar" style="display:none;">
    <img src="chrome-extension://laankejkbhbdhmipfmgcngdelahlfoji/common/img/eye_19x19_red.png">
    <span id="StayFocusd-infobar-msg"></span>
    <span id="StayFocusd-infobar-links">
        <a id="StayFocusd-infobar-never-show">hide forever</a>&nbsp;&nbsp;|&nbsp;&nbsp;
        <a id="StayFocusd-infobar-hide">hide once</a>
    </span>
</div>public class Counter2 implements Runnable {
     
  private int counter = 0;
  private final int rounds = 100000;
  
  public void run() {
	  try {
		  int id;
		  String name = Thread.currentThread().getName();
		  if (name.equals("thread1")) {
			  id = 1;
		  } else {
			  id = 2;
		  }
		  for (int i = 0; i &lt; rounds; i++) {
			  int tmp = counter;
			  if (id == 1 &amp;&amp; i == 0) Thread.sleep(100);
			  counter = tmp + 1;
		  }
	  } catch (InterruptedException e) {
		  System.out.println("Interrupted!");
	  }
  }

  public static void main (String[] args) {
    try {
      Counter2 c = new Counter2 ();
     
      // Create two threads that run our run () method.
      Thread t1 = new Thread (c, "thread1");
      Thread t2 = new Thread (c, "thread2");
     
      t1.start (); t2.start ();
     
      // Wait for the threads to finish.
      t1.join (); t2.join ();
     
      // Print the counter - will be 100000
      System.out.println(c.counter);
    } catch (InterruptedException e) {
      System.out.println ("Interrupted!");
    }
  }
}
</body></html>