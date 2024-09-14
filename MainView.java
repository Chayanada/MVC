import viewCow.*;

import javax.swing.*;

public class MainView extends JFrame {
    private CowController controller;

    public MainView(CowController controller) {
        this.controller = controller;

        setTitle("Cow Registion");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton registerBrownButton = new JButton("Register Brown Cow");
        registerBrownButton.addActionListener(e -> new RegisterBrown(controller).setVisible(true));

        JButton registerPinkButton = new JButton("Register Pink Cow");
        registerPinkButton.addActionListener(e -> new RegisterPink(controller).setVisible(true));

        JButton registerWhiteButton = new JButton("Register White Cow");
        registerWhiteButton.addActionListener(e -> new RegisterWhite(controller).setVisible(true));

        JPanel panel = new JPanel();
        panel.add(registerBrownButton);
        panel.add(registerPinkButton);
        panel.add(registerWhiteButton);

        add(panel);
    }
}
