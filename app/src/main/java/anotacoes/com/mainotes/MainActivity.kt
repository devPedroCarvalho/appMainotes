package anotacoes.com.mainotes

import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import anotacoes.com.mainotes.model.Model
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var modelPreferences = Model(this)


        var anotation =  modelPreferences.getPreferences().toString()

        editText?.text = Editable.Factory.getInstance().newEditable(anotation)



        btn_salvar.setOnClickListener {

            if (editText.text.isEmpty()){

               Toast.makeText(this,"Escreva a seu pensamento...",Toast.LENGTH_SHORT).show()


            }else{
                Toast.makeText(this,"Pensamento salvo!!",Toast.LENGTH_SHORT).show()

                var getText = editText.text.toString()
                modelPreferences.savePreferences(getText)



            }

        }





    }
}
