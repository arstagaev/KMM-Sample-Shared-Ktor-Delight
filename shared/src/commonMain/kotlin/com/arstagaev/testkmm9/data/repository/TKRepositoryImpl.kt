package com.arstagaev.testkmm9.data.repository

import com.arstagaev.testkmm9.core.network.client.TKClient
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class TKRepositoryImpl: TKRepository, KoinComponent {

    private val tkClient by inject<TKClient>()

    override suspend fun getListOfObjects(idDepartment: Long): Result<List<Int>> {
        return try {
            //val cachedPokemonList = pokemonDao.selectAllByPage(page)
            val response = tkClient.getObjectsListByDept(id = idDepartment)
            println(">>>> ${response.toString()}")

            Result.success(response.objectIDs)
//            if (cachedPokemonList.isEmpty()) {
//                val response = pokemonClient.getPokemonList(page = page)
//                response.results.forEach { pokemon ->
//                    pokemonDao.insert(pokemon.toPokemonEntity(page))
//                }
//
//                Result.success(pokemonDao.selectAllByPage(page).map { it.toPokemon() })
//            } else {
//                Result.success(cachedPokemonList.map { it.toPokemon() })
//            }
        } catch (e: Exception) {
            e.printStackTrace()
            Result.failure(e)
        }
    }

    override suspend fun updatePokemonFavoriteState(name: String, isFavorite: Boolean) {
//        pokemonInfoDao.updateIsFavorite(
//            name = name,
//            isFavorite = isFavorite,
//        )
    }

}