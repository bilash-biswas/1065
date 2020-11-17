import java.util.Scanner;
object Main {
  def main(args:Array[String]){ 
    val input = new Scanner(System.in)
    var sum:Int = 0
    for (i <- 1 to 5){
        var a = input.nextInt();
        if(a % 2 == 0){
            sum = sum + 1
        }
    }
    println(f"$sum valores pares")
    }
}

 
