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
    private void guncelle(MouseEvent event) {
        String ad=isim.getText();
        String ıd=id.getText();
        String soyad=soy.getText();
        String lev=level.getText();
        
        String sql="UPDATE CALISANLAR SET AD=?,SOYAD=?,SEVIYE=?  WHERE ID=?";
        
        
        try {
            ps=database.connection.prepareStatement(sql);
            
            ps.setString(1, ad);
            ps.setString(2, soyad);
            ps.setString(3, lev);
            ps.setString(4, ıd);
            ps.executeUpdate();
                
        } catch (SQLException ex) {
            Logger.getLogger(SilController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
