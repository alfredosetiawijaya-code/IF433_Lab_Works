package Week6

class SmartHomeHub {

    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {

        println("\n=== MEMATIKAN SEMUA PERANGKAT ===")

        for (device in devices) {

            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {

        println("\n=== SECURITY MODE AKTIF ===")

        for (device in devices) {

            if (device is Recordable) {
                device.startRecord()
            }

            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}