open class Car(
    val make: String,
    val model: String,
    val year: Int,
    var mileage: Double
) {
    open fun details() {
        println("Make: $make, Model: $model, Year: $year, Mileage: $mileage km")
    }

    fun drive(miles: Double) {
        mileage += miles
    }
}

class ElectricCar(
    make: String,
    model: String,
    year: Int,
    mileage: Double,
    private val batteryCapacity: Double
) : Car(make, model, year, mileage) {
    override fun details() {
        println("Make: $make, Model: $model, Year: $year, Mileage: $mileage km, Battery Capacity: $batteryCapacity kWh")
    }
}

fun main() {
    val myCar = Car("Toyota", "Corolla", 2020, 15000.0)
    myCar.details()
    myCar.drive(500.0)
    myCar.details()

    val myElectricCar = ElectricCar("Tesla", "Model 3", 2022, 2000.0, 75.0)
    myElectricCar.details()
    myElectricCar.drive(300.0)
    myElectricCar.details()
}
