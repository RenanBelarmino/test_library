def call(String name, String day0Fweek) {
    sh "echo Hello ${name}. Today is ${day0fWeek}."
}


//def call(Map config = [:]) {
//    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
//}
