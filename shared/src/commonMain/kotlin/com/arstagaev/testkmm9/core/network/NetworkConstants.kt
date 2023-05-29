package com.arstagaev.testkmm9.core.network

object NetworkConstants {
    const val baseUrl1 = "https://collectionapi.metmuseum.org/"

    //https://collectionapi.metmuseum.org/public/collection/v1/objects?departmentIds=3
    object Department {
        const val route = baseUrl1 + "public/collection/v1/objects?departmentIds="
        val byIds: (String) -> String = { name -> "$route$name"}
    }

    //https://collectionapi.metmuseum.org/public/collection/v1/objects/327161
    object Object {
        const val route = baseUrl1 + "public/collection/v1/objects/"
        val byIds: (String) -> String = { name -> "$route$name"}
    }
}