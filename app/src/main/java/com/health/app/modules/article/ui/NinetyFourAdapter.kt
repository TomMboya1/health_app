package com.health.app.modules.article.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.health.app.R
import com.health.app.databinding.RowNinetyfourBinding
import com.health.app.modules.article.`data`.model.NinetyfourRowModel
import kotlin.Int
import kotlin.collections.List

class NinetyFourAdapter(
  var list: List<NinetyfourRowModel>
) : RecyclerView.Adapter<NinetyFourAdapter.RowNinetyfourVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNinetyfourVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_ninetyfour,parent,false)
    return RowNinetyfourVH(view)
  }

  override fun onBindViewHolder(holder: RowNinetyfourVH, position: Int) {
    val ninetyfourRowModel = NinetyfourRowModel()
    // TODO uncomment following line after integration with data source
    // val ninetyfourRowModel = list[position]
    holder.binding.ninetyfourRowModel = ninetyfourRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<NinetyfourRowModel>) {
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
      item: NinetyfourRowModel
    ) {
    }
  }

  inner class RowNinetyfourVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowNinetyfourBinding = RowNinetyfourBinding.bind(itemView)
  }
}
