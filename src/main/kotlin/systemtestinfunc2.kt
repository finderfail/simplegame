class systemtestinfunc2 {
    val system_test = "Send True to enable debug mode! or False to disable!"
    var test_passed = true
    fun systemtestinfunc2() {

        var test_failed = false
        val testing = (1..2).random()
        if (testing == 1) {
            println("I don't use Maven or Gradle")
            println(test_passed)
        }else{
            println(test_failed)
        }
    }
}