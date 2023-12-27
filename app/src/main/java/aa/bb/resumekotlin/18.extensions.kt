package aa.bb.resumekotlin

/*Afin d’étendre le comportement d’une classe, qu’elle soit écrite en Java ou en Kotlin,
  nous allons pouvoir, grâce au mécanisme d’extension que nous offre Kotlin.Nous allons pouvoir
  "ajouter" des méthodes à l’intérieur de classes existantes  sans les modifier directement
   ou en hériter
 */

//Ici, une fonction d'extension removeFirstLastChar() est ajoutée à la classe String.
// Le nom de la classe est le type de récepteur(receiver) (classe String dans notre exemple).
// Le mot clé this à l'intérieur de la fonction d'extension fait référence à l'objet récepteur (receiver)

fun String.removeFirstLastChar(): String
= this.substring(1, this.length - 1)


//fonction extension sur une collection MutableList<String>
fun MutableList<String>.shift(){
    if(!this.isEmpty()){
    this.removeAt(0)
    }
    else throw NoSuchElementException("Collection vide")
}

fun Any?.toString(): String {
   if (this == null) return "---"
        // après la vérification nulle, 'ceci' est converti automatiquement en un type
    // non nul, donc le toString() ci-dessous
        // se résout en fonction membre de la classe Any
        return toString()
}

//lambda


//fct d'exten
val lambda4: String.(Int) -> String = {this + it}

//nombre d'éléments nulles dans une collection générique
fun <T> Collection<T?>.nbrNull(): Int {
    var nbr=0
    for (element: T? in this) {
        element.let{
            nbr++
        }
    }
    return nbr
}


fun main() {

val myString= "Hello Everyone"
val result = myString.removeFirstLastChar()
println("First character is: $result")
val listName: MutableList<String> = mutableListOf("Noé","Jean","Carole","Rose","Luc")
println(listName)
listName.shift()
println(listName)

var x:String? =null
println(x.toString())

}

