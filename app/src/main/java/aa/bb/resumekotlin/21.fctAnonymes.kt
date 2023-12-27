
package aa.bb.resumekotlin

//Les fonctions anonymes sont, comme leur nom l’indique, des fonctions qui ne vont
// pas posséder de nom. on utilisera les fonctions anonymes lorsqu’on n’a pas besoin
// d’appeler notre fonction par son nom c’est-à-dire lorsque le code de notre fonction n’est
//appelé qu’à un endroit dans notre script et n’est pas réutilisé
var a =fun(a: Int, b: Int) : Int = a * b
var b=fun(a: Int, b: Int): Int {
    val mul = a * b
    return mul
}
fun main()
{
    println(a(1,2))
    println(b(1,7))
}