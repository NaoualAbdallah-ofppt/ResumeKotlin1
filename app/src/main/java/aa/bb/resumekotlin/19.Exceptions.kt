package aa.bb.resumekotlin

/*
Il existe deux types d’exceptions :
• Exception vérifiée – Exceptions généralement définies sur les méthodes et vérifiées au moment de la compilation, par exemple IOException, FileNotFoundException,
etc.
• Exception non vérifiée – Exceptions généralement dues à des erreurs logiques et vérifiées au moment de l’exécution, par exemple NullPointerException,
ArrayIndexOutOfBoundException, etc.

 */


    fun main(args: Array<String>){
        try{
            var num = 10 / 0
        } catch(e: ArithmeticException){
// caught and handles it
            println("Divide by zero not allowed")
        }


    }

fun calcul(a:Int,b:Int) :Double
{
    if( b==0 ) throw Exception ("erreur le nombre ne doit pas être 0")
    else
        return a.toDouble() / b
}



