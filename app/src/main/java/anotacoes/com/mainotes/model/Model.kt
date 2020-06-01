package anotacoes.com.mainotes.model

import android.content.Context
import android.content.SharedPreferences
import android.util.Log

class Model(context: Context) {

    val MY_PREF = "MyPref"
    val TEXT_STRING = "key_name"

    val pref = context.getSharedPreferences(
        MY_PREF,
        Context.MODE_PRIVATE)
    val editor: SharedPreferences.Editor = pref.edit()


    fun savePreferences(text:String){


        editor.putString(TEXT_STRING, text)
        editor.apply()
        Log.d("teste",text)

    }

    fun getPreferences():String?{

        return pref.getString(TEXT_STRING,null)
    }

   

}