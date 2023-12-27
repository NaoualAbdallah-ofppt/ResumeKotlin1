package aa.bb.resumekotlin
 private fun getDefaultSize(anyObject: Any): Int {
        // Vérification du type 
        if (anyObject is String) {
            return anyObject.length
        // Vérification du type 
        } else if (anyObject is List<*>) {
            return anyObject.size
        }
        return 0
    }
    //même fonction mais plus courte
    private fun getDefaultSize2(anyObject: Any) =
    when (anyObject) {
        is String -> anyObject.length
        is List<*> -> anyObject.size
        else -> 0
    }

    //en Kotlin contrairement à java, le cast est implicite avec le mot-clé  is
    //c’est ce que l’on appelle le Smart Cast  //(transtypage intelligent)
/* **************
    Pour convertir une variable dont vous ne connaissez pas forcément le type,
     en un autre type.Par exemple une variable Any en un String : */
    fun main()
    {

        val anyObject: Any = "Hello Kotlin students !"
    val message = anyObject as String
    print(message)
    //ce type de conversion est appelé "unsafe cast" "Conversion non sécurisée".
    // le mot-clé  as  est dit "non sécurisé" car il renverra une exception
    // de typeClassCastException  s'il n’arrive pas à réaliser la conversion.
    // C'est à l'utilisateur de  de la gérer
}