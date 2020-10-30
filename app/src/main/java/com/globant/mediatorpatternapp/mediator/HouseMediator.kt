package com.globant.mediatorpatternapp.mediator

import android.widget.TextView
import com.globant.mediatorpatternapp.component.Person

//Concrete Mediator

interface HouseMediator {
    //House intermediary
    fun notice(
        person: Person?,
        msg: String?,
        textView: TextView
    ) //Notification method
}