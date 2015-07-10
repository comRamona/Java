import javax.swing.*;

class panel {
	static int text(String a) {String getN=JOptionPane.showInputDialog(a,": ");
	int n=Integer.parseInt(getN); 
	return n; }
	static void show(int n) { JOptionPane.showMessageDialog(null,n); } 
}