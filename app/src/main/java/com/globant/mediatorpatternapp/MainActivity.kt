package com.globant.mediatorpatternapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.globant.mediatorpatternapp.component.Landlord
import com.globant.mediatorpatternapp.component.Purchaser
import com.globant.mediatorpatternapp.component.Renter
import com.globant.mediatorpatternapp.component.Seller
import com.globant.mediatorpatternapp.mediator.RealtyState

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textview = findViewById<TextView>(R.id.textview)

        val houseMediator = RealtyState()
        val landlord = Landlord(houseMediator)
        val purchaser = Purchaser(houseMediator)
        val seller = Seller(houseMediator)
        val renter = Renter(houseMediator)

        houseMediator.apply {
            setLandlord(landlord)
            setPurchaser(purchaser)
            setSeller(seller)
            setRenter(renter)
        }

        textview.let {
            landlord.send("new prices for renting, ask here!", it)
            purchaser.send("Looking for a house to buy, cash!!", it)
            seller.send("Nice Castle by the sea, on Sale!", it)
            renter.send("looking for a flat, only 3 months...", it)
        }


    }
}