import kotlin.*
class systemtest {
    val version = "1.7.7"
    val systemtest_2 = true


    fun systemtest() {
        println("Debug: JVM 1.8")
        println("Debug: Kotlin")
        println("Debug: Java 1.8")
        println("Debug: Build on IntelliJ IDEA build tools")
        // FIXME: 26.06.2022  
        var systemtest_1 = 1
        var systemtest_3 = systemtest_1 + systemtest_1 * systemtest_1
        println(systemtest_1)
        println(systemtest_2)
        println(systemtest_3)
    }
}