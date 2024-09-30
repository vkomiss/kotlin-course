package com.kva.kotlincourse.lesson3

// LESSON 3
val name: String = "Aladin"
var age: Int = 22
const val PI: Double = 3.14
lateinit var UserInfo: String
val lazy_value: String by lazy {"Hallo, this is s lazy value"}
val speed: Double? = null
var count: Int = 0
    get() = field
    set(value) {
        if (value >=0) field = value
    }

val nom_shassis: String = "ANC45DFE"
var colour: String = "Blue"
var distuns: Double = 0.0
lateinit var owner: String
const val NUM_WHEELS: Int = 4
val report: String by lazy {"Report about auto"}
var fuel: Double = 0.0
    get() = field
    set(value) {if (value >0) field += value }

// HOME WORK
