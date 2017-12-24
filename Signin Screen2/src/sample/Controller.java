package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import java.io.File;

import java.net.URL;
import java.util.ResourceBundle;

import static java.util.Collections.replaceAll;

public class Controller implements Initializable {
    @FXML
    private MediaView mediaView;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        
// add the video link of your choice.
        Media media = new Media(new File("C:\\Users\\Nikhil\\IdeaProjects\\Signin Screen2\\src\\sample\\video.mp4").toURI().toString());
        MediaPlayer player= new MediaPlayer(media);
        mediaView.setMediaPlayer(player);
        player.play();
        player.setVolume(0);


    }
}
