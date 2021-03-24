package com.tinder.scarlet.stomp.okhttp.generator

import com.tinder.scarlet.stomp.okhttp.core.IdGenerator
import java.util.*

class UuidGenerator : IdGenerator {

    override fun generateId() = UUID.randomUUID().toString()
}