fun main(args: Array<String>) {
    val sumBuy = 10_000
    val regularly = true

    val discount = (sumBuy * 5)/100
    val calculation = if (sumBuy <= 1000) 0 else if (sumBuy > 1_001 && sumBuy < 10_000)  100 else discount
    val result = if ( regularly == true) ((sumBuy-calculation)*1)/100 else calculation
    val itog = sumBuy - calculation - result

    println("Сумма вашей покупки $sumBuy руб. скидка составила $calculation руб")
    println("Скидка постоянного покупателя $result")
    println("Общая сумма покупки $itog руб.")

}