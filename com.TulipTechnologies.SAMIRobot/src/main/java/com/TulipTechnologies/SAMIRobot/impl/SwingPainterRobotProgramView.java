package com.TulipTechnologies.SAMIRobot.impl;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.ur.urcap.api.contribution.ContributionProvider;
import com.ur.urcap.api.contribution.program.swing.SwingProgramNodeView;

public class SwingPainterRobotProgramView implements SwingProgramNodeView<SwingPainterRobotProgramNodeContribution>{

    private final int LOGO_WIDTH = 200;
    private final int LOGO_HEIGHT = 100;
    private final int VERTICAL_GAP = 10;

    public SwingPainterRobotProgramView()
    {
    }

    @Override
    public void buildUI(JPanel panel, ContributionProvider<SwingPainterRobotProgramNodeContribution> provider) {
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        // panel.setBorder(BorderFactory.createEmptyBorder(VERTICAL_GAP, VERTICAL_GAP, VERTICAL_GAP, VERTICAL_GAP));

        // Company Logo (placeholder)
        JLabel logoLabel = createImageLabel(provider ,"logo.png", 200, 50);
        panel.add(logoLabel);
        panel.add(Box.createRigidArea(new Dimension(0, VERTICAL_GAP)));

        // Client Company
        JLabel clinetLogoLabel = createImageLabel(provider ,"SAMI-logo.png", 200, 50);
        panel.add(clinetLogoLabel);
        panel.add(Box.createRigidArea(new Dimension(0, VERTICAL_GAP)));

        // Project Name
        JLabel projectNameLabel = createStyledLabel(" PCB Acrylic Conformal  Coating Spray Painting  Robotic Cell", 15);
        panel.add(projectNameLabel);
        panel.add(Box.createRigidArea(new Dimension(0, VERTICAL_GAP)));

        // Workflow Image (placeholder)
        JLabel workflowLabel = createImageLabel(provider,"SAMI-workflow.png", 700, 400);
        JScrollPane scrollPane = new JScrollPane(workflowLabel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        panel.add(scrollPane);
    }


    private JLabel createStyledLabel(String text, int fontSize)
    {
        JLabel label = new JLabel(text);
        label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, fontSize));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        return label;

    }

    
    private JLabel createImageLabel(ContributionProvider<SwingPainterRobotProgramNodeContribution> provider, String resourceName, int width, int height) {
        JLabel label = new JLabel();
        label.setPreferredSize(new Dimension(width, height));
        label.setMinimumSize(new Dimension(width, height));
        label.setMaximumSize(new Dimension(width, height));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        try {
            ImageIcon icon = new ImageIcon(getClass().getResource("/" + resourceName));
            Image img = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            System.err.println("Error loading image: " + resourceName);
            label.setText("Image not found: " + resourceName);
        }

        return label;
    }


}
