import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.layout.BorderPane
import javafx.scene.layout.Region
import javafx.stage.Stage

class App : Application() {
    private val startScene = Scene(loadStartPage(), 720.0, 720.0)
        .apply { stylesheets.add("/default.css") }

    override fun start(stage: Stage?) {
        stage?.apply {
            title = "Rental Scrapper"

            scene = startScene
            centerOnScreen()
            show()
        }
    }

    private fun loadStartPage() : Region {
        val pane = BorderPane()

        TODO("create starting window")

        return pane
    }
}