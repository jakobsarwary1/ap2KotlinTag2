
import de.th_koeln.basicstage.Actor
import kotlin.random.Random

class Pet(val name: String) {
    val actor = Actor()
    var health: Health = Health()
    var happiness: Int = 60
    val inventory: MutableList<Item> = mutableListOf()

    init {
        actor.animation.everyNsteps.timeSpan = 40
        actor.animation.everyNsteps.reactionForTimePassed = {
            lifeGoesOn()
        }
    }


    fun lifeGoesOn() {
        if (Random.nextDouble() < 0.3) {
            health.energy = (health.energy - 5).coerceAtLeast(0)
            println("Energie reduziert! Neue Energie: ${health.energy}")
            health.fitness = (health.fitness - 5).coerceAtLeast(0)
            println("Fitness reduziert! Neue Fitness: ${health.fitness}")

            happiness = (happiness - 2).coerceAtLeast(0)
            println("Happiness reduziert! ${happiness}")
        }
        GameUI.energyDisplay.text.content = "Energie ${health.energy}"
        GameUI.happinessDisplay.text.content = "Happiness $happiness"
        GameUI.feedButton.text.content = "Feed ${health.fitness}"
        GameUI.playButton.text.content = "Play"
    }



}