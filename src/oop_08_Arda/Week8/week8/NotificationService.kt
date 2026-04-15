package oop_08_Arda.Week8.week8

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        if (user.email != null) {
            // SUCCESS via Smart Cast: compiler tahu 'user.email' pasti tidak null di blok ini
            sendEmail(emailAddress = user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}