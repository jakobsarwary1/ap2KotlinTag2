
import de.th_koeln.basicstage.Actor
import kotlin.random.Random

class Pet(val name: String) {
    val actor = Actor()
    var health: Health = Health()
    var happiness: Int = 50


    fun lifeGoesOn() {
        if (Random.nextDouble() < 0.3) {
            health.energy = (health.energy - 5).coerceAtLeast(0)
            println("Energie reduziert! Neue Energie: ${health.energy}")
        }
        GameUI.playerButton.text.content = "Player: ${health.energy}"
        GameUI.feedButton.text.content = "Feed: ${health.energy}"
        GameUI.happinessDisplay.text.content = "Happiness: $happiness"
        GameUI.energyDisplay.text.content = "Energie: ${health.energy}"
    }
}