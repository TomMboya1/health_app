package com.health.app.modules.message.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.health.app.R
import com.health.app.databinding.RowMessageBinding
import com.health.app.modules.message.`data`.model.MessageRowModel
import kotlin.Int
import kotlin.collections.List

class MessageAdapter(
  var list: List<MessageRowModel>
) : RecyclerView.Adapter<MessageAdapter.RowMessageVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMessageVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_message,parent,false)
    return RowMessageVH(view)
  }

  override fun onBindViewHolder(holder: RowMessageVH, position: Int) {
    val messageRowModel = MessageRowModel()
    // TODO uncomment following line after integration with data source
    // val messageRowModel = list[position]
    holder.binding.messageRowModel = messageRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MessageRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: MessageRowModel
    ) {
    }
  }

  inner class RowMessageVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMessageBinding = RowMessageBinding.bind(itemView)
    init {
      binding.linearChat.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, MessageRowModel())
      }
    }
  }
}
