package com.mycompany.guia2.conexion;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Control_A  {
     public static void main(String[] args) {
        Archivo subir = new Archivo();
        
        try {
            subir.uploadObject();
        } catch (IOException ex) {
            Logger.getLogger(Control_A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
