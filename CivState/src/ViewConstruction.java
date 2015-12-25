import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewConstruction extends JPanel {
	
	public ViewConstruction() {
		JButton testButton = new JButton("test");
		JLabel testLabel = new JLabel("info");
		JLabel testLabel2 = new JLabel("more info");
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.add(testButton);
		this.add(testLabel);
		this.add(testLabel2);
	}

}
