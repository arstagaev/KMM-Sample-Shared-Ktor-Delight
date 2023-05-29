package com.arstagaev.testkmm9

import kotlinx.coroutines.CoroutineDispatcher

interface iTkDispatchers {
    val main: CoroutineDispatcher
    val io: CoroutineDispatcher
    val unconfined: CoroutineDispatcher
}

expect val tkDispatchers: iTkDispatchers