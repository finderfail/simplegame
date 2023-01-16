import replics
import error
import system
import verison
import systemtest
import systemtestinfunc2
import initializing
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
    val initl_l = initializing()
    val systemtest12 = systemtest()
    val system_use = systemtestinfunc2()
    println("Введите свое имя:")
    var you_name = readLine().toString()
    println("$you_name ты готов? Да - Напишите true Нет - Напишите false")
    var reshenie: Boolean? = readLine().toBoolean()
    if (reshenie == true) {
        Thread.sleep(1_000)
        println("$you_name размахивается")
        println()
        Thread.sleep(1_000)
        println("$you_name кидает")
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
            // FIXME: 26.06.2022  
            systemtestinfunc2()
            println("Debug:shda $shda")
            println("Debug:reshenie $reshenie")
            println("Debug:ad $ad")
            println("Debug:asd $asd")
            if (error.egor_win == "org.finderfail.main.kt.replicsKt") {println(initl_l.error_passed)} else {println(initl_l.error_failed)}
            Thread.sleep(500)
            if (replics_main.egor_win == "Егор: Так держать! Всегда знал что на") {println(initl_l.replics_main_passed)} else {println(initl_l.replics_main_failed)}
            Thread.sleep(623)
            if (system.dima_end == "Система: Игра окончена") {println(initl_l.system_passed)} else {println(initl_l.system_failed)}
            Thread.sleep(10)
            if (systemtest12.systemtest_2 == false) {println(initl_l.systemtest_passed)} else {println(initl_l.systemtest_failed)}
            Thread.sleep(750)
            // FIXME: 26.06.2022  
            if (system_use.test_passed == false) {println(initl_l.systemtest_function_passed)} else {println(initl_l.systemtest_function_failed)}

        }else {
            println("This Version hasn't debug mode!")
            // FIXME: 26.06.2022  
        }
        if (shda <= 2) {
            Thread.sleep(4_000)
            if (asd <= 20) {
                println("${replics_main.egor_small} $asd ${replics_main.metrov1}")
                Thread.sleep(2_000)
                println("Илья: $you_name ${replics_main.ilya_small}")
                println(system.dima_end)
                Thread.sleep(1_000)
                // FIXME: 16.06.2022
                // STOPSHIP: 16.06.2022  
                if (ad == 2) {
                  //  println(system.system_ad1)
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
                       // println(system.system_ad1)
                       // println(system.system_ad2)
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
                    println("Егор: $you_name ${replics_main.egor_wins_1}")
                    Thread.sleep(2_000)
                    println("${replics_main.ilya_wins} $asd ${replics_main.metrov3}")
                    Thread.sleep(4_000)
                    println(replics_main.egor_wins_2)
                    println(system.dima_end)
                    Thread.sleep(1_000)
                    if (ad == 2) {
                      //  println(system.system_ad1)
                       // println(system.system_ad2)
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
            println("Алексей: Ха,$you_name ${replics_main.lexa_lose}")
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

