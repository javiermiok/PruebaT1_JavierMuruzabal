package view;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Controlador de las ventanas
 * -Realiza una animación inicial
 * -Abre una nueva ventana/Stage
 * -Y cierra una ventana/Stage
 * 
 * @author Javier Muruzabal
 * @version 1.0
 */
public class ControlFX {
	
	@FXML
	AnchorPane rootPane;
	
	@FXML
	ImageView imagenPerfil;

	
	/**
	 * Realiza un FadeTransition de la imagen del perfil,
	 * al inicializarse la ventana.
	 */
	@FXML
	public void initialize() {
		FadeTransition fadeTransit = new FadeTransition(Duration.seconds(5), imagenPerfil);
		fadeTransit.setFromValue(0);
		fadeTransit.setToValue(1);
		fadeTransit.play();
	}
	
	/**
	 * Crea un nuevo Stage con el panel GetMe.fxml
	 * y lo sustituye por el Stage anterior de Profile.fxml.
	 */
	public void sendStage() {
		
		try {
			// 1º Se crea el nuevo Stage y su panel.
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/GetMe.fxml"));
			AnchorPane segundoPanel;
			segundoPanel = (AnchorPane) loader.load();
			Stage nuevoStage = new Stage();
			nuevoStage.setTitle("My Github Profile Form");
			nuevoStage.setScene(new Scene(segundoPanel));
			
			// 2º Se cierra el Stage anterior
			Stage thisStage = (Stage) rootPane.getScene().getWindow();
    	    thisStage.close();
			
    	    // 3º Se muestra el nuevo Stage
			nuevoStage.show();
			System.out.println("Carga de la segunda ventana sin problemas");
			
		} catch (IOException e) {
			System.out.println("Problema al cargar la segunda ventana/Stage");
			e.printStackTrace();
		}		
	}
	
	/**
	 * Método para cerrar la aplicación
	 */
	public void closeStage() {
		System.exit(0);
	}
}
