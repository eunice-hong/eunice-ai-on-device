package kr.eunicehong.euniceaiondevice.repository.core

import kr.eunicehong.euniceaiondevice.repository.main.MainRepository

class CoreRepositoryImpl(
    override val main: MainRepository
) : CoreRepository