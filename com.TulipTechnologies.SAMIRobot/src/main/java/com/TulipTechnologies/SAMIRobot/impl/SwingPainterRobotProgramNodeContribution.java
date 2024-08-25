package com.TulipTechnologies.SAMIRobot.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.ur.urcap.api.contribution.ProgramNodeContribution;
import com.ur.urcap.api.contribution.program.ProgramAPIProvider;
import com.ur.urcap.api.contribution.program.swing.SwingProgramNodeView;
import com.ur.urcap.api.domain.data.DataModel;
import com.ur.urcap.api.domain.script.ScriptWriter;

public class SwingPainterRobotProgramNodeContribution implements ProgramNodeContribution{

    private  ProgramAPIProvider apiProvider;
    private DataModel model;
SwingProgramNodeView<SwingPainterRobotProgramNodeContribution> view;

    public SwingPainterRobotProgramNodeContribution(ProgramAPIProvider apiProvider, SwingProgramNodeView<SwingPainterRobotProgramNodeContribution> view,DataModel model) {
        this.apiProvider = apiProvider;
        this.model = model;
        this.view = view;
    }


    @Override
    public void openView() {
        
    }

    @Override
    public void closeView() {

    }

    @Override
    public String getTitle() {
        return "PCB-Coating Robot \n(SAMI-AEC)";
    }

    @Override
    public boolean isDefined() {
        return true;
    }

    @Override
    public void generateScript(ScriptWriter writer) {
        InputStream is = getClass().getResourceAsStream("/painter_robot.urscript");
        try{        
        if (is != null)
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;
            while((line = br.readLine()) != null)
            {
                writer.appendLine(line);
            }
            br.close();
        }else{}
            writer.appendLine("textmsg(\"Error: painter_robot.urscript file not found\")");
        }
        catch(IOException e)
        {
            writer.appendLine("textmsg(\"Error reading painter_robot.urscript file: " + e.getMessage() + "\")");
        }
    }

}
