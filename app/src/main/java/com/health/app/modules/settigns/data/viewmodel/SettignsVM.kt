package com.health.app.modules.settigns.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.health.app.modules.settigns.`data`.model.SettignsModel
import com.health.app.modules.settigns.`data`.model.SettignsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SettignsVM : ViewModel(), KoinComponent {
  val settignsModel: MutableLiveData<SettignsModel> = MutableLiveData(SettignsModel())

  var navArguments: Bundle? = null

  val settignsList: MutableLiveData<MutableList<SettignsRowModel>> =
      MutableLiveData(mutableListOf())
}
