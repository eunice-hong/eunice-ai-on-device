package kr.eunicehong.euniceaiondevice.android.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import kr.eunicehong.euniceaiondevice.android.R
import kr.eunicehong.euniceaiondevice.android.databinding.ActivityMainBinding
import kr.eunicehong.euniceaiondevice.android.viewmodel.MainViewModel
import kr.eunicehong.euniceaiondevice.local.inmemory.MainMenuInMemoryDataSourceImpl
import kr.eunicehong.euniceaiondevice.repository.core.CoreRepositoryImpl
import kr.eunicehong.euniceaiondevice.repository.main.MainRepositoryImpl

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)

        val coreRepository = CoreRepositoryImpl(MainRepositoryImpl(MainMenuInMemoryDataSourceImpl()))
        val mainVm = MainViewModel(coreRepository)
        binding.adapter = MenuAdapter(mainVm)

        mainVm.apply {
            startMenu.observe(this@MainActivity) {

            }
        }
    }
}
