/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.groupone.utils;

/**
 *
 * @author hashan
 */
public class SystemVariables {
    
    public static final String IDE_HOME_FOLDER = System.getProperty("user.home").concat("/").concat(SystemConstants.IDE_FOLDER);
    public static String projectRootFolder = IDE_HOME_FOLDER;

    public static void setProjectRootFolder(String prf) {
        projectRootFolder = prf;
    }
    
    public static boolean isProjectCreated(){
        if(projectRootFolder.equals(IDE_HOME_FOLDER)){
            return false;
        }
        return true;
    }
    
}
