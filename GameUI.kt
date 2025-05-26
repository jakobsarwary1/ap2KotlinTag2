import de.th_koeln.basicstage.Actor
import de.th_koeln.basicstage.Stage
import de.th_koeln.imageprovider.Assets

object GameUI {
    val stage = Stage()
    val kodee = Actor(Assets.KodeeAssets.WELCOMING)
    val ball = Actor(Assets.MiscAssets.BALL)
    val playButton = Actor()
    val feedButton = Actor()
    val happinessDisplay = Actor()
    val energyDisplay = Actor()
    lateinit var pet: Pet

    init {
        kodee.x = 250 // Alternative zu setPosition
        kodee.y = 0
        kodee.width = 100 // Alternative zu setSize
        kodee.height = 100

        ball.x = 250
        ball.y = 70
        ball.width = 30
        ball.height = 30

        energyDisplay.text.textBackground = Assets.textBackgrounds.BLUE_BUTTON
        // energyDisplay.text.content = "Energie"
        energyDisplay.x = 10
        energyDisplay.y = 0
        energyDisplay.width = 200
        energyDisplay.height = 40

        happinessDisplay.text.textBackground = Assets.textBackgrounds.BLUE_BUTTON
        // happinessDisplay.text.content = "Happiness"
        happinessDisplay.x = 10
        happinessDisplay.y = 40
        happinessDisplay.width = 200
        happinessDisplay.height = 40


        feedButton.text.textBackground = Assets.textBackgrounds.BLUE_BUTTON
        //  feedButton.text.content = "Feed"
        feedButton.x = 10
        feedButton.y = 80
        feedButton.width = 200
        feedButton.height = 40

        playButton.text.textBackground = Assets.textBackgrounds.BLUE_BUTTON
        // playButton.text.content = "Play"
        playButton.x = 10
        playButton.y = 120
        playButton.width = 200
        playButton.height = 40


        // Füge alle Aktoren zur Stage hinzu
        GameUI.stage.addActor(GameUI.kodee)
        GameUI.stage.addActor(GameUI.ball)
        GameUI.stage.addActor(GameUI.playButton)
        GameUI.stage.addActor(GameUI.energyDisplay)
        GameUI.stage.addActor(GameUI.happinessDisplay)
        GameUI.stage.addActor(GameUI.feedButton)

    }

}