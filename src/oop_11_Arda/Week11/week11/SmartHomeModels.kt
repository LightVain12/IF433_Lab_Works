package oop_11_Arda.Week11.week11

data class SmartDevice(
    var name: String,
    var category: String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)

fun SmartDevice.diagnose(): String {
    val statusStr = if (isOnline) "Online" else "Offline"
    return "[DIAGNOSTIK] $name | Kategori: $category | Status: $statusStr | Daya: ${powerLoad}W"
}