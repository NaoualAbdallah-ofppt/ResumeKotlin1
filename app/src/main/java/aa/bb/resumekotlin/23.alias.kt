package aa.bb.resumekotlin
/*
Avec les alias de type, nous pouvons donner un alias à un autre type. C'est idéal pour donner un nom aux types de fonctions comme (String) -> Boolean ou type générique
comme Pair<Person, Person> .

 */
data class Person (var nom:String,var prenom:String)
typealias StringValidator = (String) -> Boolean
typealias Reductor<T, U, V> = (T, U) -> V

typealias Parents = Pair<Person, Person>
typealias Persons = MutableList<Person>


fun main()
{
    var x :Persons= mutableListOf()
    x.add(Person("aa","bb"))
}