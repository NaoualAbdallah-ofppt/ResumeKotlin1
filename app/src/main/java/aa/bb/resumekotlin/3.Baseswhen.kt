package aa.bb.resumekotlin
fun main() {
    var apiResponse = 404

    when (apiResponse) {
        200 -> print("OK")
        404 -> print("NOT FOUND")
        401 -> print("UNAUTHORIZED")
        403 -> print("FORBIDDEN")
        else -> print("UNKNOWN")
    }


    when (apiResponse) {
        200, 201, 202 -> print("SUCCESS")
        300, 301, 302 -> print("REDIRECTION")
        400, 404 -> print("ERROR")
        else -> print("UNKNOWN")
    }
    val numberToFind = 55

    when (numberToFind) {
        in 1..33 -> print("Number is between 1 and 33")
        in 34..66 -> print("Number is between 34 and 66")
        in 67..100 -> print("Number is between 67 and 100")
    }


    val x: Int = 20
    var y :Int =5
    val z = when {
        x < 40  && y==5-> "test1"
        x > 60 -> "test2"
        else -> "test3"
    }



}