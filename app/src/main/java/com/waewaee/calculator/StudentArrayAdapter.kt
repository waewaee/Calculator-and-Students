package com.waewaee.calculator

import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v4.content.ContextCompat.getColor
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.waewaee.calculator.R.color.black
import kotlinx.android.synthetic.main.view_holder_student.view.*

class StudentArrayAdapter(context: Context, list: ArrayList<StudentVO>) : ArrayAdapter<StudentVO>(context, 0, list){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var studentVO = getItem(position)
        var view = LayoutInflater.from(context).inflate(R.layout.view_holder_student,parent, false)
        view.tvId.text = studentVO?.id?:""
        view.tvName.text = studentVO?.name?:""
        view.tvAge.text = (studentVO?.age?:0).toString()

        view.setOnClickListener{
            view.tvId.setBackgroundColor(ContextCompat.getColor(context, R.color.blackTransparent))
            view.tvName.setBackgroundColor(ContextCompat.getColor(context, R.color.blackTransparent))
            view.tvAge.setBackgroundColor(ContextCompat.getColor(context, R.color.blackTransparent))
        }
        return view
    }
}