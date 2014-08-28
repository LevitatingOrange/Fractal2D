package fractal2d.Helpers;

import javafx.scene.Node;
import org.controlsfx.dialog.Dialog;
import org.controlsfx.dialog.Dialogs;

import java.awt.*;

/**
 * Created by lenni on 28.08.14.
 */
public class Helpers {
    public static void displayErrorMessage(String title, String message, String explanation) {
        Toolkit.getDefaultToolkit().beep();
        Dialogs.create().title(title).masthead(message).message(explanation).showError();
    }
    public static void displayErrorMessage(String title, Exception e) {
        Toolkit.getDefaultToolkit().beep();
        Dialogs.create().title(title).masthead(e.getMessage()).message(e.getCause().getMessage()).showError();
    }
}