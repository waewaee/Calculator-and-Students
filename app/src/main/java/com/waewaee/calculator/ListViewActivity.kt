package com.waewaee.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {
    lateinit var adapter : ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
//        var listMonth = resources.getStringArray(R.array.array_months)
//        adapter = ArrayAdapter<String>(this, R.layout.view_month, R.id.tvMonth, listMonth)
//        lvMonth.adapter = adapter
//        lvMonth.divider = null
//
//        lvMonth.setOnItemClickListener { parent, view, position, id ->
//            Toast.makeText(this, adapter.getItem(position), Toast.LENGTH_SHORT).show()
//
//        }

        var studentList = ArrayList<StudentVO>()
        studentList.add(StudentVO(id = "stu001", name = "Wae Waee", age = 25))
        studentList.add(StudentVO(id = "stu002", name = "May Barani", age = 25))
        studentList.add(StudentVO(id = "stu003", name = "X pote", age = 25))
        studentList.add(StudentVO(id = "stu004", name = "Nga Chay Kg", age = 25))
        studentList.add(StudentVO(id = "stu005", name = "Ta Yote Ma", age = 25))
        studentList.add(StudentVO(id = "stu006", name = "Par Phaung", age = 25))
        studentList.add(StudentVO(id = "stu007", name = "Kyaung Gyi O", age = 25))

        var adapter = StudentArrayAdapter(this, studentList)
        lvStudent.adapter = adapter
        lvStudent.divider = null



    }
}