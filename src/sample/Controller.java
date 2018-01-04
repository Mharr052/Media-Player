package sample;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Controller {

    @FXML
    private MediaView mediaView;

    @FXML
    private Pane mediaViewPane;


    public void onPlayClicked(){
    if(mediaView.getMediaPlayer().getStatus() == MediaPlayer.Status.PLAYING){
        mediaView.getMediaPlayer().stop();
        mediaView.getMediaPlayer().play();
    } else {
        mediaView.getMediaPlayer().play();

    }
    }

    public void onStopClicked(){
        mediaView.getMediaPlayer().stop();

    }

    public void onPauseClicked(){
        mediaView.getMediaPlayer().pause();
    }


}
