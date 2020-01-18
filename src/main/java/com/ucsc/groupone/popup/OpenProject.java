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

    public OpenProject(JFrame parentFrame) {
        this.parentFrame = parentFrame;
    }

    public HashMap<String, String> getProperties() {
        JFileChooser modelChooser = new JFileChooser(SystemVariables.IDE_HOME_FOLDER);
        modelChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        modelChooser.showOpenDialog(parentFrame);
        File selectedFolder = modelChooser.getSelectedFile();
        return populateModelToMap(selectedFolder);
    }

    public HashMap<String, String> populateModelToMap(File selectedFile) {
        HashMap<String, String> modelMap = new HashMap();
        if (selectedFile != null) {
            String filePath = selectedFile.getAbsolutePath();

            try {

                File fXmlFile = new File(filePath + "/project.lhp");
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(fXmlFile);

                doc.getDocumentElement().normalize();
                NodeList nList = doc.getElementsByTagName("model");

                Node nNode = nList.item(0);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;
                    String modelName = eElement.getElementsByTagName("name").item(0).getTextContent();
                    String modelPath = eElement.getElementsByTagName("path").item(0).getTextContent();

                    File modelFile = new File(modelPath + "/" + modelName + Extensions.MODEL);

                    Document modelDoc = dBuilder.parse(modelFile);

                    modelDoc.getDocumentElement().normalize();
                    NodeList modelPropList = modelDoc.getElementsByTagName("model");

                    Node modelNode = modelPropList.item(0);

                    if (modelNode.getNodeType() == Node.ELEMENT_NODE) {

                        Element mElement = (Element) modelNode;
                        String name = mElement.getAttribute("name");
                        String path = mElement.getAttribute("path");
                        String figPath = mElement.getElementsByTagName("figPath").item(0).getTextContent();
                        String oiPath = mElement.getElementsByTagName("oiPath").item(0).getTextContent();
                        String tiPath = mElement.getElementsByTagName("tiPath").item(0).getTextContent();
                        String cfPath = mElement.getElementsByTagName("cfPath").item(0).getTextContent();

                        modelMap.put("figPath", figPath);
                        modelMap.put("tiPath", tiPath);
                        modelMap.put("oiPath", oiPath);
                        modelMap.put("cfPath", cfPath);
                        modelMap.put("path", path);
                        modelMap.put("name", name);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return modelMap;
    }

}
