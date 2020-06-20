fun main(){
    bambooTask()
    directTask()
}

fun bambooTask(){
    print("How much bamboo is needed: ")
    var input = readLine()!!.toInt()
    var arr = arrayListOf<Int>()
    for (i in 0 until input){
        print("How long of each bamboo: ")
        var input = readLine()!!.toInt()
        arr.add(input)
    }
    print("Input slices cycle: ")
    var cycle = readLine()!!.toInt()
    for (i in 0 until cycle) {
        for (i in 0 until arr.size) {
            if (arr[i]==0)continue
            arr[i] = arr[i]-1
        }
        println(arr)
    }
    println("Cycle ended")
}
fun directTask(){
    print("Your direction: \n")
    val directions = arrayOf("NORTH", "EAST", "SOUTH", "WEST")
    var i = 1
    for (direction: String in directions) {
        print(" $direction " + i++)
    }
    println()
    print("Pick your current location: \n")
    var currLoc = readLine()!!.toInt()
    if (currLoc in 1..4) {
        print("Where do you want to move: 1 [RIGHT] OR 2 [LEFT] \n")
        var leftOrRight = readLine()!!.toInt()
        if (leftOrRight==1){
            print("How many you want to move? \n")
            var destLoc = readLine()!!.toInt()
            var destLocs = (currLoc + destLoc)%4
            print("You are at the ")
            when (destLocs) {
                1 -> println(directions[0] + " point")
                2 -> println(directions[1] + " point")
                3 -> println(directions[2] + " point")
                0 -> println(directions[3] + " point")
            }
        } else if (leftOrRight==2){
            print("How many you want to move? \n")
            var destLoc = readLine()!!.toInt()
            var destLocs = ((currLoc + (destLoc*3))%4)
                print("You are at the ")
                when (destLocs) {
                    1 -> println(directions[0] + " point")
                    2 -> println(directions[1] + " point")
                    3 -> println(directions[2] + " point")
                    0 -> println(directions[3] + " point")
                }
        } else {
            println("Input must be 1 and 2")
        }
    } else {
        print("Input must be 1 to 4")
    }
}
fun directTasks_(){
//    print("Your direction: \n")
//    val directions = arrayOf("NORTH", "EAST", "SOUTH", "WEST")
//    var i = 1
//    for (direction: String in directions) {
//        print(" $direction " + i++)
//    }
//    println()
//    print("Pick your current location: \n")
//    var currLoc = readLine()!!.toInt()
//    if (currLoc in 1..4) {
//        print("How much you want to move? \n")
//        var destLoc = readLine()!!.toInt()
//        print("You are at the ")
//        when (destLoc%4) {
//            1 -> println("NORTH point")
//            2 -> println("EAST point")
//            3 -> println("SOUTH point")
//            0 -> println("WEST point")
//        }
//    } else {
//        print("Input must be 1 to 4")
//    }
//    print("note: clockwise movement")
}
fun misc(){

//    var number = 3
//    println("your lucky number is $number")
//    number = 7
//    print("your lucky number is $number")

//    var number: Any = 3
//    println("your lucky number is $number")
//    number = "tujuh"
//    print("your lucky number is $number")

//    var intNumber = 3
//    var floatNumber = 3.4f
//    var doubleNumber = 3.14
//    var longNumber = 1000000000
//
//    println("your intNumber is $intNumber, ${intNumber is Int}")
//    println("your floatNumber is $floatNumber")
//    println("your doubleNumber is $doubleNumber")
//    println("your longNumber is $longNumber, ${longNumber is Int}")

//    var a = 7
//    var b = 3
//    println(a/b)

//    var a = 7
//    var b = 2.0f
//    var c: Float= a/b
//    println(c)

//    var a = 7
//    var c: Float= a/"3".toFloat()
//    println(c)
//
//    if (a>=7){
//        print("Yes")
//    }

//    var waktuPengumpulan = 18
//    if (waktuPengumpulan >= 8 && waktuPengumpulan <= 17) {
//        print("Tugas berasil dikumpulkan")
//    } else {
//        print("Tugas ditolak")
//    }
//    var waktuPengumpulan = 6
//    if (waktuPengumpulan <= 17) {
//        print("Tugas berasil dikumpulkan")
//    } else {
//        print("Tugas ditolak")
//    }

//    var x = 11
//    when(x){ // jika sudah terpenuhi tdk d teruskan eksekusiny
//        0 -> print("It's Zero")
//        1 -> print("It's One")
//        11 -> print("It's Eleven")
//        11,22 -> print("Eleven or Twenty Two")
//        in 9..20 -> print("Between 9 to 20")
//        else -> print("Others")
//    }

//    var x = 11.0
//    when(x){ // jika sudah terpenuhi tdk d teruskan eksekusiny
//        0.0 -> print("It's Zero")
//        1.0 -> print("It's One")
//        11.0,22.0 -> print("Eleven or Twenty Two")
//        is Double -> {
//            println("It's Double")
//        }
//        in 9..20 -> print("Between 9 to 20") // in ny msh bsa d pakai hingga next update major
//        else -> print("Others")
//    }

//    for (i in 1..10) {
//        println(i)
//    }

//    for (j in 0 .. 6 step  2) { //
//        println(j)
//    }
//    for (j in 0 .. 10) { //
////        if (j == 7) continue
//        if (j == 7) break
//        println(j)
//    }

//    val names = arrayOf("Bima", "Adam", "Nugraha") // for range
//    for (name: String in names) {
//        println(name)
//    }

//    val data: Array<Any> = arrayOf("Bima", 23, "Adam")
//    println(data[0])
//    println(data[1])
//    println(data[2])
//
//    val dataa: IntArray = intArrayOf(2,3,2,3,2,3,2)
//    println(dataa.joinToString())
//    dataa[3] = 999
//    println(dataa.joinToString())

//    var directions = arrayOf("NORTH", "EAST", "SOUTH", "WEST")
//    for (direction: String in directions) {
//        println(direction)
//    }

//    var numbers = arrayOf(2,3,4,5,6,7,8,9) // saat ini number ny immutable / tdk bsa reassign
//    for (i in 0 until numbers.size) {
//        numbers[i]=numbers[i]-1 // dianggapny val
//    }
//    println(numbers.joinToString(prefix = "{", separator = "-", postfix = "}"))
}