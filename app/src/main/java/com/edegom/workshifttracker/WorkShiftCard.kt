package com.edegom.workshifttracker

import java.util.UUID

data class WorkShiftCard(
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val value: String,
    val description: String,
    val timestamp: Long = System.currentTimeMillis()
)