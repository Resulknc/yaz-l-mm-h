/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tersane1;

import java.io.IOException;
import tersane1.data.database;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class EkleController implements Initializable {

    @FXML
    private TextField ad;
    @FXML
    private TextField soyad;
    @FXML
    private TextField level;
    @FXML
    private Button ekle;
    @FXML
    private Label oldumu;
    @FXML
    private TextField ıd;

    /**
     * Initializes the controller class.
     */
    @FXML
    public void HandleButtonAction(ActionEvent event){
        
            /*    oldumu.setTextFill(Color.GREEN);
                oldumu.setText("BAŞARIYLA EKLENDİ");  
                try{
                    Node node=(Node) event.getSource();
                    Stage stage=(Stage) node.getScene().getWindow();
                    stage.close();

                    Scene scene=new Scene(FXMLLoader.load(getClass().getResource("FXMLDocument.fxml")));
                    stage.setScene(scene);
                    stage.show();


                }catch(IOException e){
                    System.err.println(e.getMessage());
                }*/
               
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        database.baglan();
    }    
    
    PreparedStatement ps;
    
    
    @FXML
    private String ekle(MouseEvent event){
        
        String name=ad.getText();
        String nach=soyad.getText();
        String lev=level.getText();
        String id=ıd.getText();
        System.out.println("buraya 1");
        String sql="INSERT INTO CALISANLAR(ID,AD,SOYAD,SEVIYE) VALUES(?,'ömer','faruk',?)";
        System.out.println("buraya 2");
        
        
        
        try {
             
            System.out.println("buraya 3"); 

            ps=database.connection.prepareStatement(sql);
            

            /*ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, nach);
            ps.setString(4, lev);*/
            ps.executeUpdate();
            System.out.println("buraya 5"); 
            
            Node node=(Node) event.getSource();
            Stage stage=(Stage) node.getScene().getWindow();
            stage.close();

            Scene scene=new Scene(FXMLLoader.load(getClass().getResource("FXMLDocument.fxml")));
            stage.setScene(scene);
            stage.show();
            
            
            return "başarılı";
               
        } catch (Exception ex) {
            System.out.println("buraya 6"); 

            Logger.getLogger(EkleController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("buraya 4");
            return "Ecception";
        }
        
    
    }

}