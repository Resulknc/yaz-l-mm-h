/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tersane1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class CalisanController implements Initializable {

    @FXML
    private Button ekle;
    @FXML
    private Button sil;
    @FXML
    private Button düzelt;

    
    @FXML
    public void HandleButtonAction(ActionEvent event){
        if(event.getSource()==ekle){
            try{
                Node node=(Node) event.getSource();
                Stage stage=(Stage) node.getScene().getWindow();
                stage.close();
                
                Scene scene=new Scene(FXMLLoader.load(getClass().getResource("ekle.fxml")));
                stage.setScene(scene);
                stage.show();
                
                
            }catch(IOException e){
                System.err.println(e.getMessage());
            }
        }else if(event.getSource()==sil){
            try{
                Node node=(Node) event.getSource();
                Stage stage=(Stage) node.getScene().getWindow();
                stage.close();
                
                Scene scene=new Scene(FXMLLoader.load(getClass().getResource("sil.fxml")));
                stage.setScene(scene);
                stage.show();
                
                
            }catch(IOException e){
                System.err.println(e.getMessage());
            }
        }else if(event.getSource()==düzelt){
            try{
                Node node=(Node) event.getSource();
                Stage stage=(Stage) node.getScene().getWindow();
                stage.close();
                
                Scene scene=new Scene(FXMLLoader.load(getClass().getResource("düzelt.fxml")));
                stage.setScene(scene);
                stage.show();
                
                
            }catch(IOException e){
                System.err.println(e.getMessage());
            }
        }  
        
        
    }    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ekle(MouseEvent event) {
    }

    @FXML
    private void sil(MouseEvent event) {
    }

    @FXML
    private void düzelt(MouseEvent event) {
    }
    
}
