/*
 * © 2018 Match Group, LLC.
 */

package com.tinder.streamadapter.coroutines

import com.tinder.scarlet.Stream
import com.tinder.scarlet.StreamAdapter
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.reactive.openSubscription

class ReceiveChannelStreamAdapter<T> : StreamAdapter<T, ReceiveChannel<T>> {

    override fun adapt(stream: Stream<T>) = stream.openSubscription()
}