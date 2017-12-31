package br.com.wellingtoncosta.amdk.ui

import android.databinding.DataBindingUtil
import android.os.Bundle
import br.com.wellingtoncosta.amdk.R
import br.com.wellingtoncosta.amdk.databinding.ActivityMainBinding
import br.com.wellingtoncosta.amdk.ui.colors.ListColorsFragment
import dagger.android.support.DaggerAppCompatActivity
import br.com.wellingtoncosta.amdk.ui.common.ViewPagerAdapter
import br.com.wellingtoncosta.amdk.ui.users.ListUsersFragment

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
        setupToolbar()
        setupTabs()
    }

    private fun setupToolbar() {
        setSupportActionBar(binding.includeToolbar?.toolbar)
        supportActionBar?.title = getString(R.string.app_name)
    }

    private fun setupTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(ListUsersFragment(), getString(R.string.users))
        adapter.addFragment(ListColorsFragment(), getString(R.string.colors))

        binding.viewPager.adapter = adapter
        binding.includeToolbar?.tabs?.setupWithViewPager(binding.viewPager)
    }

}