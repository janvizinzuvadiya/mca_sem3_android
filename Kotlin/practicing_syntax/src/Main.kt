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

//    var sum = 0
//    var ch = ""
//    var i = 0
//    do {
//        println("How Many Values You want to enter?")
//        var ele = readln().toInt()
//
//        for(i in 0 until ele)
//        {
//            print("Enter Value ->" )
//            var num = readln().toInt()
//
//            sum+= num
//        }
//
//        if(i >= 1 )
//        {
////            print("breaking loop")
//            break
//        }
//
//        print("Do You want to enter More Values?")
//        ch = readln()
//        i+=1
//
//    }while(ch != "no")
//
//    print(sum)

// 8

//    print("Enter Any String ")
//    var str = readln()
//    var res = ""
//
//    for (i in 0 until str.length)
//    {
//        if(str[i].isLowerCase())
//        {
//            print(str[i].uppercase());
//        }
//        else
//        {
//            print(str[i].lowercase());
//        }
//    }

// 9
//
//    var min = 1
//    var max = 100
//
//    print("Enter Numeric values: ")
//    var num = readln().toInt()
//
//    if(num>=min && num<=max)
//    {
//        println("Number is in the range.")
//    }
//    else
//    {
//        println("Number is out of range.")
//    }


//10
//
//    print("Enter your String: ")
//    var str = readln()
//    var start = 0;
//    var end = 0;

//    for(i in str.indices)
//    {
//       if(str[i] == '<' && str[i+1] == 'u' && str[i+2] == '>')
//       {
//           start = i+3
//       }
//
//        if(str[i] == '<' && str[i+1] == '/' && str[i+2] == 'u' && str[i+3] == '>') {
//
//            end = i+4
//        }
//    }
//
//   for(i in str.indices)
//   {
//       if(i in start-4 until start)
//           continue
//       if(i in end-4 until end)
//           continue
//       if(i >= start && i<= end)
//           print(str[i].uppercase())
//       else
//           print(str[i].lowercase())
//   }

//    11

//    println("Enter String :")
//    var str = readln()
//    var rev = str.reversed()
//
//    if(str == rev)
//    {
//        print("String is Palindrome")
//    }
//    else
//    {
//        print("String is not Palindrome")
//    }

//   12

//    var arr = IntArray(5)
//    var max = 0
//    var smax = 0
//    var temp  = ""
//
//    for (i in 0..4)
//    {
//        print("Enter number: $i->")
//        temp = readln()
//        arr[i] = temp.toInt()
//
//        if(arr[i] > max)
//            max = arr[i]
//
//    }
//
//    for (i in 0..4)
//    {
//        if(arr[i] < max && arr[i] > smax)
//            smax = arr[i]
//    }
//
//    println("Maximum number: $max")
//    println("Second Largest number: $smax"


//    13
//
    var str1 = "amit"
    var str2 = "mita"

    if(str1 == str2) {
        println("String are Anagrams")
    }
    else if(str1.length !== str2.length) {
        println("String are not Anagrams")
    }
    else
    {
        var counter = 0;
        for(i in str1.indices)
        {
            for(j in str1.indices) {
                if (str1[i] == str1[j]) {
                    counter ++;
                }
            }
            for(k in str1.indices)
            {
                if(str1[i] == str2[k]) {
                    counter --;
                }
            }

            if(counter != 0) {
                println("$str1 and $str2 are not Anagrams")
                break;
            }
        }

        if(counter == 0)
            println("$str1 and $str2 are Anagrams")

    }
}