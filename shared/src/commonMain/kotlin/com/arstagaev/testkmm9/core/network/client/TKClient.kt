package com.arstagaev.testkmm9.core.network.client

import com.arstagaev.testkmm9.core.network.NetworkConstants
import com.arstagaev.testkmm9.core.network.helper.handleErrors
import com.arstagaev.testkmm9.core.network.model.DepartmentObjects
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.http.ContentType
import io.ktor.http.contentType

class TKClient(
    private val httpClient: HttpClient
) {

    suspend fun getObjectsListByDept(
        id: Long,
    ): DepartmentObjects {
        return handleErrors {
            httpClient.get(NetworkConstants.Department.byIds("${id}")) {
                contentType(ContentType.Application.Json)
            }
//            httpClient.get(NetworkConstants.Pokemon.route) {
//                url {
//                    parameters.append("limit", PageSize.toString())
//                    parameters.append("offset", (page * PageSize).toString())
//                }
//                contentType(ContentType.Application.Json)
//            }
        }
    }

    companion object {
        //private const val PageSize = 20
    }

}