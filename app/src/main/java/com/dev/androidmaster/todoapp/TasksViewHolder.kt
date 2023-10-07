package com.dev.androidmaster.todoapp

import android.content.res.ColorStateList
import android.graphics.Paint
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.dev.androidmaster.R

class TasksViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val cbTask: CheckBox = view.findViewById(R.id.cbTask)
    private val tvTask: TextView = view.findViewById(R.id.tvTask)

    fun render(task: Task) {

        // este es el que se encarga de tachar el texto al estar seleccionada
        if (task.isSelected) {
            tvTask.paintFlags = tvTask.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        } else {
            tvTask.paintFlags = tvTask.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
        }

        cbTask.isChecked = task.isSelected
        tvTask.text = task.name

        // segun la categoria obtiene el color
        val color = when (task.category) {
            TaskCategory.Businnes -> R.color.todo_business_category
            TaskCategory.Other -> R.color.todo_other_category
            TaskCategory.Personal -> R.color.todo_personal_category
        }

        // coloca el color
        cbTask.buttonTintList = ColorStateList.valueOf(
            ContextCompat.getColor(tvTask.context, color)
        )
    }
}