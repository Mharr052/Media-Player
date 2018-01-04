package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {


MediaPlayer player;

    @Override
    public void start(Stage primaryStage) throws Exception{

        URL mediaURL = getClass().getResource("Wilderness.mp4");
        String mediaStringURL = mediaURL.toExternalForm();

        //Create the Media
        Media media  = new Media(mediaStringURL);
        //Create Player
        final MediaPlayer player = new MediaPlayer(media);
        //Start the PlayBack
        player.setAutoPlay(true);








        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("MediaPlayer");
        Scene mainScene =  new Scene(root, 300, 275);
        MediaView mediaView = (MediaView) mainScene.lookup("#mediaView");
        mediaView.setMediaPlayer(player);
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
