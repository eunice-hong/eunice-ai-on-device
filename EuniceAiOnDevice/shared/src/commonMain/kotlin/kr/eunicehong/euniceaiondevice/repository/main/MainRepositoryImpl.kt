package kr.eunicehong.euniceaiondevice.repository.main

import kr.eunicehong.euniceaiondevice.entity.MainMenu
import kr.eunicehong.euniceaiondevice.local.inmemory.MainMenuInMemoryDataSource

class MainRepositoryImpl(
    private val localInMemoryDataSource: MainMenuInMemoryDataSource
) : MainRepository {
    override fun getMainMenu(): List<MainMenu> {
        return localInMemoryDataSource.getMenuList()
    }
}