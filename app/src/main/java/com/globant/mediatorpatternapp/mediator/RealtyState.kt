package com.globant.mediatorpatternapp.mediator

import android.widget.TextView
import com.globant.mediatorpatternapp.component.*


//Mediator
class RealtyState : HouseMediator {
    //Chain family, realize HouseMediator
    var mPurchaser: Purchaser? = null
    var mLandlord: Landlord? = null
    var mSeller: Seller? = null
    var mRenter: Renter? = null


    fun setPurchaser(purchaser: Purchaser?) { //Set up buyers
        mPurchaser = purchaser
    }

    fun setLandlord(landlord: Landlord?) { //Set up landlord
        mLandlord = landlord
    }

    fun setSeller(seller: Seller) {
        mSeller = seller
    }

    fun setRenter(renter: Renter) {
        mRenter = renter
    }

    override fun notice(
        person: Person?,
        msg: String?,
        textview: TextView
    ) { //Send notification
        textview.text =
            textview.text.toString() + "\n\n" +
                "Realty State informs to all: "

        when(person) {
            mPurchaser -> {
                mLandlord?.getNotice(msg, textview)
                mSeller?.getNotice(msg, textview)
                mRenter?.getNotice(msg, textview)
            }

            mLandlord -> {
                mPurchaser?.getNotice(msg, textview)
                mSeller?.getNotice(msg, textview)
                mRenter?.getNotice(msg, textview)
            }

            mSeller -> {
                mLandlord?.getNotice(msg, textview)
                mPurchaser?.getNotice(msg, textview)
                mRenter?.getNotice(msg, textview)
            }

            mRenter -> {
                mLandlord?.getNotice(msg, textview)
                mSeller?.getNotice(msg, textview)
                mPurchaser?.getNotice(msg, textview)
            }
        }
    }
}