package com.TulipTechnologies.SAMIRobot.impl;

import java.util.Locale;

import com.ur.urcap.api.contribution.ViewAPIProvider;
import com.ur.urcap.api.contribution.program.ContributionConfiguration;
import com.ur.urcap.api.contribution.program.CreationContext;
import com.ur.urcap.api.contribution.program.ProgramAPIProvider;
import com.ur.urcap.api.contribution.program.swing.SwingProgramNodeService;
import com.ur.urcap.api.contribution.program.swing.SwingProgramNodeView;
import com.ur.urcap.api.domain.data.DataModel;

public class SwingPainterRobotPorgramNodeService implements SwingProgramNodeService<SwingPainterRobotProgramNodeContribution, SwingProgramNodeView<SwingPainterRobotProgramNodeContribution>>{

    @Override
    public String getId() {
        return "coating robot";
    }

    @Override
    public void configureContribution(ContributionConfiguration configuration) {
    }

    @Override
    public String getTitle(Locale locale) {
        return " ";
    }

    @Override
    public SwingProgramNodeView<SwingPainterRobotProgramNodeContribution> createView(ViewAPIProvider apiProvider) {
        return new SwingPainterRobotProgramView();
    }

    @Override
    public SwingPainterRobotProgramNodeContribution createNode(ProgramAPIProvider apiProvider,
            SwingProgramNodeView<SwingPainterRobotProgramNodeContribution> view, DataModel model,
            CreationContext context) {
                return new SwingPainterRobotProgramNodeContribution(apiProvider, view, model);
                
            }


}
