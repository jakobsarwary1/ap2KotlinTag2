


fun main() {
    val myPet = Pet("Kodee")
    println("Name: ${myPet.name}")
    println("Energie: ${myPet.health.energy}")
    println("Fitness: ${myPet.health.fitness}")
    println("Happiness: ${myPet.happiness}")

    repeat(10) {
        myPet.lifeGoesOn() // Testet Energie-Reduktion
    }

    // Füge alle Aktoren zur Stage hinzu
    /*GameUI.stage.addActor(GameUI.kodee)
    GameUI.stage.addActor(GameUI.energyDisplay)
    GameUI.stage.addActor(GameUI.happinessDisplay)*/

    // Starte die Stage (angenommen, Framework startet automatisch oder benötigt andere Methode)
    // Wenn dies nicht funktioniert, frage nach der Startmethode
}