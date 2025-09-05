package com.edegom.workshifttracker

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class WorkShiftViewModel : ViewModel() {
    private val _cards = mutableStateListOf<WorkShiftCard>()
    val cards: List<WorkShiftCard> = _cards

    fun addCard(card: WorkShiftCard) {
        _cards.add(card)
    }

    fun updateCard(updatedCard: WorkShiftCard) {
        val index = _cards.indexOfFirst { it.id == updatedCard.id }
        if (index != -1) {
            _cards[index] = updatedCard
        }
    }

    fun deleteCard(cardId: String) {
        _cards.removeAll { it.id == cardId }
    }
}