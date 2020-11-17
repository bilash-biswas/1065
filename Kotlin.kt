import java.util.Scanner

fun main(args: Array<String>){
    val read = Scanner(System.`in`);
    var a:Int;
    var sum:Int;
    sum = 0
    for (i in 1..5){
        a = read.nextInt();
        if(a % 2 == 0){
            sum = sum + 1
        }
    }
    println("$sum valores pares")
}
