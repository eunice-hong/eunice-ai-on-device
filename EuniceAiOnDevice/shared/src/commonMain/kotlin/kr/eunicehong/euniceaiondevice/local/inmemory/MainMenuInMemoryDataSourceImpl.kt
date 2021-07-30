package kr.eunicehong.euniceaiondevice.local.inmemory

import kr.eunicehong.euniceaiondevice.entity.MainMenu

class MainMenuInMemoryDataSourceImpl() : MainMenuInMemoryDataSource {

    override fun getMenuList(): List<MainMenu> {
        return menuList
    }

    companion object{
        private val menuList = listOf(
            MainMenu(id = 0, title = "키워드로 아무 가사 만들기", icon = "🎶", backgroundColor = "#D8A7B1"),
            MainMenu(id = 1, title = "닮은 연예인 찾기", icon = "👯‍♂️", backgroundColor = "#B6E2D3"),
            MainMenu(id = 2, title = "카메라 스티커", icon = "👺", backgroundColor = "#FAE8E0"),
            MainMenu(id = 3, title = "가위 바위 보 맞추기", icon = "🤟", backgroundColor = "#EF7C8E"),
        )
    }
}