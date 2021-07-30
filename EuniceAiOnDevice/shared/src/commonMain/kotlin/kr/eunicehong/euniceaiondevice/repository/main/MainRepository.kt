package kr.eunicehong.euniceaiondevice.repository.main

import kr.eunicehong.euniceaiondevice.entity.MainMenu

interface MainRepository {
    fun getMainMenu(): List<MainMenu>
}