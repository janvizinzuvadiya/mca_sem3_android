import kotlin.math.pow

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

//    1
//    println("Enter Personal Details:")
//    print("enter name:")
//    var name = readLine()
//    print("enter age:")
//    var age = readLine()?.toInt()
//    println("Information--------------------")
//
//    println("Name :" + name)
//    println("Age :" + age)
//
//    println("---------------------------------")


//    2
//    println("Enter First Value->")
//    var num1 = readln().toInt()
//    println("Enter First Value->")
//    var num2 = readln().toInt()
//
//    var sum = num1 + num2
//    var sub = num1 - num2
//    var mul = num1 * num2
//    var div = num1 / num2
//
//    println("Arithmetic Oprations")
//    println("Addition $sum")
//    println("Subtraction $sub")
//    println("Multiplication $mul")
//    println("division $div")

//    3

//    print("Enter Principle Amount:")
//    var p = readln().toInt()
//
//    print("Enter Interest Rate:")
//    var r = readln().toInt()
//
//    print("Enter Years:")
//    var n = readln().toInt()
//
//    var ans = (p * r * n )/ 100
//    print("Simple Interest = $ans")

//  4

//    print("Enter Principle Amount:")
//    var p = readln().toInt()
//
//    print("Enter Interest Rate:")
//    var r = readln().toInt()
//
//    print("Enter Years:")
//    var n = readln().toInt()
//
//    print("Enter Compound Years:")
//    var cn = readln().toInt()
//
////    P * (1 + r/n)^(n*t)
//    var ans = p * ( ( 1.0 + (r * n)).pow(n * cn) )
//    print("Compound Interest : $ans")

//5


    //    using function

//        print("Enter Sentance ->")
//        var sen = readln()
//    //    var rev = sen.split(" ").reversed().joinToString(" ")
//
//    //    using loop
//
//        var rev = ""
//        var words = sen.split(" ")
//        for(i in words.size - 1 downTo 0)
//        {
//            rev +=  "${words[i] } "
//        }
//
//        print("Reversed Sentance = $rev")
//


//6
//    print("Enter Sentance ->")
//    var sen = readln()
//    var rev = ""
//
//    var words = sen.split(" ")
//
//    for (i in 0 until words.size)
//    {
//        if(words[i] == "is") {
//
//            rev += "** "
//
//        }
//        else
//        {
//            rev += (words[i] +" ")
//        }
//    }
//
//    print(rev)


//    7

    var sum = 0
    var ch = ""
    var i = 0
    do {
        println("How Many Values You want to enter?")
        var ele = readln().toInt()

        for(i in 0 until ele)
        {
            print("Enter Value ->" )
            var num = readln().toInt()

            sum+= num
        }

        if(i >= 1 )
        {
//            print("breaking loop")
            break
        }

        print("Do You want to enter More Values?")
        ch = readln()
        i+=1

    }while(ch != "no")

    print(sum)






}