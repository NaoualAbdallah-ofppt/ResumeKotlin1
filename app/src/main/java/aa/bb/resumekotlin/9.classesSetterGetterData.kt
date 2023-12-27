package aa.bb.resumekotlin

class Produit2(var num:Int, var nom:String)
//déclaration d'une classe avec deux attributs (get et set)

class Produit6 constructor(var num:Int, var nom:String)
//même chose

class Produit4(val num:Int, val nom:String)
//déclaration d'une classe avec deux attributs (get)
class Produit5(private var num:Int, private var nom:String)
//déclaration d'une classe avec deux attributs privée

class Produit55(num:Int)
{

    private var num:Int=num

    private lateinit var nom:String
    fun getNum()=num
    fun setNum(num: Int){this.num=num}
    fun getNom()=nom
    fun setNom(nom: String){this.nom=nom}


}
//déclaration d'une classe avec deux attributs privée
data class Produit3(var num:Int, var nom:String)
//déclaration d'une classe avec deux attributs (get et set)
//et génération de equals, toString() et HashCode()

//je peux redéfinir equals même si elle est générée
data class Produit33(var num:Int, var nom:String)
{
    // cette méthode equals sera utilisée
    //le système n'utilisera pas la méthode
    //générée par data
    override fun equals(other:Any?):Boolean
    {var pp=other as Produit33
     if (pp.num==this.num) return true
    else return false}
}

class Produit1(num:Int, nom:String) //num et nom sont des paramètres
//ce ne sont pas des attributs
{
    var nom =nom // déclaration d'un attribut nom
    var num=num // déclaration d'un attribut nom
}
class Produit111(num:Int, var nom:String) //num et nom sont des paramètres
//ce ne sont pas des attributs
{
    var num =num // déclaration d'un attribut num et initialisation
}

//erreur déclaration en double des attributs
/*
class Produit7(var num:Int, var nom:String)
{
    var nom :String=""
    var num : Int=0
}

 */

//erreur Le nom n'a pas encore été initialisé pour être converti
//en majuscule
/*
class PersonneY(var num:Int,nom:String=nom.uppercase())

 */
class PersonneY(var num:Int,nom:String)
{

    var nom=nom.uppercase()
  }
class PersonneX(var num:Int,var nom:String)
{
    init{
        this.nom=nom.uppercase()}

}
class Personne(private var num:Int,var nom:String)
{
    init{this.nom=nom.uppercase()}
}

class User(email:String ,var password: String,  age: Int)
{
    init {
        if (age < 0)
            throw Exception("age fourni incorrect")

    }
//on a pas utilisé val ou var avec l'age
//car on va déclarer l'attribut plus tard pour
//changer son setter
//age ici est considéré comme paramètre 

    var email: String=email
    //lateinit ne peut pas être utilisée avec
    //get et set explicite
    get() { 
        println("User is getting his email."); 
        return field 
    }
    set(value) { 
        println("User is setting his email"); 
        field = value 
    }

    //Le mot clé lateinit peut être uniquement utilisé avec une variable var.
    var age:Int=age
   //On a pas besoin de modifier le getter 
   //donc on va pas le mettre
    set(value) {
       if ( value<0) throw Exception("Age incorrect")
       else
       field = value 
    }
}
//Le mot-clé  field fait référence à la propriété 
//elle-même pour éviter de boucler à l'infini
//on appelle cela le "Backing Field".

class Voiture
{
    var num : Int
    var marque:String
    init {
        num=0
        marque="Ford"
    }

}
class Voiture2
{
    var num : Int=0
    lateinit var marque:String

   //lateinit juste avec le type complexe
    //lateinit juste avec var
   init
   {
       marque="Ford"
       if(::marque.isInitialized){
           print("La marque ${marque}")
       }
       else
       {println("non initialisé")}
   }

}

class Voiture3
{
    var num :Int=0
    val marque:String by lazy {
        "Ford"
    }
    //initialisation à la première utilisation  juste avec le type complexe
//by lazy ne peut initialiser que des variables déclarées
    //avec val mais peut être utilisée même avec
    //les types primitifs Int, Double...
}
class Rectangle {
    val largeur: Int=0
    val longueur: Int=0
    //attribut calculé
    var perimetre: Int=0
        get() = (longueur +
                largeur) * 2



}
class Rectangle2 {
    val largeur: Int=0
    val longueur: Int=0
    fun perimetre()= (longueur +
            largeur) * 2
}




fun main()
{
    var P55 = Produit55(3)
    P55.setNom("Renault")
    P55.setNum(145)
    println(P55.getNom())
    var V=Voiture2 ()

    //Création d'un objet de la classe produit5
    var p = Produit5(5,"ee")
    // p.num=7 je n'ai pas accès aux attributs private
    var p2=Produit2(8,"pro")
    p2.nom="eee"
    p2.num=56
    var p4= Produit4(44,"peoooooo")
    //p4.nom="eee"  on a accès aux attributs mais on n'a pas
    // le droit de les modifier



    val U=User("aa@xx.com","ee",-23)
    //au moment de l'initialisation il n'utilise le set
    U.age=-5 //utilise le set
    //U.email="aa@xx.com"

    println(U.email)
    println(U.age)
}


//Exemples de la méthode equals
/*
fun main()
{
var x="AA"
var y="AA"
if (x.equals(y))
    println("x=y ok")
else
    println("x non = y ")
if (x==y)
    println("ok==")
var n1=7
var n2=7
if (n1.equals(n2))
    println("x=y ok")
else
    println("x non= y ok")
val a = test(1,"aa")
val b =test(6,"aa")

if (a.equals(b))
    println("a = b")
var c=a
if (a.equals(c))
    println("a = c")
}

 */