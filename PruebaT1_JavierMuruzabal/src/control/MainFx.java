package control;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import view.ControlFX;

/**
 * Clase principal.
 * Carga la pantalla Profile.fxml
 * Añade las fuentes de google.
 * Se crea la escena con el título
 * 
 * @author Javier Muruzabal
 * @version 1.0
 * @see ControlFX
 * 
 */
public class MainFx extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {

		// 1º Cargar recursos
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/Profile.fxml"));
				
		// 2º Crear paneles
		AnchorPane panelInicial = (AnchorPane) loader.load();
		
		Scene scene = new Scene(panelInicial);
		
		// 3º adding Google fonts
		scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Poiret+One");

		// 3º Añadir fuente instalada (que no se puede instalar)
		//Font.loadFont(getClass().getResourceAsStream("../view/assets/PoiretOne-Regular.ttf"), 20);
				
		// 4º Añade la escena al stage y la titula
		primaryStage.setTitle("My Github profile");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
