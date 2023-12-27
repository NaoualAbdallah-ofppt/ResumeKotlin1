package aa.bb.resumekotlin

import kotlinx.coroutines.processNextEventInCurrentThread

open class classMere(var num:Int,var nom:String){
    lateinit var prenom:String
    constructor(num:Int,nom:String,prenom:String):this (num,nom){
        this.prenom=prenom
    }
    open fun test()="$nom/$prenom"
}
class sousClasse1(num:Int,nom:String, var fonction:String):classMere(num,nom)
{}
class sousClasse2(num:Int,nom:String, var organisme:String):classMere(num,nom)
{
}
class sousClasse3(num:Int,nom:String,prenom:String):classMere(num,nom, prenom)
{
    lateinit var organisme:String
    constructor(num:Int, nom:String,prenom:String, organisme: String):this(num,nom,prenom)
    {
     this.organisme=organisme
    }
    //erreur test is final if test doesn't open
    override  fun test()="${super.test()}-organisme:$organisme"


}

