package com.waewaee.calculator

import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class StudentAdapter(var list: ArrayList<StudentVO>): RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {
    class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var textViewId: TextView = itemView.findViewById(R.id.tvId)
        var textViewName: TextView = itemView.findViewById(R.id.tvName)
        var textViewAge: TextView = itemView.findViewById(R.id.tvAge)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): StudentViewHolder {
        var view = LayoutInflater.from(p0.context).inflate(R.layout.view_holder_student, p0, false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(p0: StudentViewHolder, p1: Int) {
        var studentVO = list[p1]
        p0.textViewId.text = studentVO.id
        p0.textViewName.text = studentVO.name
        p0.textViewAge.text = studentVO.age.toString()
    }

    override fun getItemCount(): Int {
        return list.size
    }


}