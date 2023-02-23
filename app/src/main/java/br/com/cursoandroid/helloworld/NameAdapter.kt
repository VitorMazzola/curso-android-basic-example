package br.com.cursoandroid.helloworld

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NameAdapter(
    val context: Context,
    val users: List<User>
 ): RecyclerView.Adapter<NameAdapter.NameViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_name_list, parent,false)

        return NameViewHolder(view)
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        holder.bind(users[position])
    }

    override fun getItemCount(): Int {
       return users.size
    }

    inner class NameViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(user: User) = with(context) {

            val tvName = itemView.findViewById<TextView>(R.id.tvName)

            tvName.text = user.name
        }
    }

}