package sccot.views;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Dashboard extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public Dashboard() {
        setupFrame();
        initComponents();
    }

    private void setupFrame() {
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
    }

    private void initComponents() {
        // Create CardLayout and Main Panel
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Create different views (Panels)
        JPanel homePanel = createPanel("Home Page", new Color(33,33,33) );
        JPanel locationPanel = createPanel("Location Page", new Color(33,33,33));
        JPanel scootersPanel = createPanel("Scooters Page", new Color(33,33,33));
        JPanel clientsPanel = createPanel("Clients Page", new Color(33,33,33));

        // Add views to CardLayout
        mainPanel.add(homePanel, "Home");
        mainPanel.add(locationPanel, "Location");
        mainPanel.add(scootersPanel, "Scooters");
        mainPanel.add(clientsPanel, "Clients");

        // Sidebar Panel with Buttons
        JPanel sidePanel = new JPanel(new GridLayout(4, 1, 10, 10));
        sidePanel.setBackground(new Color(33, 33, 33));
        sidePanel.setPreferredSize(new Dimension(150, getHeight()));

        JButton homeButton = new JButton("Home");
        JButton locationButton = new JButton("Location");
        JButton scootersButton = new JButton("Scooters");
        JButton clientsButton = new JButton("Clients");

        // Add ActionListeners to switch views
        homeButton.addActionListener(e -> cardLayout.show(mainPanel, "Home"));
        locationButton.addActionListener(e -> cardLayout.show(mainPanel, "Location"));
        scootersButton.addActionListener(e -> cardLayout.show(mainPanel, "Scooters"));
        clientsButton.addActionListener(e -> cardLayout.show(mainPanel, "Clients"));

        // Add buttons to sidePanel
        sidePanel.add(homeButton);
        sidePanel.add(locationButton);
        sidePanel.add(scootersButton);
        sidePanel.add(clientsButton);

        // Add components to JFrame
        add(sidePanel, BorderLayout.WEST);
        add(mainPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    // Helper method to create different views
    private JPanel createPanel(String text, Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setForeground(Color.WHITE);
        panel.add(label);
        return panel;
    }

    
}
