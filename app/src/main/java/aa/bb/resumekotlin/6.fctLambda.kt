package aa.bb.resumekotlin
//fonction lambdas
val somme1:(Int,Int)->Int = { x, y -> x+y }
//ou  tout simplement
val somme2={ x:Int, y:Int -> x+y }

val double1:(Int)->Int={x->x*2}
//ou
val double2={x:Int->x*2}

val puissance1: (Int) -> Int ={ a -> a * a}
//ou
val puissance={ a:Int -> a * a}

val concat1: (String,String) -> String = { a , b -> a + b }
//ou
val concat2= { a:String , b:String -> a + b }

val afficher1: (Int)-> Unit = {x->print(x)}
//ou
val afficher2 = {x:Int->print(x)}

fun main()
{

    println(somme1(4,6))
    println(double1(4))
    var S1:String="Bonjour"
    var S2:String="Sabir"
    println(concat1(S1,S2))

}
/*
val numbers = arrayOf(1,-2,3,-4,5)
println(numbers.filter { it > 0 })
*/

//Fonction lambdas Somme

//Fonction lambdas Double
//val double={x->x*2}
//error: cannot infer a type for this parameter. Please specify it explicitly.
//val double={x->x*2}

 //cette fct lambdas sera une fonction d'extension pour les
 //strings