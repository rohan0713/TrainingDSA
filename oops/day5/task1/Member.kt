package oops.day5.task1

import java.time.LocalDate

class Member(
    val name: String,
    val date: LocalDate,
    val notification: MutableList<Notification>? = mutableListOf()
)