package com.example.constraintlayoutsample

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import androidx.core.content.contentValuesOf
import androidx.fragment.app.DialogFragment
import java.lang.IllegalStateException

class QuestionDialogFragment: DialogFragment() {
    override fun onCreateDialog(savedState: Bundle?): Dialog {
        val dialog = activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setTitle(R.string.dialog_title)
            builder.setMessage(R.string.dialog_message)
            builder.setPositiveButton(R.string.dialog_btn_ok, DialogButtonClickListener())
            builder.setNeutralButton(R.string.dialog_btn_ng, DialogButtonClickListener())
            builder.create()
        }
        return  dialog ?: throw IllegalStateException("アクティビティがnullです")
    }

    private inner class DialogButtonClickListener : DialogInterface.OnClickListener {
        override fun onClick(dialog: DialogInterface, which: Int) {
            when(which){
                DialogInterface.BUTTON_POSITIVE -> {
                    val intent = Intent(context, completionActivity::class.java)
                    startActivity(intent)
                }
                DialogInterface.BUTTON_NEGATIVE -> {

                }
            }
        }
    }
}