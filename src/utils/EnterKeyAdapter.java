
package utils;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EnterKeyAdapter extends KeyAdapter{
    private Runnable action;

    public EnterKeyAdapter(Runnable action) {
        this.action = action;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            action.run();
        }
    }
}
