package com.health.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.health.app.R
import com.health.app.databinding.RowEighteenBinding
import com.health.app.modules.dashboard.`data`.model.EighteenRowModel
import kotlin.Int
import kotlin.collections.List

class EighteenAdapter(
  var list: List<EighteenRowModel>
) : RecyclerView.Adapter<EighteenAdapter.RowEighteenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowEighteenVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_eighteen,parent,false)
    return RowEighteenVH(view)
  }

  override fun onBindViewHolder(holder: RowEighteenVH, position: Int) {
    val eighteenRowModel = EighteenRowModel()
    // TODO uncomment following line after integration with data source
    // val eighteenRowModel = list[position]
    holder.binding.eighteenRowModel = eighteenRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<EighteenRowModel>) {
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
      item: EighteenRowModel
    ) {
    }
  }

  inner class RowEighteenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowEighteenBinding = RowEighteenBinding.bind(itemView)
    init {
      binding.btnUser.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, EighteenRowModel())
      }
    }
  }
}
