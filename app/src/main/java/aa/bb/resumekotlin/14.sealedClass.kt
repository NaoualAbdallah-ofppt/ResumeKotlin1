package aa.bb.resumekotlin
/*
En résumé, sealed est utilisé pour restreindre le nombre de sous-classes
 d'une classe donnée et rendre les expressions when exhaustives
les classes ou interfaces sealed peuvent être sous-classées mais les sous-classes
 (ou les implémentations s'il s'agit d'une interface scellée) ne peuvent être définies
  que dans le même module et le compilateur garde une trace d'une
liste exhaustive de toutes les sous-classes.
Une autre règle est que vous ne pouvez pas en créer des sous-classes anonymes

La caractéristique principale des classes scellées est que toutes les sous-classes
 doivent être connues au moment de la compilation, mais elles ne nécessitent pas
 d'être déclarées dans le même fichier source. Vous pouvez définir des sous-classes
  dans différents fichiers, mais elles doivent être accessibles depuis le lieu où
  la classe scellée est déclarée.
 object: MySealedClass).
L'avantage d'un type scellé est que le compilateur sait quand vous avez vérifié
de manière exhaustive un type dans les when instructions, les chaînes
if/else, etc. Il peut également être utilisé dans une bibliothèque pour
s'assurer que seules les implémentations connues d'une classe ou d'une interface sont toujours transmis (empêche les utilisateurs de créer des sous-classes de quelque chose et de les transmettre à la bibliothèque).
 */
/*En résumé, "sealed" est un modificateur utilisé pour limiter le nombre
de sous-classes d'une classe donnée,
 */
sealed class Forme {
    class Cercle(val rayon: Double) : Forme()
    class Rectangle(val largeur: Double, val hauteur: Double) : Forme()
    class Triangle(val côté1: Double, val côté2: Double, val côté3: Double) : Forme()
}
fun calculerAire(forme: Forme)=
    when (forme) {
        is Forme.Cercle -> Math.PI * forme.rayon * forme.rayon
        is Forme.Rectangle -> forme.largeur * forme.hauteur
        is Forme.Triangle -> {
            // Utiliser la formule de Héron pour calculer l'aire d'un triangle
            val demiPerimetre = (forme.côté1 + forme.côté2 + forme.côté3) / 2
            val aire = Math.sqrt(demiPerimetre * (demiPerimetre - forme.côté1) * (demiPerimetre - forme.côté2) * (demiPerimetre - forme.côté3))
            aire
        }
        else -> -1
    }
lateinit var m:Forme
fun main() {
    val cercle = Forme.Cercle(5.0)
    val rectangle = Forme.Rectangle(3.0, 4.0)
    val triangle = Forme.Triangle(5.0, 12.0, 13.0)
    println("Aire du cercle: ${calculerAire(cercle)}")
    println("Aire du rectangle: ${calculerAire(rectangle)}")
    println("Aire du triangle: ${calculerAire(triangle)}")
}