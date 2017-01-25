package hr.view;

import javax.swing.*;
/**
 * Created by msaponja on 25.01.17..
 * OK
 */
public class Main {
    private JPanel mainPane;
    private JTabbedPane mainTabPane;

    public static void main(String[] args) {
        Main mainWindowObject = new Main();

        JFrame mainWindow = new JFrame("TBP - skladiste");
        mainWindow.setContentPane(mainWindowObject.mainPane);
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.pack();
        mainWindow.setVisible(true);
    }
}
