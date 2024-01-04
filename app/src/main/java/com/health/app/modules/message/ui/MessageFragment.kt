package com.health.app.modules.message.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.health.app.R
import com.health.app.appcomponents.base.BaseFragment
import com.health.app.databinding.FragmentMessageBinding
import com.health.app.modules.chat.ui.ChatActivity
import com.health.app.modules.message.`data`.model.MessageRowModel
import com.health.app.modules.message.`data`.viewmodel.MessageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MessageFragment : BaseFragment<FragmentMessageBinding>(R.layout.fragment_message) {
  private val viewModel: MessageVM by viewModels<MessageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val messageAdapter = MessageAdapter(viewModel.messageList.value?:mutableListOf())
    binding.recyclerMessage.adapter = messageAdapter
    messageAdapter.setOnItemClickListener(
    object : MessageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MessageRowModel) {
        onClickRecyclerMessage(view, position, item)
      }
    }
    )
    viewModel.messageList.observe(requireActivity()) {
      messageAdapter.updateData(it)
    }
    binding.messageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerMessage(
    view: View,
    position: Int,
    item: MessageRowModel
  ): Unit {
    when(view.id) {
      R.id.linearChat ->  {
        val destIntent = ChatActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
    }
  }

  companion object {
    const val TAG: String = "MESSAGE_FRAGMENT"

  }
}
