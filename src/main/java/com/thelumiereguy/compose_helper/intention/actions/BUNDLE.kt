package com.thelumiereguy.compose_helper.intention.actions

import com.intellij.DynamicBundle
import org.jetbrains.annotations.PropertyKey

private const val BUNDLE = "messages.ComposeBundle"

object ComposeBundle : DynamicBundle(BUNDLE) {
    @JvmStatic
    fun message(@PropertyKey(resourceBundle = BUNDLE) key: String, vararg params: Any) =
        getMessage(key, *params)

    @Suppress("unused")
    @JvmStatic
    fun messagePointer(@PropertyKey(resourceBundle = BUNDLE) key: String, vararg params: Any) =
        getLazyMessage(key, *params)
}