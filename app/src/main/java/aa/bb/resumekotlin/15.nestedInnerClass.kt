package aa.bb.resumekotlin
//dans ce cas les classes sont imbriquée (nested)
// je ne peux pas accéder aux attributs de Outer
//depuis les classes internes

class Outer {
 val bar:Int=12
    class Nested1 (var x:Int) {
    fun foo() =34
    }
    class Nested2 {
        fun foo() = 2
        }
    class Nested3 {
            fun foo() = 3
        //var t=bar  Erreur
        var r=Nested1(6) //accès aux autres classes
        //var p=innerNested4() erreur class inner

    }
    inner class  innerNested4{
        var p =Nested1(7)
    }

fun xx()
{//fonction déclarée dans la classe
    var s = Nested1(3)
    var m=bar
    var inn=innerNested4()
}
}
fun main()
{
    val ds=Outer.Nested1(6)
  val demo = Outer.Nested1(5)
  demo.foo()
    //je ne peux pas faire demo.bar
    val oo =Outer()


// je ne peux pas écrire   val demo = Outer.innerNested4()

}


