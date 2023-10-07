package com.dev.androidmaster.todoapp

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dev.androidmaster.R
import com.dev.androidmaster.todoapp.TaskCategory.*
import com.google.android.material.floatingactionbutton.FloatingActionButton

class TodoActivity : AppCompatActivity() {

    private val categories = listOf(
        Businnes,
        Personal,
        Other
    )
    private val tasks = mutableListOf(
        Task("PruebaBusiness", Businnes),
        Task("PruebaPersonal", Personal),
        Task("PruebaOther", Other)
    )
    private lateinit var rvCategorys: RecyclerView
    private lateinit var categoriesAdapter: CategoriesAdapter

    private lateinit var rvTasks: RecyclerView
    private lateinit var tasksAdapter: TasksAdapter

    private lateinit var fabAddTask: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)

        initicComponent()
        initUI()
        initListeners()
    }

    private fun initListeners() {
        fabAddTask.setOnClickListener { showDialog() }
    }

    private fun showDialog() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_task)

        // recupera el edit text, el boton y el radio grup del dialog
        val btnAddTask: Button = dialog.findViewById(R.id.btnAddTask)
        val etTask: EditText = dialog.findViewById(R.id.etTask)
        val rgCategories: RadioGroup = dialog.findViewById(R.id.rgCategories)

        // al darle chick al boton
        btnAddTask.setOnClickListener {
            val currentTask = etTask.text.toString()
            if (currentTask.isNotEmpty()) {
                val selectedId = rgCategories.checkedRadioButtonId // verifica que radio tiene check
                val selectedRadioButton: RadioButton =
                    rgCategories.findViewById(selectedId) // recupera el radio seleccionado
                val currentCategory: TaskCategory =
                    when (selectedRadioButton.text) { // segun el texto asigna la categorio
                        getString(R.string.todo_dialog_category_business) -> Businnes
                        getString(R.string.todo_dialog_category_personal) -> Personal
                        else -> Other
                    }

                tasks.add(Task(etTask.text.toString(), currentCategory)) // anade la catgoria
                updateTasks() // se abisa al adapete que se a anadido un iten
                dialog.hide() // oculta el dialog
            }
        }

        dialog.show() // muestra el dialog
    }

    private fun initicComponent() {
        rvCategorys = findViewById(R.id.rvCategorys)
        rvTasks = findViewById(R.id.rvTasks)
        fabAddTask = findViewById(R.id.fabAddTask)
    }

    private fun initUI() {
        categoriesAdapter = CategoriesAdapter(categories) { position -> updateCategories(position) }
        rvCategorys.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategorys.adapter = categoriesAdapter

        tasksAdapter = TasksAdapter(tasks) { position -> onItemSelected(position) } // es lo mismo que TasksAdapter(tasks, { position -> onItemSelected(position) }) como callback
        rvTasks.layoutManager = LinearLayoutManager(this)
        rvTasks.adapter = tasksAdapter
    }

    private fun onItemSelected(position: Int) {
        tasks[position].isSelected = !tasks[position].isSelected
        updateTasks()
    }

    private fun updateCategories(position: Int) {
        categories[position].isSelected = !categories[position].isSelected
        categoriesAdapter.notifyItemChanged(position)
        updateTasks()
    }

    private fun updateTasks() {
        val selectedCategories: List<TaskCategory> = categories.filter { it.isSelected }
        val newTasks = tasks.filter { selectedCategories.contains(it.category) }
        tasksAdapter.tasks = newTasks
        tasksAdapter.notifyDataSetChanged()
    }
}