import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game {
	
	// system variables
	private String title;
	private String version;
	private Data data;
	
	// GUI variables
	private JFrame frame;
	private JPanel mainPanel;
	private ViewField viewField;
	private ViewControl viewControl;
	
	// action listener for next turn button
	private class NextTurnListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			data.nextTurn();
			viewControl.updateValues();
		}
	}
	
	// main constructor
	public Game() throws Exception {
		
		// set system variables
		title = "CivState";
		version = "0.1";
		data = new Data("Columbia");
		
		// build main window
		frame = new JFrame(title + " (v" + version + ')');
		mainPanel = new JPanel();
		viewField = new ViewField();
		viewControl = new ViewControl(data);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
		mainPanel.add(viewField);
		mainPanel.add(viewControl);
		frame.add(mainPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		// add listeners
		viewControl.getViewInfo().getNextTurnBtn().addActionListener(new NextTurnListener());
	}
}
