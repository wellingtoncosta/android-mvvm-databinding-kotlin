package br.com.wellingtoncosta.amdk.ui

import android.databinding.DataBindingUtil
import android.os.Bundle
import br.com.wellingtoncosta.amdk.R
import br.com.wellingtoncosta.amdk.databinding.ActivityMainBinding
import dagger.android.support.DaggerAppCompatActivity

/**
 * @author Wellington Costa on 31/12/2017.
 */
class MainActivity : DaggerAppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupViews()
    }

    private fun setupViews() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

}