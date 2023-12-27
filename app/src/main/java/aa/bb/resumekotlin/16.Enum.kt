package aa.bb.resumekotlin
enum class ApiResponse1{
    OK,
    NOT_FOUND,
    UNAUTHORIZED,
    FORBIDDEN,
    UNKNOWN
}
enum class ApiResponse2(val code: Int) {
    OK(403),
    NOT_FOUND(404),
    UNAUTHORIZED(401),
    FORBIDDEN(403),
    UNKNOWN(0)
}

enum class CardType(val code:Int,val color: String) {
    SILVER(12,"gray"),
    GOLD(2,"yellow"),
    PLATINUM(4,"black")
}
enum class SEMAINE{
    
    LUNDI{
    override fun numeroSemaine() {println("tftff")}
    },MARDI {
    override fun numeroSemaine() {}
    },MERCREDI {
    override fun numeroSemaine() {}
    },JEUDI {
    override fun numeroSemaine() {}
    },VENDREDI {
    override fun numeroSemaine() {}
    },SAMEDI {
    override fun numeroSemaine() {}
    },DIMANCHE {
    override fun numeroSemaine() {}
    } ;
    abstract fun numeroSemaine()
   
    //; pour séparer les méthodes des constantes
   }
fun main()
{
    // val rep: ApiResponse1 = ApiResponse1.OK
    // when(rep){
    //     ApiResponse1.OK -> print("OK")
    //     ApiResponse1.NOT_FOUND -> print("NOT_FOUND")
    //     ApiResponse1.UNAUTHORIZED -> print("UNAUTHORIZED")
    //     ApiResponse1.FORBIDDEN -> print("FORBIDDEN")
    //     ApiResponse1.UNKNOWN -> print("UNKNOWN")
    // }
    
    var rep2: ApiResponse2=ApiResponse2.OK
    println(rep2.code)
    val col = CardType.SILVER
    println(col.color)
    println(col.code)
    println(col)
   // val c=CardType.SILVER.color

val s = SEMAINE.LUNDI
   s.numeroSemaine()
println(SEMAINE.values().size)
println(ApiResponse2.valueOf("OK"))

}

