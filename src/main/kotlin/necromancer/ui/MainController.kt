package necromancer.ui

import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.Scene
import java.util.function.Supplier

class MainController: Application(){
	
	override fun start(primaryStage: Stage) {
		val root : Parent  = FXMLLoader.load(javaClass.getResource("mainController.fxml"));
		primaryStage.setTitle("Necromancer")
		primaryStage.setScene(Scene(root,300.0,300.0))
		primaryStage.show()
	}
	
	
	
	fun closeApp(){
		System.exit(0)
	}
	
	companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(MainController::class.java)
        }
    }
}