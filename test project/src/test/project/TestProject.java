/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.project;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author devyo
 */
public class TestProject {

    private static HttpURLConnection connection;
    
    public static void main(String[] args) {
        try {
            URL url=new URL("https://jsonplaceholder.typicode.com/");
            connection=(HttpURLConnection) url.openConnection();
            
            connection.setRequestMethod("get");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            
            int status=connection.getResponseCode();
            
            System.out.println(status);
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(TestProject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestProject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
