package lim.sejun2.mosquito

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter() : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {
   companion object{
       const val TAG = "MenuAdapter"
   }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuAdapter.MenuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return MenuViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 6
    }

    override fun onBindViewHolder(holder: MenuAdapter.MenuViewHolder, position: Int) {
        holder.imageView.setImageResource(R.drawable.ic_baseline_account_circle_24)
        holder.title_textView.setText("TESTTESTTEST")
    }
    class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var imageView = itemView.findViewById<ImageView>(R.id.imageView_list_item)
        var title_textView = itemView.findViewById<TextView>(R.id.title_list_item)

         init {
             itemView.setOnClickListener {
                 val pos = adapterPosition
                 if(pos != RecyclerView.NO_POSITION){
                     Log.d(TAG, "$pos clicked!")
                 }
             }
         }
    }
}