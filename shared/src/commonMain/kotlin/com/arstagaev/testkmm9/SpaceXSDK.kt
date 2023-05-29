package com.arstagaev.testkmm9

//import com.arstagaev.testkmm9.data.Database
//import com.arstagaev.testkmm9.entity.RocketLaunch
//import com.arstagaev.testkmm9.network.SpaceXApi
//
//class SpaceXSDK (databaseDriverFactory: DatabaseDriverFactory) {
//    private val database = Database(databaseDriverFactory)
//    private val api = SpaceXApi()
//
//    @Throws(Exception::class) suspend fun getLaunches(forceReload: Boolean): List<RocketLaunch> {
//        val cachedLaunches = database.getAllLaunches()
//        return if (cachedLaunches.isNotEmpty() && !forceReload) {
//            cachedLaunches
//        } else {
//            api.getAllLaunches().also {
//                database.clearDatabase()
//                database.createLaunches(it)
//            }
//        }
//    }
//}
