package br.com.senaisp.bauru.gabriela.classes;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ManipularImagensApp extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primeiraStage) throws Exception {
		Group root = new Group();
		criarCompontentes(root);
		Scene scena = new Scene(root, 800, 600, Color.BEIGE);
		primeiraStage.setTitle("Manipulando mídias");
		primeiraStage.setScene(scena);
		primeiraStage.show();
	}

	private void criarCompontentes(Group root) {
Duke dk01 = new Duke ();
dk01.setLayoutX(20);
dk01.setLayoutY(20);
//colocando os itens necessarios para o video
Media video = new Media(getClass().getResource("Videos/video.mp4").toString());
MediaPlayer mp = new MediaPlayer(video);
MediaView mvw = new MediaView (mp);
//dimensionar o media view 
mvw.setFitWidth(600);
mvw.setFitHeight(400);
mvw.setFitWidth(600);
mvw.setPreserveRatio(true);

mvw.setX(100);
mvw.setY(100);

Button btnPlay = new Button ("Play");
Button btnPause = new Button ("Pause");
Button btnStop = new Button ("Stop");
//posicionando botoes 
btnPlay.setLayoutX(100);
btnPause.setLayoutX(200);
btnStop.setLayoutX(300);

btnPlay.setLayoutY(450);
btnPause.setLayoutY(450);
btnStop.setLayoutY(450);

btnPlay.setOnAction((ev)->{ mp.play(); });
btnPause.setOnAction((ev)->{ mp.pause(); });
btnStop.setOnAction((ev)->{ mp.stop(); });

root.getChildren().addAll(dk01, mvw, btnPlay, btnPause, btnStop);
}

}
