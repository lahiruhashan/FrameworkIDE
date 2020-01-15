/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.groupone.models;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author hashan
 */
public class ClassifierModel extends JLabel{
    String figPath;
    String tiPath;
    String oiPath;
    String cfPath;
    String path;

    public ClassifierModel(ImageIcon imageIcon) {
        super(imageIcon);
    }

    public ClassifierModel(String figPath, String tiPath, String oiPath, String cfPath) {
        this.figPath = figPath;
        this.tiPath = tiPath;
        this.oiPath = oiPath;
        this.cfPath = cfPath;
    }
    
    public ClassifierModel(ImageIcon imageIcon, String figPath, String tiPath, String oiPath, String cfPath) {
        super(imageIcon);
        this.figPath = figPath;
        this.tiPath = tiPath;
        this.oiPath = oiPath;
        this.cfPath = cfPath;
    }

    public String getFigPath() {
        return figPath;
    }

    public void setFigPath(String figPath) {
        this.figPath = figPath;
    }

    public String getTiPath() {
        return tiPath;
    }

    public void setTiPath(String tiPath) {
        this.tiPath = tiPath;
    }

    public String getOiPath() {
        return oiPath;
    }

    public void setOiPath(String oiPath) {
        this.oiPath = oiPath;
    }

    public String getCfPath() {
        return cfPath;
    }

    public void setCfPath(String cfPath) {
        this.cfPath = cfPath;
    }
    
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    
}
