package com.TulipTechnologies.SAMIRobot.impl;

import java.util.Locale;

import com.ur.urcap.api.contribution.ViewAPIProvider;
import com.ur.urcap.api.contribution.program.ContributionConfiguration;
import com.ur.urcap.api.contribution.program.CreationContext;
import com.ur.urcap.api.contribution.program.ProgramAPIProvider;
import com.ur.urcap.api.contribution.program.swing.SwingProgramNodeService;
import com.ur.urcap.api.domain.data.DataModel;

public class PainterRobotProgramNodeService implements SwingProgramNodeService<SwingPainterRobotProgramNodeContribution, SwingPainterRobotProgramView>{

    @Override
    public String getId() {
        return "Coating Robot";
    }

    @Override
    public void configureContribution(ContributionConfiguration configuration) 
    {    
    }

    @Override
    public String getTitle(Locale locale) {
       return "SAMI-AEC \nROBOT";
    }

    @Override
    public SwingPainterRobotProgramView createView(ViewAPIProvider apiProvider) {
       return new SwingPainterRobotProgramView();
    }

    @Override
    public SwingPainterRobotProgramNodeContribution createNode(ProgramAPIProvider apiProvider,
            SwingPainterRobotProgramView view, DataModel model, CreationContext context) {
            return new SwingPainterRobotProgramNodeContribution(apiProvider, view, model);
    }
}
