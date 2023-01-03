package com.example.project.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project.R
import com.example.project.model.Drug
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DrugAdapter () : RecyclerView.Adapter<DrugAdapter.ViewHolder>() {
    var data: ArrayList<Drug> = arrayListOf()
        set(value) {
            field=value
            notifyDataSetChanged()
        }
    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
            val v = LayoutInflater.from(viewGroup?.context).inflate(R.layout.drug_row, viewGroup, false)
            return ViewHolder(v);
        }
        override fun getItemCount(): Int {
            return data.size
        }
        override fun onBindViewHolder(viewHolder: ViewHolder, p1: Int) {

            viewHolder.name?.text = data[p1].name
            viewHolder.dose.text = data[p1].dose
            viewHolder.day?.text = data[p1].day
            viewHolder.time?.text = data[p1].time.toString()
            viewHolder.doseType.text = data[p1].doseType
            viewHolder.del_button.setOnClickListener {
                data.removeAt(viewHolder.adapterPosition)
                notifyItemRemoved(viewHolder.adapterPosition)
            }
        }
        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val name = itemView.findViewById<TextView>(R.id.drug_name)
            val dose = itemView.findViewById<TextView>(R.id.doseQuantity)
            val day = itemView.findViewById<TextView>(R.id.day_time)
            val time = itemView.findViewById<TextView>(R.id.drug_time)
            val doseType = itemView.findViewById<TextView>(R.id.dose_details)
            val del_button = itemView.findViewById<FloatingActionButton>(R.id.delete_button)


        }
    }