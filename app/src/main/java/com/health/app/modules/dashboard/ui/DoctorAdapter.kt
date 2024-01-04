package com.health.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.health.app.R
import com.health.app.databinding.RowDoctorBinding
import com.health.app.modules.dashboard.`data`.model.DoctorRowModel
import kotlin.Int
import kotlin.collections.List

class DoctorAdapter(
  var list: List<DoctorRowModel>
) : RecyclerView.Adapter<DoctorAdapter.RowDoctorVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDoctorVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_doctor,parent,false)
    return RowDoctorVH(view)
  }

  override fun onBindViewHolder(holder: RowDoctorVH, position: Int) {
    val doctorRowModel = DoctorRowModel()
    // TODO uncomment following line after integration with data source
    // val doctorRowModel = list[position]
    holder.binding.doctorRowModel = doctorRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DoctorRowModel>) {
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
      item: DoctorRowModel
    ) {
    }
  }

  inner class RowDoctorVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDoctorBinding = RowDoctorBinding.bind(itemView)
    init {
      binding.linearDoctor.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, DoctorRowModel())
      }
    }
  }
}
