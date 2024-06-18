package Program1;

import javax.swing.*;

public class GraphicalUI implements Messageable{ // איך
    @Override
    public void showMessage(String msg) {
        JOptionPane.showMessageDialog(null,msg);
    }

    @Override
    public String getString(String msg) {
        return JOptionPane.showInputDialog(msg);
    }
}
