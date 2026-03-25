package oop_07_Arda.Week7.week7

// CHECKPOINT 8
enum class AppState {
    STARTING, RUNNING, STOPPED
}

// CHECKPOINT 9
sealed class ApiResponse {
    data class Success(val data: String) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading : ApiResponse()
}