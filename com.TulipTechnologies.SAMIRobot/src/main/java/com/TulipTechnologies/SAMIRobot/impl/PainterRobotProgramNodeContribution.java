package com.TulipTechnologies.SAMIRobot.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.ur.urcap.api.contribution.ProgramNodeContribution;
import com.ur.urcap.api.domain.script.ScriptWriter;

public class PainterRobotProgramNodeContribution implements ProgramNodeContribution{

    @Override
    public void openView() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'openView'");
    }

    @Override
    public void closeView() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'closeView'");
    }

    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTitle'");
    }

    @Override
    public boolean isDefined() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isDefined'");
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
            writer.appendLine("textmsg(\"Error: socketConnection.urscript file not found\")");
        }
        catch(IOException e)
        {
            writer.appendLine("textmsg(\"Error reading socketConnection.urscript file: " + e.getMessage() + "\")");
        }
    }
    
}
