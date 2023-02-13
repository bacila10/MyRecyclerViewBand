package com.bandymas.myrecyclerviewband

import android.content.Context
import androidx.core.content.ContextCompat
import com.bandymas.myrecyclerviewband.Model.DummyData

object AddItems {
    fun getDummyData(context: Context): List<DummyData>{
            val dummydata = arrayListOf<DummyData>()

        val dummyData1 = DummyData("Ilgos naujienos Title 1",
            ContextCompat.getDrawable(context,R.drawable.daffodil))
        val dummyData2 = DummyData("Ilgos naujienos Title 2",
            ContextCompat.getDrawable(context,R.drawable.fonas))
        val dummyData3 = DummyData("Ilgos naujienos Title 3",
            ContextCompat.getDrawable(context,R.drawable.daffodil))
        val dummyData4 = DummyData("Ilgos naujienos Title 4",
            ContextCompat.getDrawable(context,R.drawable.fonas))
        val dummyData5 = DummyData("Ilgos naujienos Title 5",
            ContextCompat.getDrawable(context,R.drawable.daffodil))
        val dummyData6 = DummyData("Ilgos naujienos Title 6",
            ContextCompat.getDrawable(context,R.drawable.fonas))
        val dummyData7 = DummyData("Ilgos naujienos Title 7",
            ContextCompat.getDrawable(context,R.drawable.daffodil))

        dummydata.add(dummyData1)
        dummydata.add(dummyData2)
        dummydata.add(dummyData3)
        dummydata.add(dummyData4)
        dummydata.add(dummyData5)
        dummydata.add(dummyData6)
        dummydata.add(dummyData7)


        return dummydata
    }
    }
