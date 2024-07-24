package com.carlosgub.myfinances.presentation.viewmodel.editexpense

import com.carlosgub.myfinances.core.utils.toMoneyFormat
import com.carlosgub.myfinances.domain.model.CategoryEnum

data class EditExpenseScreenState(
    val category: CategoryEnum = CategoryEnum.FOOD,
    val amountField: String = 0L.toMoneyFormat(),
    val amount: Long = 0L,
    val showDateError: Boolean = false,
    val showNoteError: Boolean = false,
    val showError: Boolean = false,
    val note: String = "",
    val date: String = "",
    val dateInMillis: Long = 0L,
    val initialDataLoaded: Boolean = false,
    val showLoading: Boolean = false,
    val id: Long = 0L,
    val monthKey: String = "",
)
