package com.arstagaev.testkmm9.data.repository

interface TKRepository {
    suspend fun getListOfObjects(idDepartment: Long): Result<List<Int>>
    suspend fun updatePokemonFavoriteState(name: String, isFavorite: Boolean)

}
