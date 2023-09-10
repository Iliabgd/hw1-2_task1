fun main() {
    var amount = 12500
    val feeLimit = 35

    var systemFee: Int = amount * 75 / 10000
    if (systemFee < feeLimit) {
        systemFee = feeLimit
    }
    println(systemFee)

}