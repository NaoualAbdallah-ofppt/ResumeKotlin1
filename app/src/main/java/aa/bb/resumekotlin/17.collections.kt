package aa.bb.resumekotlin
fun main() {
// listOf

    val lst = listOf("Sabir", "Radi", "Sadqi")
    print(lst[0])// => Sabir
//lst[0] = "XX" // => ERROR ! List is immutable
    for (elt in lst) {
        println(elt)
    }

// mutableListOf
    val lstM = mutableListOf("Jake Wharton", "Joe Birch", "Robert Martin")
    print(lstM[0])// => Jake Wharton
    lstM[0] = "Mathieu Nebra" // => SUCCESS !

// setOf
    val setOfNames1 = setOf("Jake Wharton", "Joe Birch", "Robert Martin")
    print(setOfNames1.first()) // => Jake Wharton
    // setOfNames1.add("Mathieu Nebra") // => ERROR ! Set is immutable

    val x = setOf(1,2,3,5,2)
    println(x)
    x.drop(3)
    println(x)

// mutableSetOf
    val setOfNames2 = mutableSetOf("Jake Wharton", "Joe Birch", "Robert Martin")
    print(setOfNames2.first()) // => Jake Wharton
    setOfNames2.add("Mathieu Nebra") // => SUCCESS !


// mutableMapOf
    val listOfNames = mutableListOf("Jake Wharton", "Joe Birch", "Robert Martin")
    listOfNames[0] // => Jake Wharton
    listOfNames[0] = "Mathieu Nebra" // => SUCCESS !

//map
    val numbersMap1 = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    println("All keys: ${numbersMap1.keys}")
    println("All values: ${numbersMap1.values}")
    if ("key2" in numbersMap1) println("Value by key \"key2\": ${numbersMap1["key2"]}")
    if (1 in numbersMap1.values) println("The value 1 is in the map")
    if (numbersMap1.containsValue(1)) println("The value 1 is in the map") // identique au précédent


    val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)
    println("The maps are equal: ${numbersMap1 == anotherMap}")

//mutableMap
    val numbersMap2 = mutableMapOf("one" to 1, "two" to 2)
    numbersMap2.put("three", 3)
    numbersMap2["one"] = 11
    println(numbersMap2)



    var strings: Collection<String> = listOf("aa","bb","cc")
        for(s in strings) print("$s ")

//arraylist
    val lstm :ArrayList<String> = arrayListOf()
    lstm.add("aa")

    //hashMap
    val mapm:HashMap<Int,String> = hashMapOf()
    mapm.put(4,"aa")

}



