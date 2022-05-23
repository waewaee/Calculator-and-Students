package com.waewaee.calculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        var studentList = ArrayList<StudentVO>()
        studentList.add(StudentVO(id = "stu001", name = "Wae Waee", age = 25))
        studentList.add(StudentVO(id = "stu002", name = "May Barani", age = 25))
        studentList.add(StudentVO(id = "stu003", name = "X pote", age = 25))
        studentList.add(StudentVO(id = "stu004", name = "Nga Chay Kg", age = 25))
        studentList.add(StudentVO(id = "stu005", name = "Ta Yote Ma", age = 25))
        studentList.add(StudentVO(id = "stu006", name = "Par Phaung", age = 25))
        studentList.add(StudentVO(id = "stu007", name = "Kyaung G o", age = 25))
        studentList.add(StudentVO(id = "stu001", name = "Wae Waee", age = 25))
        studentList.add(StudentVO(id = "stu002", name = "May Barani", age = 25))
        studentList.add(StudentVO(id = "stu003", name = "X pote", age = 25))
        studentList.add(StudentVO(id = "stu004", name = "Nga Chay Kg", age = 25))
        studentList.add(StudentVO(id = "stu005", name = "Ta Yote Ma", age = 25))
        studentList.add(StudentVO(id = "stu006", name = "Par Phaung", age = 25))
        studentList.add(StudentVO(id = "stu007", name = "Kyaung G o", age = 25))

        var recyclerAdapter = StudentAdapter(studentList)
        rvStudent.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false)
        rvStudent.adapter = recyclerAdapter

    }
}