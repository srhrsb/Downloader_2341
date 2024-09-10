package com.brh.downloader_2341;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;

public class Controller {
    @FXML
    private TextField targetTf;

    @FXML
    private TextField urlTf;

    @FXML
    protected void download() {

        String link1 = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/Pedro_Almod%C3%B3var-69698.jpg/86px-Pedro_Almod%C3%B3var-69698.jpg";
        String link2 = "https://upload.wikimedia.org/wikipedia/de/thumb/f/f0/Hunde_wollt_ihr_ewig_leben.jpg/147px-Hunde_wollt_ihr_ewig_leben.jpg";
        new Thread( new Download(link1,targetTf.getText()) ).start();
        new Thread( new Download(link2,targetTf.getText()) ).start();


    }

    @FXML
    protected void search() {

        Stage stage = (Stage) targetTf.getScene().getWindow();
        DirectoryChooser directoryChooser = new DirectoryChooser();
        File file = directoryChooser.showDialog(stage);
        String path = file.getAbsolutePath();
        targetTf.setText( path );

    }


}