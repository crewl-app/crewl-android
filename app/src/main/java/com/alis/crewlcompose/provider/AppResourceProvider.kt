/**
 * @author Kaan Fırat
 * @version 1.0, 29/01/23
 */

package com.alis.crewlcompose.provider

import android.content.Context
import com.alis.provider.ResourceProvider

class AppResourceProvider(private val context: Context) : ResourceProvider {
    override fun getString(id: Int): String {
        return context.getString(id)
    }
}