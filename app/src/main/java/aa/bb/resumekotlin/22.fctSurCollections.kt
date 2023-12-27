package aa.bb.resumekotlin
//La classe User existe déjà. Chaque User a un email et un mot de passe

fun main()
{

val users = listOf(

    User("toto@gmail.com", "aa",20),
    User("hello@gmail.com", "bb",18),
    User("oc@gmail.com", "cc",35))
//it mot réservé faisant réference au paramètre
// Get the older user
println(users.maxBy { it.age } )         // User("oc@gmail.com", 35)
// Get the younger user
println(users.minBy { it.age } )     // User("hello@gmail.com", 18)
// Is all users >= 20 ?
println(users.all { it.age >= 20 } )   // false
//println(users.all { User::age >= 20 })
// Is any user >= 35 ?
println(users.any { it.age > 35 })     // true
// How many user are >= 20 ?
println(users.count{it.age>= 20})      // 2
// Find the first user who is >= 20
println(users.find{ it.age >= 20 })  
  // User(email="toto@gmail.com", age=20)
println(users.map{it.age})
//il retourne une listOf User
var usersMoins20 =users.filter{it.age<20}
println(usersMoins20)


}


