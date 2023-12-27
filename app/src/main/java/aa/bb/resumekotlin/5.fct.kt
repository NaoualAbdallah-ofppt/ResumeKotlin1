package aa.bb.resumekotlin
fun fct01(nom : String) : String{
    return "bonjour $nom"
}
fun fct02(nom : String) : Unit{
    println ("bonjour $nom")
}
/*
String fct0(String nom){
    return "bonjour " +nom
}
void fct0(String nom){
    System.out.println( "bonjour " +nom)
}
 */

fun fctt1(): String { return "Bonjour. Je suis fct1" }
//fun fctt1() { return "bonjour" }
//error: type mismatch: inferred type is String but Unit was expected
fun fct2() = "Bonjour. Je suis fct2"
fun fct3() = println("Hello !")
fun fct4(): Unit = println("Hello !")
fun fct5(): Unit { println("Hello !") }
fun fct6() { println("Hello !") }

//Fonction qui reçoit des paramètres.
//Les paramètres peuvent avoir des valeurs par défaut
fun fct6(nbr2: Int = 3,nom: String, nbr1: Int ,ok: Boolean = false) {
    if (!ok) println("$nom is not ok")
    else
        for(i in nbr1 until nbr2) {
            println(nom)
        }

}

//On peut déclarer des fonctions à l'intérieur d'autres fonctions. Elles
//pourront être utilisées en interne
fun fct7(nom: String, nbr1: Int , nbr2: Int = 3,ok: Boolean = false) {
      fun fct7_1() {
            for (i in nbr1..nbr2) {
                println(i)
            }
        }
    fun fct7_2()
    {
        for (i in nbr1..nbr2) {
            println(nom)
        }

    }
    fct7_1()
    fct7_2()
}

fun concat(a:String,b:String)=a+b
//surcharge des fonctions

//le nom de la fonction n'est pas unique
//la signature est unique (nom de la fonction + types des params de la fonctions)
//le type de retour ne compte pas dans la signature
fun carre(num:Int)=num*num
//signature Carre(Int)
fun carre(num:Double)=num*num
//signature Carre(Double)
fun carre(nom:String)=nom+nom
//signature Carre(String)


//fun carre(num:Double):String=(num*num).toString()
//a la même signature que fun carre(num:Double):Double=num*num

fun main()
{
    //appel si paramètres avec valeurs par défaut

    fct6(1,"bb",6,true)
    fct6(2,"cc",8)
    fct6(nom="ttt",nbr1=3)
    fct6(nbr1=4,nom="uu")
    fct6(nbr1=2,nom="uu",ok=false)
    println(concat("aa","bb"))

}
