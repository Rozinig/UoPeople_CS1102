package cs1102;
import javax.swing.JOptionPane;
public class Discuss2 {
	public static void main(String[] args) {
		
		for (int x=2; x<20;x*=x)
			JOptionPane.showMessageDialog(null, "This will be annoying! (for)");
		
		int 
		x=2;
		while (x<20) {
			JOptionPane.showMessageDialog(null, "This will be annoying! (while)");
			x*=x;
		} // end while
		
		x=2;
		do {
			JOptionPane.showMessageDialog(null, "This will be annoying! (do while)");
			x*=x;
		} while (x<20); 
		
	
		
		
		String a;
		do {
			a=JOptionPane.showInputDialog("Enter a Word (do)");
		} while (!(a.equals("this")));
		
		a=JOptionPane.showInputDialog("Enter a Word (while)");
		while (!(a.equals("this"))) {
			a=JOptionPane.showInputDialog("Enter a Word (while)");
		}
		for(a=JOptionPane.showInputDialog("Enter a Word (for)");!(a.equals("this"));)	
			a=JOptionPane.showInputDialog("Enter a Word (for)");
		
		long seconds = System.currentTimeMillis();
		while (true) {
			JOptionPane.showMessageDialog(null, "This will be annoying! (while)");
			if (System.currentTimeMillis()>(seconds+5000)) break;
		}
		
		seconds = System.currentTimeMillis();
		do {
			JOptionPane.showMessageDialog(null, "This will be annoying! (do)");
			if (System.currentTimeMillis()>(seconds+5000)) break;
		} while (true);
		
		seconds = System.currentTimeMillis();
		for (;true;) {
			JOptionPane.showMessageDialog(null, "This will be annoying! (for)");
			if (System.currentTimeMillis()>(seconds+5000)) break;
			
		}
		
		
	
	} // end main
} // End Class
