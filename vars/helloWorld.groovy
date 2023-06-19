def call() {
    sh "echo Hello ${name}. Today is ${day0fWeek}."
}


//def call(Map config = [:]) {
//    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
//}
