


package Animalerie

import Animalerie.Animalerie
import Animalerie.Cheval

fun main(){
    val animalerie = Animalerie()


    animalerie.ajouterAnimaux(Cheval())

    for (moyen in animalerie.list){
        moyen.parler()
        moyen.quiSuiJe()

    }


}