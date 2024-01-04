package com.health.app.modules.message.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.health.app.modules.message.`data`.model.MessageModel
import com.health.app.modules.message.`data`.model.MessageRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MessageVM : ViewModel(), KoinComponent {
  val messageModel: MutableLiveData<MessageModel> = MutableLiveData(MessageModel())

  var navArguments: Bundle? = null

  val messageList: MutableLiveData<MutableList<MessageRowModel>> = MutableLiveData(mutableListOf())
}
