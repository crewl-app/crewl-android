/**
 * @author Kaan Fırat
 * @version 1.0, 29/01/23
 */

package com.alis.locale.converter

import androidx.room.TypeConverter
import com.alis.framework.extension.fromJson
import com.alis.framework.extension.toJson

class StringListConverter {
    @TypeConverter
    fun fromStringToList(string: String): List<String>? {
        return string.fromJson()
    }

    @TypeConverter
    fun fromListToStrings(listOfString: List<String>?): String {
        return listOfString.toJson()
    }
}