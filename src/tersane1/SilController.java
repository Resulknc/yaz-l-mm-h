/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tersane1;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import tersane1.data.database;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class SilController implements Initializable {

    @FXML
    private Button sil;
    @FXML
    private TextField ıd;

    /**
     * Initializes the controller class.
     */
    @FXML
    public void HandleButtonAction(ActionEvent event){
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        database.baglan();
    } 
    
    PreparedStatement ps;
    
    @FXML
    private void sil(MouseEvent event) {
        String id=ıd.getText();
        
        String sql="DELETE FROM CALISANLAR WHERE ID=?";
        
        
        try {
            ps=database.connection.prepareStatement(sql);
            ps.setString(1, id);
            
            ps.executeUpdate();
                
        } catch (SQLException ex) {
            Logger.getLogger(SilController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
    
}
