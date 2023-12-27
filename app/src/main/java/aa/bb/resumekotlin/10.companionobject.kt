package aa.bb.resumekotlin
data class Bureau(var couleur: String,
                  var largeur: Double,
                  var longueur:Double) {

    init {
        nbrBureau++
    }
    companion object {
        private var nbrBureau :Int=0
        fun getnbrBureau()= nbrBureau
    }
}

fun main()
{
    var b1=Bureau("gris",34.0,67.0)
    var b2=Bureau("gris",34.0,67.0)
    var b3=Bureau("gris",34.0,67.0)
    println("Nombre :${Bureau.getnbrBureau()}" )

}
