package com.globant.mediatorpatternapp.component

import android.widget.TextView
import com.globant.mediatorpatternapp.mediator.HouseMediator


//abstract colleague role - concreteComponent
abstract class Person(var houseMediator: HouseMediator) {
    //Character
    abstract fun send(message: String?, textview: TextView) //release news
    abstract fun getNotice(message: String?, textview: TextView) //receive the info
}