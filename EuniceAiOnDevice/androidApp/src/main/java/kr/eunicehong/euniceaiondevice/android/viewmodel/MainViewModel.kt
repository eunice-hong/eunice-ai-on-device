package kr.eunicehong.euniceaiondevice.android.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kr.eunicehong.euniceaiondevice.repository.core.CoreRepository

class MainViewModel(private val coreRepository: CoreRepository) : ViewModel() {
    fun getMainMenuList() = coreRepository.main.getMainMenu()

    val startMenu: LiveData<Int>
        get() = _startMenu
    private val _startMenu = MutableLiveData<Int>()
    fun onClickMenu(code: Int) {
        val menuId = when (code) {
            0 -> {
                1
            }
            else -> 0
        }

        _startMenu.postValue(menuId)
    }
}