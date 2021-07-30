package kr.eunicehong.euniceaiondevice.local.inmemory

import kr.eunicehong.euniceaiondevice.entity.MainMenu

interface MainMenuInMemoryDataSource {
    fun getMenuList():List<MainMenu>
}