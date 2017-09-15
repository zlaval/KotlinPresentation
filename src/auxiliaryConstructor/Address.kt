package auxiliaryConstructor

class Address(zip: Int, city: String, street: String, houseNumber: Int, floor: Int, door: Int) {
    constructor(zip: Int, city: String, street: String, houseNumber: Int) : this(zip, city, street, houseNumber, 0, 0)
}
