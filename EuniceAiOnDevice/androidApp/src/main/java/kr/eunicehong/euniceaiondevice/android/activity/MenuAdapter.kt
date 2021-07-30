package kr.eunicehong.euniceaiondevice.android.activity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kr.eunicehong.euniceaiondevice.android.databinding.ItemMainMenuBinding
import kr.eunicehong.euniceaiondevice.android.viewmodel.MainViewModel
import kr.eunicehong.euniceaiondevice.entity.MainMenu

class MenuAdapter(private val vm: MainViewModel) : RecyclerView.Adapter<MenuAdapter.ViewHolder>() {
    private val itemList = vm.getMainMenuList()

    inner class ViewHolder(private val binding: ItemMainMenuBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MainMenu) {
            binding.menu = item
            binding.vm = vm
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemMainMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount(): Int = itemList.size
}