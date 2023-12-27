package aa.bb.resumekotlincon

//const val yyyy=8
//ici soit on ititialise soit on utilise lateInit
lateinit var mm:String

//lateinit val yyyy:String //erreur car on ne peut pas utiliser lateInit avec val
fun main() {
    // Types de données : Int, Short, Long, Double, Float, Char, Boolean, String

    var a: String
    a = "aa"
    // a=null erreur

    // a=null non accéptée car le type String n'accèpte pas la valeur nulle
    var b: String?
    b = "gg"
    b = null
var m:String //on peut ne pas initialiser ici
    var c = 3 //Inférence du type. Le type est défini en fonction de la valeur fournie
    //ici Int
    //c="bb" erreur le type de c a été detecté comme int
    //***********************************
    //Déclaration avec val au lieu de var
    val xx: String
    xx = "aa"


    //1ère assignation de variable sans problème
    //xx="bb" cette instruction génére une erreur car xx est déclarée val et
    // donc on ne peut lui assigner qu'une seule valeur
    print("la valeur de x est : $xx")
}

//Une variable déclarée en dehors de main doit être initialisé


val xx: String ="aa"
//initialisation obligatoire en dehors d'une fonction
var yy:String?=null