import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewPopulation extends JPanel {
	
	public ViewPopulation() {
		JLabel testPopLabel = new JLabel("Population");
		JLabel testPopLabel2 = new JLabel("Great People");
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.add(testPopLabel);
		this.add(testPopLabel2);
	}

}
