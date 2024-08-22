// package com.TulipTechnologies.SAMIRobot.impl;

// import java.io.ByteArrayInputStream;
// import java.io.InputStream;
// import java.nio.charset.StandardCharsets;

// import com.ur.urcap.api.contribution.ProgramNodeContribution;
// import com.ur.urcap.api.contribution.ProgramNodeService;
// import com.ur.urcap.api.domain.URCapAPI;
// import com.ur.urcap.api.domain.data.DataModel;



// public class SwingPainterRobotPorgramNodeService implements ProgramNodeService{
//     @Override
//     public String getId() {
//         return "Painter_Robot";
//     }

//     @Override
//     public boolean isDeprecated() {
//         return false;
//     }

//     @Override
//     public boolean isChildrenAllowed() {
//         return false;
//     }

//     @Override
//     public String getTitle() {
//         return "Painter_Robot ...";
//     }

//     @Override
//     public InputStream getHTML() {

//         String htmlContent = "<html>" +
//                              "<head>" +
//                              "<title>Painter_robot!</title>" +
//                              "</head>" +
//                              "<body>" +
//                              "</body>" +
//                              "</html>";
//         InputStream htmlStream = new ByteArrayInputStream(htmlContent.getBytes(StandardCharsets.UTF_8));
//         return  htmlStream;

//     }

//     @Override
//     public ProgramNodeContribution createNode(URCapAPI api, DataModel model) {
//         return new SwingPainterRobotProgramNodeContribution();
//     }
    

// }
