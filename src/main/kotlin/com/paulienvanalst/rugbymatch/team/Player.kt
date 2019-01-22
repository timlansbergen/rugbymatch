package com.paulienvanalst.rugbymatch.team

import java.util.Objects

data class Player(val position: Position, val backNumber: Int) {

    val range = 1..15
    val isStarting
        get() = this.backNumber in 1..15
}
