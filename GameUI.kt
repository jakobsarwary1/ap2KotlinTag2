
import de.th_koeln.basicstage.Actor
import de.th_koeln.basicstage.Stage
import de.th_koeln.imageprovider.Assets

object GameUI {


    val stage = Stage()
    val kodee = Actor(Assets.KodeeAssets.WELCOMING)
    val ball = Actor(Assets.MiscAssets.BALL)
    val playerButton = Actor()
    val feedButton = Actor()
    val happinessDisplay = Actor()
    val energyDisplay = Actor()


    init {
        kodee.x = 200 // Alternative zu setPosition
        kodee.y = 100
        kodee.width = 100 // Alternative zu setSize
        kodee.height = 100
        ball.x = 150
        ball.y = 200
        ball.width = 50
        ball.height = 50
        energyDisplay.x = 10
        energyDisplay.y = 500
        energyDisplay.width = 200
        energyDisplay.height = 40
        //energyDisplay.text = "Energie: 100"
        happinessDisplay.x = 10
        happinessDisplay.y = 450
        happinessDisplay.width = 200
        happinessDisplay.height = 40
       // happinessDisplay.text = "Glück: 50"

        playerButton.x = 10
        playerButton.y = 350
        playerButton.width = 100
        playerButton.height = 40
        feedButton.x = 10
        feedButton.y = 400
        feedButton.width = 200
        feedButton.height = 40

        stage.addActor(kodee)
        stage.addActor(ball)
        stage.addActor(energyDisplay)
        stage.addActor(happinessDisplay)
        stage.addActor(feedButton)
        stage.addActor(playerButton)
    }
}