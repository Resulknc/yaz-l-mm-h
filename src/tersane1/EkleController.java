/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tersane1;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

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

    /**
     * Initializes the controller class.
     */
    @FXML
    public void HandleButtonAction(ActionEvent event){
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    Connection con=null;
    PreparedStatement preparedstatement=null;
    ResultSet resultset=null;
    
    
    @FXML
    private void ekle(MouseEvent event) throws SQLException {
        String isim=ad.getText();
        String soy=soyad.getText();
        double lev= Double.valueOf(level.getText());
        
        String query="INSERT INTO calisanlar (isim,soyisim,level) VALUES(ömer,faruk,5)";
       
        con=database.baglan();
        try{
            preparedstatement=con.prepareStatement(query);
            preparedstatement.setString(1, isim);
            preparedstatement.setString(2, soy);
            preparedstatement.setDouble(3, lev);
            preparedstatement.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        

        
        
    }
    
}
