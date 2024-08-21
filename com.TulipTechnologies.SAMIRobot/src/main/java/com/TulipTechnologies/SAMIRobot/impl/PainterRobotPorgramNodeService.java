package com.TulipTechnologies.SAMIRobot.impl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import com.ur.urcap.api.contribution.ProgramNodeContribution;
import com.ur.urcap.api.contribution.ProgramNodeService;
import com.ur.urcap.api.domain.URCapAPI;
import com.ur.urcap.api.domain.data.DataModel;

public class PainterRobotPorgramNodeService implements ProgramNodeService{

    @Override
    public String getId() {
        return "Painter_Robot";
    }

    @Override
    public boolean isDeprecated() {
        return false;
    }

    @Override
    public boolean isChildrenAllowed() {
        return false;
    }

    @Override
    public String getTitle() {
        return "Painter_Robot";
    }

    @Override
    public InputStream getHTML() {
        String htmlContent =    "<html>" +
                                "<head>" +
                                "<style>" +
                                "body { font-family: Arial, sans-serif; text-align: center; }" +
                                "h1 { font-size: 24px; color: #333; }" +
                                "img { width: 100%; height: auto; }" +
                                "</style>" +
                                "</head>" +
                                "<body>" +
                                "<h1>Painter Robot - SAMI AEC -</h1>" +
                                "<img src=\"SAMI-workflow.png\" alt=\"Painter Robot Image\" />" +
                                "</body>" +
                                "</html>";
        InputStream htmlStream = new ByteArrayInputStream(htmlContent.getBytes(StandardCharsets.UTF_8));
        return  htmlStream;
    
    }

    @Override
    public ProgramNodeContribution createNode(URCapAPI api, DataModel model) {
        return new PainterRobotProgramNodeContribution();
    }
    
}
