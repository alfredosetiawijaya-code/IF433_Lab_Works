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

    val airConditioner = run {
        SmartDevice(
            "Daikin Inverter (Kabel 3x2.5)",
            "HVAC",
            false,
            800
        )
    }

    homeDevices.add(airConditioner)

    homeDevices.add(
        SmartDevice(
            "Picolo's Auto Feeder",
            "Pet Care",
            true,
            10
        )
    )

    println("\n=== DEVICE SEARCH ===")

    val searchResult = homeDevices.find {
        it.category == "Camera"
    }

    searchResult?.let {
        println(it.diagnose())
    }

    println("\n=== SMART HOME SUMMARY ===")

    with(homeDevices) {
        println("Jumlah perangkat: ${this.size}")
    }

    println("\n=== POWER CALCULATION ===")

    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }

    println("Total daya: $totalPower Watt")

    println("\n=== DEVICE DIAGNOSTICS ===")

    homeDevices.forEach {
        println(it.diagnose())
    }

    println("\n====================================")
    println("       SMART HOME SYSTEM DONE")
    println("====================================")



}
