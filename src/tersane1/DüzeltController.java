/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tersane1;

import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
import tersane1.data.database;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class DüzeltController implements Initializable {

    @FXML
    private TextField id;
    @FXML
    private TextField isim;
    @FXML
    private TextField soy;
    @FXML
    private TextField level;
    @FXML
    private Button güncelle;
    @FXML
    private Button anasayfa;
    @FXML
    private Label oldumu;

    /**
     * Initializes the controller class.
     */
    @FXML
    public void HandleButtonAction(ActionEvent event){
        if(event.getSource()==anasayfa){
            try{
                    Node node=(Node) event.getSource();
                    Stage stage=(Stage) node.getScene().getWindow();
                    stage.close();

                    Scene scene=new Scene(FXMLLoader.load(getClass().getResource("FXMLDocument.fxml")));
                    stage.setScene(scene);
                    stage.show();


                }catch(IOException e){
                    System.err.println(e.getMessage());
                }
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        database.baglan();
    }    
    PreparedStatement ps;
    
    @FXML
    private void guncelle(MouseEvent event) {
        String ad=isim.getText();
        String ıd=id.getText();
        String soyad=soy.getText();
        String lev=level.getText();
        
        
        
        try {
            String a=database.update();
            ps=database.connection.prepareStatement(a);
            
            ps.setString(1, ad);
            ps.setString(2, soyad);
            ps.setString(3, lev);
            ps.setString(4, ıd);
            ps.executeUpdate();
            oldumu.setTextFill(Color.GREEN);
            oldumu.setText("BAŞARIYLA GÜNCELLENDİ");    
        } catch (SQLException ex) {
            Logger.getLogger(SilController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
