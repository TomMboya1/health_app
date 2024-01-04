package com.health.app.modules.settigns.`data`.model

import com.health.app.R
import com.health.app.appcomponents.di.MyApp
import kotlin.String

data class SettignsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeartRate: String? = MyApp.getInstance().resources.getString(R.string.lbl_heart_rate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeartRateCount: String? = MyApp.getInstance().resources.getString(R.string.lbl_215bpm)

)
