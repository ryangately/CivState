import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ViewField extends JPanel {

	public ViewField() throws IOException {
		BufferedImage bg = ImageIO.read(new File("resources/tempField.png"));
		JLabel bgLabel = new JLabel(new ImageIcon(bg));
		this.add(bgLabel);
	}
}
