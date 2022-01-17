/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.utils;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author XUÂN THÀNH
 */
public class ImageHelper {
    public static Image getAppIcon(){
        URL url = ImageHelper.class.getResource("/com/edusys/icons/logo-fpt16.png");
        return new ImageIcon(url).getImage();
    }
}
