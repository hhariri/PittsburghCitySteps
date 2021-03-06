package com.juliemenge.pittsburghcitysteps
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.recyclerview_item_row.view.*

class RecyclerAdapter(val stepList: List<Step>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item_row, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.bindItems(stepList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return stepList.size
    }

    //the class is holding the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(step: Step) {
            // Review: Use Android Extensions. No need for findViewById
            itemView.stepName.text = step.name
            itemView.stepNeighborhood.text = step.neighborhood
            itemView.stepMaterial.text = step.material
            itemView.stepLength.text = step.length.toString()
        }
    }
}
