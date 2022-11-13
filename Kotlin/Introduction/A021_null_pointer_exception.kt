fun main() {
    /*
        Assertion operator)
        But consider the case in which you are 100% sure that the nullable variable does not contain the null.
        So in that case to avoid the check you can use assertion operator. Which will suppress the check.
        But in that case compiler is depending on you and if that nullable variable has the null in it. 
        So, in that case, your app will crash and compiler throw NullPointerException.
    */
    //val a: Int? = null
    val a: Int? = 1
    val b= a!!.toDouble()
    
    println("a = $a\nb = $b")

    /*
        But this operator is very dangerous and it can put you in trouble of hours 
        of debugging pain and lets your app crashes as well.
        So avoid it as much as possible.
        So in this way kotlin handles ‘The Billion Dollar Mistake:- The Nulls’
        That’s it for today guys. Thanks for reading. Stay tuned for more content.
        Till then Keep Coding, Keep Loving.
    */
    
}
