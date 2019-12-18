

/*fun Animalerie.main(args: Array<String>) {

    val str1 = "1"
    val str2 = "2"
    val str3 = "3"

    val chiffre1 = 1
    val chiffre2 = 2

    // string interpolation
    val str4 = "$str1 $str2 $str3"

    // displaying concatenated string
    add(str1 , str2 , str3)
    calcul(chiffre1 , chiffre2)
}

fun add(args0: String, args1: String, args2: String) {
    var nbre = "$args0 $args1 $args2"

    println(nbre)

}

fun calcul(num: Int, num1: Int) {


    var result = num + num1

    println(result)


}*/

import java.io.Console

    fun main(args: Array<String>) {

        print("Enter an Integer value: ")
        val string1 = readLine()!!



        var integerValue: Int = string1.toInt()
        println("You entered: $integerValue")
        // .toInt() function converts the string into Integer
        do {
            print("Enter a double value: ")
            val string2 = readLine()!!

            // .toDouble() function converts the string into Double
            var doubleValue: Int = string2.toInt()
            println("You entered: $doubleValue")

            if (string1 == string2) {
                println("bravo !")
            }else if (string1 != string2) {

                println("essaie encore ! ")

            when (doubleValue) {
                in 1..3 -> println("А-а-аh! It's burning!")
                in 4..7 -> println("Really hot!")
                in 8..15 -> println("Warm")
                in 16..31 -> println("A bit warm!")
                in 32..63 -> println("Pretty cold")
                in 64..99 -> println("It's freezing!")
            }


            }

        }while (string1 != string2)



    }


