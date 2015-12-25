import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewInfo extends JPanel {
	
	private Data data;
	
	// GUI components
	private JLabel cityNameLabel;
	
	private JPanel yearPanel;
	private JLabel yearVal;
	private JLabel turnLabel;
	private JLabel turnVal;
	
	private JPanel populationPanel;
	private JLabel populationLabel;
	private JLabel populationVal;
	
	private JPanel goldPanel;
	private JLabel goldLabel;
	private JLabel goldVal;
	
	private JButton nextButton;

	// main constructor
	public ViewInfo(Data dat) {
		
		data = dat;
		
		// city name
		cityNameLabel = new JLabel(data.getCityName());
		cityNameLabel.setAlignmentX(CENTER_ALIGNMENT);
		
		// year and turn info
		yearPanel = new JPanel();
		yearVal = new JLabel(data.getYear());
		turnLabel = new JLabel(" / Turn ");
		turnVal = new JLabel(String.valueOf(data.getTurn()));
		yearPanel.setLayout(new BoxLayout(yearPanel, BoxLayout.LINE_AXIS));
		yearPanel.add(yearVal);
		yearPanel.add(turnLabel);
		yearPanel.add(turnVal);
		
		// population info
		populationPanel = new JPanel();
		populationLabel = new JLabel("Population ");
		populationVal = new JLabel(String.valueOf(data.getPopulation()));
		populationPanel.setLayout(new BoxLayout(populationPanel, BoxLayout.LINE_AXIS));
		populationPanel.add(populationLabel);
		populationPanel.add(populationVal);
		
		// gold info
		goldPanel = new JPanel();
		goldLabel = new JLabel("Gold ");
		goldVal = new JLabel(String.valueOf(data.getPopulation()));
		goldPanel.setLayout(new BoxLayout(goldPanel, BoxLayout.LINE_AXIS));
		goldPanel.add(goldLabel);
		goldPanel.add(goldVal);
		
		// next turn button
		nextButton = new JButton("Next Turn");
		nextButton.setAlignmentX(CENTER_ALIGNMENT);
		
		// compilation info
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.add(cityNameLabel);
		this.add(yearPanel);
		this.add(populationPanel);
		this.add(goldPanel);
		this.add(nextButton);
	}
	
	// updates info values
	public void updateInfo() {
		yearVal.setText(data.getYear());
		turnVal.setText(String.valueOf(data.getTurn()));
	}
	
	// returns "Next Turn" button for action listener
	public JButton getNextTurnBtn() {
		return this.nextButton;
	}
}
