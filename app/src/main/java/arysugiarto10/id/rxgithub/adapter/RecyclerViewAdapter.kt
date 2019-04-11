package arysugiarto10.id.rxgithub.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import arysugiarto10.id.rxgithub.R
import arysugiarto10.id.rxgithub.model.GithubModel
import kotlinx.android.synthetic.main.item_started.view.*
import java.util.zip.Inflater

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.GithubViewHolder>() {
    val data = ArrayList<GithubModel>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GithubViewHolder {
       return GithubViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_started, parent, false))
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: GithubViewHolder, position: Int) {
       holder.fulname.text = data[position].full_name
        holder.desc.text = data[position].description
        holder.lang.text = data[position].language
        holder.star.text = data[position].star
    }

    class GithubViewHolder(view: View):RecyclerView.ViewHolder(view){
        val fulname = view.fullName
        val lang = view.language
        val desc = view.description
        val star = view.star
    }
}