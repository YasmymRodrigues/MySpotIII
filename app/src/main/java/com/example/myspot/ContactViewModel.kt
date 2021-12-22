package com.example.myspot

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.ViewModel

class ContactViewModel : ViewModel() {
    fun doubtsRequest(context: Context){
        val uri: Uri =
            Uri.parse("https://www.emel.pt/pt/perguntas-frequentes/bloqueamento-e-remocao-de-veiculos/") // missing 'http://' will cause crashed

        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(context, intent, null)
    }
}