import java.awt.*;
import javax.swing.*;

public class PanelDzielony extends JSplitPane {
  
  public PanelDzielony() {
    JPanel panelCzerwony = new JPanel();
    JPanel panelzolty = new JPanel();

    panelCzerwony.setBackground(Color.RED);
    panelzolty.setBackground(Color.YELLOW);

    setOrientation(JSplitPane.HORIZONTAL_SPLIT);
    setLeftComponent(panelCzerwony);
    setRightComponent(panelzolty);

    setDividerLocation(100);
    setOneTouchExpandable(true);
  }
}
