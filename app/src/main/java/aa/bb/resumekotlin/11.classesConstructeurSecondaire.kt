data class Filiere(val codF: String)
data class Stagiaire(val nom: String){
    //pas de lateinit avec val et pas lateinit avec les types primitifs
    lateinit var prenom : String
    lateinit var filiere: Filiere
    init
    {
        if(::filiere.isInitialized){
            print("La filière ${filiere.codF} été affectée au stagiaire $nom $prenom")
        }
    }
   constructor(nom:String,prenom:String):this(nom)
{
   this.prenom=prenom

}
    constructor(nom:String, prenom:String, filier: Filiere ) : this (nom, prenom)
    {
        this.filiere=filiere

        if(::filiere.isInitialized){
            print("La filière ${filiere.codF} été affectée au stagiaire $nom $prenom")
        }
        else
        {println("non initialisé")}
    }


    fun affiche()=
        if (::filiere.isInitialized)
            "Stagiaire $nom $prenom- FIlière :  ${filiere.codF}"
            else
            "Stagiaire $nom $prenom- FIlière : --"


}

fun main()
{
    //filière non initialisée
    val stag=Stagiaire("aa","bb")
        stag.affiche()
    //Filière affectée
    val fil=Filiere("DevAM")
    stag.filiere=fil
    stag.affiche()
//filière affectée lors de la construction
    val stag2=Stagiaire("aa","bb",Filiere("DevDig"))
    stag2.affiche()

    }
   
