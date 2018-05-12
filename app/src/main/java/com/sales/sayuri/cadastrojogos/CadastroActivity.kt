package com.sales.sayuri.cadastrojogos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        btLimpar.setOnClickListener {
            limpar()
        }

        btCadastrar.setOnClickListener {
            val telaSucesso = Intent (this, SucessoActivity::class.java)

            val jogo = Jogo(etNome.text.toString(),
                    etGenero.text.toString(),
                    etAnoLancamento.text.toString().toInt())

            telaSucesso.putExtra("jogo", jogo)

            startActivity(telaSucesso)
            limpar()
        }
    }

    private fun limpar(){
        etNome.setText("")
        etAnoLancamento.setText("")
        etGenero.setText("")
    }
}
