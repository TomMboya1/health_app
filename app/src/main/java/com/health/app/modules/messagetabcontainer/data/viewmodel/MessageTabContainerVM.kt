package com.health.app.modules.messagetabcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.health.app.modules.messagetabcontainer.`data`.model.MessageTabContainerModel
import org.koin.core.KoinComponent

class MessageTabContainerVM : ViewModel(), KoinComponent {
  val messageTabContainerModel: MutableLiveData<MessageTabContainerModel> =
      MutableLiveData(MessageTabContainerModel())

  var navArguments: Bundle? = null
}
