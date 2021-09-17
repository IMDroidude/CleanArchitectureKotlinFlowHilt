package com.example.domain.annotation

import androidx.annotation.IntDef
import java.lang.annotation.RetentionPolicy


class Constant {

    companion object {
        @IntDef(SLOW, NORMAL, FAST)
        @Retention(AnnotationRetention.SOURCE)
        annotation class Speed

        const val SLOW = 0
        const val NORMAL = 1
        const val FAST = 2
    }

    @Speed
    private var speed: Int= NORMAL
    /*@IntDef(value = [SortType.PRICE, SortType.TIME, SortType.DURATION])
    @Retention(RetentionPolicy.SOURCE)
    annotation class SortType {
        companion object {
            var PRICE = 0
            var TIME = 1
            var DURATION = 2
        }
    }*/
}