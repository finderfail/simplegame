class systemtestinfunc2 {
    val system_test = "Send True to enable debug mode! or press enter to disable!"
    var test_passed = true
    fun systemtestinfunc2() {

        var test_failed = false
        val testing = (1..2).random()
        if (testing == 1) {
            println("I don't use Maven or Gradle")
            println(test_passed)
        }else{
            // FIXME: 26.06.2022  
            println(test_failed)
        }
    }
}