package aa.bb.resumekotlin
/* Une fonction d'ordre supérieur (higher order ) est
une fonction qui prend des fonctions comme paramètres,
ou qui renvoie une fonction*/
val difference = { x: Int, y: Int ->
     if (x>y) {x - y} else {y-x}}
val addition = { x: Int ,y:Int-> x + y }
val produit = { x: Int, y: Int -> x / y }
val maFcttt={x:Int->x*2}

//cette fonction est high order car elle reçoit en paramètre une fonction
fun operation(n1:Int,
              n2:Int,
              op:(Int,Int)->Int) //paramètre fonction
=op(n1,n2)



//cette fonction est high order car elle retourne une fonction
fun multiplyBy(factor: Int): (Int) -> Int {
     return { x -> x * factor }
}

fun main()
{
println(operation(2, 5, difference) )
println(operation(5, 2,produit ))
     println(operation(5, 2,addition ))
     //println(operation(5, 2, maFcttt )) erreur maFcttt ne correspond
     // pas à la déclaration



     println(operation(10, 2, { x: Int ,y:Int-> x + y } ))
     //Il est possible de fournir directement une fonction lambda

     // Utilisation de la fonction d'ordre supérieur pour créer une nouvelle fonction
     val multiplyByTwo = multiplyBy(2) //multiplyByTwo est une fonction qui est retourné
     // par la fonction multiplyBy
     val multiplyByThree = multiplyBy(3)

     // Utilisation des nouvelles fonctions créées
     var nbr=multiplyByTwo(5)   // Résultat: 10

     println("Multiplier par 3: ${multiplyByThree(4)}") // Résultat: 12
}