package kr.eunicehong.euniceaiondevice.repository.core

import kr.eunicehong.euniceaiondevice.repository.main.MainRepository

interface CoreRepository {
    val main: MainRepository
}