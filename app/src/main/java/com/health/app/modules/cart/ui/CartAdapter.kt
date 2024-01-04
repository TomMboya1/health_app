package com.health.app.modules.cart.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.health.app.R
import com.health.app.databinding.RowCartBinding
import com.health.app.modules.cart.`data`.model.CartRowModel
import kotlin.Int
import kotlin.collections.List

class CartAdapter(
  var list: List<CartRowModel>
) : RecyclerView.Adapter<CartAdapter.RowCartVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCartVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_cart,parent,false)
    return RowCartVH(view)
  }

  override fun onBindViewHolder(holder: RowCartVH, position: Int) {
    val cartRowModel = CartRowModel()
    // TODO uncomment following line after integration with data source
    // val cartRowModel = list[position]
    holder.binding.cartRowModel = cartRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CartRowModel>) {
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
      item: CartRowModel
    ) {
    }
  }

  inner class RowCartVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCartBinding = RowCartBinding.bind(itemView)
  }
}
