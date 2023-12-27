package aa.bb.resumekotlin
data class Produit (var num:Int, var libelle:String)
/*le mot clé object permet la déclaration d'un singleton
Un singleton est une classe qui a une seule instance.
 */
object monSingleton
{

    fun aa():String{
       var P= Produit(1, "Stylo")
        return P.libelle
    }
    fun bb():Int=Produit(1,"Stylo").num
}

object obj{
    var a:Int=-1
    var b :String="aa"
    fun fct1()
    {

    }

}


fun main()
{
    //pas d'instanciation
    println(monSingleton.aa())
    // Accessing the singleton instance and calling its function
    print(obj.a)
    obj.fct1()


}


