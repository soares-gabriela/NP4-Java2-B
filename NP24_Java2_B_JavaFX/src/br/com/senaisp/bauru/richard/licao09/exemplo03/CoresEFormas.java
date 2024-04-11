package br.com.senaisp.bauru.richard.licao09.exemplo03;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.Stop;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.RadialGradient;
import javafx.scene.shape.Polygon;

public class CoresEFormas extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primeiraStage) throws Exception {
		Group root = new Group();
		// criando componentes
		criarComponentes(root);
		// criando a cena
		Scene scena = new Scene(root, 600, 400, Color.BLACK);
		// configurando a stage
		primeiraStage.setTitle("Cores e Formas");
		primeiraStage.setScene(scena);
		primeiraStage.show();

	}

	private void criarComponentes(Group root) {
		LinearGradient lg = new LinearGradient(
				//startX, StartY, EndeX, EndY, Proporcional?
				//forma de ciclo de gradiente
				0, 1, 1, 0, true, CycleMethod.NO_CYCLE, 
				new Stop [] {
						new Stop (0, Color.BLACK),
						new Stop (1, Color.YELLOW),
						new Stop (1, Color.BLUE),
		});
		RadialGradient rg = new RadialGradient(
				0, 0, 0.5, 0.5, 1, true, CycleMethod.NO_CYCLE,
				new Stop [] {
			new Stop (0, Color.YELLOW),
			new Stop (0.25, Color.RED),
			new Stop (0.5, Color.TRANSPARENT)
		});
		Polygon pir = new Polygon(new double[] { 
				210.0, 10.0, 
				210.0, 210.0, 
				10.0, 210.0 });
		//pir.setFill(Color.rgb(225, 0, 0));
		pir.setFill(rg);
		//posicionando o triangulo
		pir.setLayoutX(200);
		// COLOCANDO NO NÓ ROOT
		root.getChildren().add(pir);
	}
}