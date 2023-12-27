package aa.bb.resumekotlin
fun main()
{
// While
var i=0
while (i<10) {
    i++
    println("i:$i")
}

// Do While
i=0
do {
    println("i:$i")
} while (i<10)

//for
val lst = listOf("sabir", "Kamil", "Sadqi");
//for pour parcourir les valeurs
for (elt in lst) {
    println("Elément : $elt");
}

//for pour parcourir les valeurs par indice 
for (i in lst.indices) {
    println("Elément à la position $i est : ${lst[i]}")
}

//for pour parcourir les éléments indice et valeur
for ((index, value) in lst.withIndex()) {
    println("Elément à la position $index est : $value")
}

//for avec un compteur de 1 à 10
for (i in 1..10) {
    println("$i")
}
//for avec un compteur de 1 à 9
for(i in 1 until 10)
    println(i)
// de a à t (x-1)
    var x:String="a"
    var y : Char='a'

for(i in 'a' until 'x')
    print(i)

//for de 10 à 1 pas 1
for (i in 10 downTo 1 ) {
    println("Index is :$i")
}
    //for de 10 à 1 pas 2
for (i in 10 downTo 1 step 2) {
     println("Index is :$i")
}

repeat(50){
    println(it) //it représente le nombre dans le compteur
}
    //var arr : IntArray = intArrayOf(1,2,3)
//les mots-clés  step  et  downTo  sont en réalité des fonctions dîtes "infix".
//Elle permet de créer un objet Pair (de la bibliothèque Kotlin), un tuple associant 2 valeurs.
}