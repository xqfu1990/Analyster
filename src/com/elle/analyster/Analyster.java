
package com.elle.analyster;

import com.elle.analyster.logic.LoggingAspect;
import com.elle.analyster.presentation.AnalysterWindow;
import com.elle.analyster.presentation.LoginWindow;
import java.awt.Dimension;
import javax.swing.UIManager;

/**
 * Main
 * This is the class that starts the application from the main method
 * @author Carlos Igreja
 * @since June 10, 2015
 * @version 0.6.3
 */
public class Analyster {
    
    public static void main(String[] args){
        
        // set the look and feel
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            LoggingAspect.afterThrown(ex);
        }
        
        UIManager.getLookAndFeelDefaults().put("ScrollBar.minimumThumbSize", new Dimension(30, 30));

        // this is the first window that is shown to log in to the database.
        // Once the database connection is made, then an instance
        // of Analyster is created.
        LoginWindow loginWindow = new LoginWindow();
        loginWindow.setLocationRelativeTo(null);
        loginWindow.setVisible(true);
    }
}
