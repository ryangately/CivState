import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;

public class ViewControl extends JPanel {
	
	private Data data;
	
	// control pane components
	private ViewNews viewNews;
	private TitledBorder newsBorder;
	private JTabbedPane command;
	private ViewConstruction viewConstruction;
	private ViewPopulation viewPopulation;
	private ViewInfo viewInfo;
	private TitledBorder infoBorder;
	
	public ViewControl(Data dat) {
		
		data = dat;
		
		// news card
		viewNews = new ViewNews();
		//viewNews.setPreferredSize(new Dimension(240, 250));
		newsBorder = BorderFactory.createTitledBorder("Notifications");
		viewNews.setBorder(newsBorder);
		
		// command card
		command = new JTabbedPane();
		//command.setPreferredSize(new Dimension(600, 250));
		//command.setMaximumSize(new Dimension(600, 250));
		viewConstruction = new ViewConstruction();
		viewPopulation = new ViewPopulation();
		command.addTab("Construction", viewConstruction);
		command.addTab("Population", viewPopulation);
		
		// info card
		viewInfo = new ViewInfo(data);
		
		// compilation
		this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
		this.add(viewNews);
		this.add(command);
		this.add(viewInfo);
	}
	
	public void updateValues() {
		viewInfo.updateInfo();
	}
	
	public ViewInfo getViewInfo() {
		return viewInfo;
	}
}
