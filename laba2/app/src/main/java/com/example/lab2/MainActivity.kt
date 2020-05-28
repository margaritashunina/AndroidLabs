package com.example.lab2

import android.os.Bundle
import android.text.Editable
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun add(a: Int, b: Int) : Int {
        return a + b
    }

    private fun diff(a: Int, b: Int) : Int {
        return a - b
    }

    private fun mult(a: Int, b: Int) : Int {
        return a * b
    }

    private fun div(a: Int, b: Int) : Int {
        if (b == 0) {
            massage("делим на ноль, братишка")
            return -1;
        }
        return a / b
    }

    private fun massage(msg: String) {
        val s : Snackbar = Snackbar.make(root, msg, Snackbar.LENGTH_LONG)
        s.show()
    }

    private fun operation(f: (Int, Int) -> Int) : Int {
        val strF: Editable = editTextFirst.getText();
        val strS: Editable = editTextSecond.getText()

        val intF : Int = strF.toString().toInt()
        val intS : Int = strS.toString().toInt()

        return f(intF, intS)
    }

    private fun isGood() : Boolean {
        val empFirst : Boolean = editTextFirst.text.isEmpty();
        val empSecond : Boolean = editTextSecond.text.isEmpty();
        if (!empFirst && !empSecond) {
            return true
        }

        massage("не заполнены поля")

        return false
    }

    public fun adds(view: View) {
        if (isGood()) {
            this.textView.setText("Result: " + operation(::add).toString())
        }
    }

    public fun diffs(view: View) {
        if (isGood()) {
            this.textView.setText("Result: " + operation(::diff).toString())
        }
    }

    public fun mults(view: View) {
        if (isGood()) {
            this.textView.setText("Result: " + operation(::mult).toString())
        }
    }

    public fun divs(view: View) {
        if (isGood()) {
            this.textView.setText("Result: " + operation(::div).toString())
        }
    }
}
