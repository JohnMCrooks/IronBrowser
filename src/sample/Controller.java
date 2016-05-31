package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Controller {
    @FXML
    TextField addresBar;

    @FXML
    WebView view;

    public void onGo(){
        String adress = addresBar.getText();
        if(!adress.startsWith("http")){
            adress = "http://" +adress;
        }
        WebEngine engine = view.getEngine();
        engine.load(adress);
    }

    public void onKeyPress(KeyEvent event){
        if(event.getCode()== KeyCode.ENTER){  ;  // is the button pressed equal to the Enter key
            onGo();
        }

}}
