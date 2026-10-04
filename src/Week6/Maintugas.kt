package Week6

fun main() {

    val lamp = SmartLamp(
        id = "L001",
        name = "Ruang Tamu"
    )

    val speaker = SmartSpeaker(
        id = "S001",
        name = "Google Nest Dapur"
    )

    val cctv = SmartCCTV(
        id = "C001",
        name = "Ezviz Garasi"
    )

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    hub.activateSecurityMode()

    hub.turnOffAllSwitches()
}