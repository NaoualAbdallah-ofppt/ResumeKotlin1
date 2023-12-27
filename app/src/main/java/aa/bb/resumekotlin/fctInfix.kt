package aa.bb.resumekotlin
import kotlin.math.pow

/*En programmation, une fonction infix est une fonction qui est appelée en utilisant
 une notation infixée, c'est-à-dire en plaçant l'opérateur entre les deux arguments.
  En d'autres termes, au lieu de la notation traditionnelle avec des parenthèses ou
  des crochets, l'opérateur apparaît entre les deux valeurs sur lesquelles la fonction agit.
 */

/*
Writing an infix function is a simple case of following three rules:

The function is either defined on a class or is an extension method for a class
The function takes exactly one parameter
The function is defined using the infix keyword
*/
fun main()
{
   val x = 10.add(20)
   val y = 10 add 20   //appel infix
    
   println(x) 
   println(y)
   val z=3.0 puissance 3.5
  println(z)
}
infix fun Int.add(b : Int) : Int = this + b

infix fun Double.puissance(y:Double):Double=this.pow(y)

