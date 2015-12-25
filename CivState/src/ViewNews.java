import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class ViewNews extends JPanel {
	
	public ViewNews() {
		JLabel alertLabel = new JLabel("No alerts");
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.add(alertLabel);
	}

}
