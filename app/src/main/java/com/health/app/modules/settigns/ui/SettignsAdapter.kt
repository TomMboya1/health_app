package com.health.app.modules.settigns.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.health.app.R
import com.health.app.databinding.RowSettignsBinding
import com.health.app.modules.settigns.`data`.model.SettignsRowModel
import kotlin.Int
import kotlin.collections.List

class SettignsAdapter(
  var list: List<SettignsRowModel>
) : RecyclerView.Adapter<SettignsAdapter.RowSettignsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSettignsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_settigns,parent,false)
    return RowSettignsVH(view)
  }

  override fun onBindViewHolder(holder: RowSettignsVH, position: Int) {
    val settignsRowModel = SettignsRowModel()
    // TODO uncomment following line after integration with data source
    // val settignsRowModel = list[position]
    holder.binding.settignsRowModel = settignsRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SettignsRowModel>) {
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
      item: SettignsRowModel
    ) {
    }
  }

  inner class RowSettignsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSettignsBinding = RowSettignsBinding.bind(itemView)
  }
}
