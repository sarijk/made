package com.sarijk.core.domain.usecase

import com.sarijk.core.data.Resource
import com.sarijk.core.domain.model.Drink
import kotlinx.coroutines.flow.Flow

interface DrinkUseCase {
    fun getAllDrink(): Flow<Resource<List<Drink>>>
    fun getFavoriteDrink(): Flow<List<Drink>>
    fun setFavoriteDrink(drink: Drink, state: Boolean)
    fun searchDrink(value: String): Flow<List<Drink>>
}