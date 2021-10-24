package com.chillandcode.lists_kotlin.data

import android.util.Log
import com.chillandcode.lists_kotlin.R
import com.chillandcode.lists_kotlin.model.Affirmation

val TAG = "Datasource"

class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        Log.i(TAG, "loadAffirmations: ")
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)
        )
    }
}
