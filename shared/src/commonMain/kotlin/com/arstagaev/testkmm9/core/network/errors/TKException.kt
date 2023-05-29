package com.arstagaev.testkmm9.core.network.errors

enum class TKError {
    ServiceUnavailable,
    ClientError,
    ServerError,
    UnknownError
}

class TKException(error: TKError): Exception(
    "Something goes wrong: $error"
)