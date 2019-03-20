package br.com.gilmar.maps

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mapa_via_intent.*

class MapaViaIntentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mapa_via_intent)

        btExibirLocal.setOnClickListener {
            val latitudeLongitude = "-23.5565804,-46.662113"
            val zoom = 15
            val geo = "geo:$latitudeLongitude?z=$zoom"

            val geoURI = Uri.parse(geo)
            val intent =  Intent(Intent.ACTION_VIEW, geoURI)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }
        btExibirRestaurantes.setOnClickListener {
             val query  = "restaurantes"
            val geo = "geo:0,0?q=$query"
            exibirNoMapa(geo)
        }
    }
    fun exibirNoMapa(geo: String){
        val geoURI = Uri.parse(geo)
        val intent =  Intent(Intent.ACTION_VIEW, geoURI)
        intent.setPackage("com.google.android.apps.maps")
        startActivity(intent)

    }
}
