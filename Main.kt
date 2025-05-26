


fun main() {


    val myPet = Pet("kodee")
    GameUI.pet = myPet
    println("Name: ${myPet.name}")
    println("Energie: ${myPet.health.energy}")
    println("Happiness: ${myPet.happiness}")
    println("Fitness: ${myPet.health.fitness}")

//    repeat(times = 10) {
//        myPet.lifeGoesOn() // Testet Energie-Reduktion
//    }


    // Starte die Stage (angenommen, Framework startet automatisch oder benötigt andere Methode)
    // Wenn dies nicht funktioniert, frage nach der Startmethode

    GameUI.stage.addActor(GameUI.pet.actor)
}