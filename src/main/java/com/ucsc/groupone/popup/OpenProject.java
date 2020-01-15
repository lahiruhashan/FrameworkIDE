/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.groupone.popup;

import com.ucsc.groupone.utils.Extensions;
import com.ucsc.groupone.utils.SystemVariables;
import java.io.File;
import java.util.HashMap;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

/**
 *
 * @author hashan
 */
public class OpenProject {

    JFrame parentFrame;
    String fileExtension;

    public OpenProject() {
    }
    
    public OpenProject(JFrame parentFrame, String fileExtension) {
        this.parentFrame = parentFrame;
        this.fileExtension = fileExtension;
    }

    public HashMap<String, String> getProperties() {
        JFileChooser modelChooser = new JFileChooser(SystemVariables.IDE_HOME_FOLDER);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("MODEL FILES", fileExtension, "model");
        modelChooser.setFileFilter(filter);
        modelChooser.showOpenDialog(parentFrame);
        File selectedFile = modelChooser.getSelectedFile();
        return populateModelToMap(selectedFile);
    }

    public HashMap<String, String> populateModelToMap(File selectedFile) {
        HashMap<String, String> modelMap = new HashMap();
        if (selectedFile != null) {
            String filePath = selectedFile.getAbsolutePath();

            try {

                File fXmlFile = new File(filePath);
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(fXmlFile);

                doc.getDocumentElement().normalize();
                NodeList nList = doc.getElementsByTagName("model");

                Node nNode = nList.item(0);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    String name = eElement.getAttribute("name");
                    String path = eElement.getAttribute("path");
                    String figPath = eElement.getElementsByTagName("figPath").item(0).getTextContent();
                    String oiPath = eElement.getElementsByTagName("oiPath").item(0).getTextContent();
                    String tiPath = eElement.getElementsByTagName("tiPath").item(0).getTextContent();
                    String cfPath = eElement.getElementsByTagName("cfPath").item(0).getTextContent();

                    modelMap.put("figPath", figPath);
                    modelMap.put("tiPath", tiPath);
                    modelMap.put("oiPath", oiPath);
                    modelMap.put("cfPath", cfPath);
                    modelMap.put("path", path);
                    modelMap.put("name", name); 
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return modelMap;
    }

}
