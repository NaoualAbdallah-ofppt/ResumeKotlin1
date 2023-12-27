package aa.bb.resumekotlin

val fct1={ x: Int ->x*2}
val fct2={ x: Int ->x*3}
//une fonction high-level
inline fun MaFonction(x:Int,  fct:(Int)->Int )=fct(x)
fun main()
{
println(MaFonction(1, fct2) )
println(MaFonction(1, fct1) )
}

