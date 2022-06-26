import replics
import error
import system
import verison
import systemtest
import systemtestinfunc2

fun main() {
    println("Very not interested game!")
    val ver = verison()
    println("by finderfailoff")
    println("Version: ${ver.version}")
    println("Кидатель шин зе гаме")
    val asd = (1..100).random()
    val ad = (1..2).random()
    val replics_main = replics()
    val error = error()
    val system = system()
    val systemtest12 = systemtest()
    val system_use = systemtestinfunc2()
    println("Вы готовы? Да - Напишите true Нет - Напишите false")
    var reshenie: Boolean? = readLine().toBoolean()
    if (reshenie == true) {
        Thread.sleep(1_000)
        println("Вы размахиваетесь")
        println()
        Thread.sleep(1_000)
        println("Вы кидаете")
        println()
        Thread.sleep(1_000)
        println("Шина покатилась")
        println()
        val shda = (1..3).random()
        // println("Debug:$shda")
        // println("Debug:$reshenie")
        // println("Debug:$ad")
        // println("Debug:$asd")
        println(system_use.system_test)
        var dev_test: Boolean? = readLine().toBoolean()
        if (dev_test == true) {
            println("DEVELOPER MODE ENABLED!")
            systemtest()
            systemtestinfunc2()
            println("Debug:shda $shda")
            println("Debug:reshenie $reshenie")
            println("Debug:ad $ad")
            println("Debug:asd $asd")
            if (error.egor_win == "org.finderfail.main.kt.replicsKt") {println("initializing the Error module succeseful!")} else {println("initializing the Error module failed!!!")}
            if (replics_main.egor_win == "Егор: Так держать! Всегда знал что на") {println("initializing the Replics_main module succeseful!")} else {println("initializing the Replics_main module failed!!!")}
            if (system.dima_end == "Система: Игра окончена") {println("initializing the system module succeseful!")} else {println("initializing the system module failed!!!")}
            if (systemtest12.systemtest_2 == false) {println("initializing the systemtest module succeseful!")} else {println("initializing the systemtest module failed!!!")}
            if (system_use.test_passed == false) {println("initializing the systemtest_function module succeseful!")} else {println("initializing the systemtest_function module failed!!!")}

        }else {
            println("This Version hasn't debug mode!")
        }
        if (shda <= 2) {
            Thread.sleep(4_000)
            if (asd <= 20) {
                println("${replics_main.egor_small} $asd ${replics_main.metrov1}")
                Thread.sleep(2_000)
                println(replics_main.ilya_small)
                println(system.dima_end)
                Thread.sleep(1_000)
                // FIXME: 16.06.2022
                // STOPSHIP: 16.06.2022  
                if (ad == 2) {
                    println(system.system_ad1)
                    println(system.system_ad2)
                    Thread.sleep(10_000)
                } else {
                    println(system.system_ad3)
                    Thread.sleep(10_000)
                    // FIXME: 16.06.2022
                    // STOPSHIP: 16.06.2022
                }
            } else {
                if (asd <= 50) {
                    println("${replics_main.lexa_win} $asd ${replics_main.metrov1}")
                    Thread.sleep(2_000)
                    println(replics_main.nikita_win)
                    Thread.sleep(10_000)
                    println("${replics_main.egor_win} $asd ${replics_main.metrov}")
                    println(system.dima_end)
                    Thread.sleep(1_000)
                    if (ad == 2) {
                        println(system.system_ad1)
                        println(system.system_ad2)
                        Thread.sleep(10_000)
                    } else {
                        println(system.system_ad3)
                        Thread.sleep(10_000)

                    }

                } else {
                    println("${replics_main.lexa_wins} $asd ${replics_main.metrov1}")
                    Thread.sleep(2_000)
                    println("${replics_main.nikita_wins} $asd ${replics_main.metrov2}")
                    Thread.sleep(2_000)
                    println(replics_main.egor_wins_1)
                    Thread.sleep(2_000)
                    println("${replics_main.ilya_wins} $asd ${replics_main.metrov3}")
                    Thread.sleep(4_000)
                    println(replics_main.egor_wins_2)
                    println(system.dima_end)
                    Thread.sleep(1_000)
                    if (ad == 2) {
                        println(system.system_ad1)
                        println(system.system_ad2)
                        Thread.sleep(10_000)
                    } else {
                        println(system.system_ad3)
                        Thread.sleep(10_000)

                    }
                }
            }
        } else {
            Thread.sleep(4_000)
            println(system.system_player_fall)
            Thread.sleep(2_000)
            println(replics_main.lexa_lose)
            Thread.sleep(2_000)
            println(replics_main.ilya_lose)
            println(system.dima_end)
            Thread.sleep(1_000)
            // FIXME: 20.04.2022
            // STOPSHIP: 23.04.2022
            if (ad == 2) {
                println(system.system_ad1)
                println(system.system_ad2)
                Thread.sleep(10_000)
            } else {
                println(system.system_ad3)
                Thread.sleep(10_000)
            }


        }
    } else {
        println(system.system_player_deny)
        println(replics_main.egor_false)
        Thread.sleep(1_000)
        println(replics_main.ilya_false)
        Thread.sleep(2_000)
        println(replics_main.lexa_false)
        Thread.sleep(1_000)
        println(replics_main.dima_false)
        println(system.dima_end)
        Thread.sleep(2_000)
        if (ad == 2) {
            // FIXME: 15.06.2022
            println(system.system_ad1)
            println(system.system_ad2)
            Thread.sleep(2_000)
        } else {
            println(system.system_ad3)
            Thread.sleep(2_000)
            // STOPSHIP: 16.06.2022  
        }
    }

}

