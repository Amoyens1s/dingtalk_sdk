package com.amoyensis.dingtalk.dingtalk_sdk_fork.constant

class AuthResponse {
    var authCode:String = ""
    var error:String = ""
    var state:String = ""

    constructor(authCode: String, error: String, state: String) {
        this.authCode = authCode
        this.error = error
        this.state = state
    }
}