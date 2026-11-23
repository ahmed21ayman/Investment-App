package com.superpay.invest.data.model

data class Plan(
    val id: Int,
    val name: String,
    val targetAmount: Double,
    val months: Int,
    val paidMonths: Int = 0
) {
    val monthlyAmount: Double get() = targetAmount / months
}