// package com.TulipTechnologies.SAMIRobot.impl;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStream;
// import java.io.InputStreamReader;

// import com.ur.urcap.api.contribution.ProgramNodeContribution;
// import com.ur.urcap.api.contribution.ProgramNodeService;
// import com.ur.urcap.api.domain.script.ScriptWriter;

// public class SwingPainterRobotProgramNodeContribution implements ProgramNodeService<SwingPainterRobotProgramNodeContribution,SwingPainterRobotProgramView>{

//     @Override
//     public void openView() {
       
//     }

//     @Override
//     public void closeView() {
        
//     }

//     @Override
//     public String getTitle() {
//         return "painter robots  - SAMI_AEC-contr";    
//     }

//     @Override
//     public boolean isDefined() {
//         return true;    
//     }

//     @Override
//     public void generateScript(ScriptWriter writer) {
//         InputStream is = getClass().getResourceAsStream("/painter_robot.urscript");
//         try{        
//         if (is != null)
//         {
//             BufferedReader br = new BufferedReader(new InputStreamReader(is));
//             String line;
//             while((line = br.readLine()) != null)
//             {
//                 writer.appendLine(line);
//             }
//             br.close();
//         }else{}
//             writer.appendLine("textmsg(\"Error: socketConnection.urscript file not found\")");
//         }
//         catch(IOException e)
//         {
//             writer.appendLine("textmsg(\"Error reading socketConnection.urscript file: " + e.getMessage() + "\")");
//         }
//     }
    
// }
