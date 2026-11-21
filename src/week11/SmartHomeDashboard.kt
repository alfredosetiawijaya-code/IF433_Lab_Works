package week11

fun main() {

    println("====================================")
    println("       SMART HOME DASHBOARD")
    println("====================================")

    val homeDevices = mutableListOf<SmartDevice>()


    val lighting = SmartDevice(
        "Philips WiZ Living Room",
        "Lighting"
    ).apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    println("Lampu berhasil dikonfigurasi")

    val camera = SmartDevice(
        "Ezviz Outdoor",
        "Camera"
    ).apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }



}
