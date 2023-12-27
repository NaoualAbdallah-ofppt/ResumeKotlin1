package aa.bb.resumekotlin
fun main()
{

var nom:String?="ALAMI"
    println(nom) //affiche Alami

    var prenom:String?=null
    println(prenom) // affiche null

    //println(nom.uppercase())
    //erreur only safe ?. or non null asserted !! are allowed on a nullable receiver
//?. =only safe operator
// !!= non null asserted

    //C'est une manière de ne pas avoir l'erreur
    if (nom ==null)
        println("la valeur est null")
        else
        println(nom.uppercase())


    println(prenom?.uppercase())
    //appelle la méthode uppercase() si prenom est non null et affiche null sinon
//?. opérateur safe

    println(prenom!!.uppercase())

    //!! is called not-null assertion operator. Si prenom est null une exception est
    //levée sinon la valaur est affichée



    val newVal= prenom ?: "+++"
    println(newVal)
    //L'opérateur ?: est appelé l'opérateur de l'expression Elvis.
    // Cet opérateur est utilisé pour fournir une valeur de secours (fallback)
    // dans le cas où une expression est nulle. Ici si la variable newVal prend la
    //valeur de la variable prenom si prenom est  non nulle et prend +++ si prenom
    //est null

    var code="AAAA     "
    println ("$code")

    var x=code?.let{

    it.lowercase()
    it.trim()
    }
    println ("$x")
        //La fonction let permet d'effectuer des opérations sur un objet uniquement
// s'il n'est pas nul. cela peut rendre le code plus sûr.
        //ici si code n'est pas null, le bloc de code associé à let va être exécuté
// sinon x prend null
  //Rq : it représente la valeur de la variable nom





}