package com.arstagaev.testkmm9.core.network.helper

import com.arstagaev.testkmm9.core.network.errors.TKException
import com.arstagaev.testkmm9.core.network.errors.TKError
import com.arstagaev.testkmm9.tkDispatchers
import io.ktor.client.call.body
import io.ktor.client.statement.HttpResponse
import io.ktor.utils.io.errors.IOException
import kotlinx.coroutines.withContext

suspend inline fun <reified T> handleErrors(
    crossinline response: suspend () -> HttpResponse
): T = withContext(tkDispatchers.io) {

    val result = try {
        response()
    } catch(e: IOException) {
        throw TKException(TKError.ServiceUnavailable)
    }

    when(result.status.value) {
        in 200..299 -> Unit
        in 400..499 -> throw TKException(TKError.ClientError)
        500 -> throw TKException(TKError.ServerError)
        else -> throw TKException(TKError.UnknownError)
    }

    return@withContext try {
        result.body()
    } catch(e: Exception) {
        throw TKException(TKError.ServerError)
    }

}