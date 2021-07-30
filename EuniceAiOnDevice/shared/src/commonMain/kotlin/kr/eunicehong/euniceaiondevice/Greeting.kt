package kr.eunicehong.euniceaiondevice

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}