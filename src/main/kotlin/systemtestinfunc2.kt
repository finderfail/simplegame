class systemtestinfunc2 {
    val system_test = "Send True to enable debug mode! or False to disable!"
    fun systemtestinfunc2() {
        var test_passed = true
        var test_failed = false
        val testing = (1..2).random()
        if (testing == 1) {
            println("I don't use Maven or Gradle")
            print(test_passed)
        }else{
            print(test_failed)
        }
    }
}