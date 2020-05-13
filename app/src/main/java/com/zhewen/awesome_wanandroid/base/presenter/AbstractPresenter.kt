package com.zhewen.awesome_wanandroid.base.presenter

import com.zhewen.awesome_wanandroid.base.view.AbstractView

/**
* @author: zhewen
* created: 2020/5/12
* desc:Presenter base class
*/
interface AbstractPresenter<in T : AbstractView> {

    /**
     * attach view
     */
    fun attachView(view: T)

    /**
     * detach view
     */
    fun detachView()

    /**
     *
     */
    fun addRxBindingSubscribe(disposable: Disposable?)

    /**
     * get night mode state
     */
    fun getNightModeState(): Boolean

    /**
     * set login status
     */
    fun setLoginStatus(loginStatus: Boolean)

    /**
     * get login status
     */
    fun getLoginStatus(): Boolean

    /**
     * get login account
     */
    fun getLoginAccount(): String?

    /**
     * set login account
     */
    fun setLoginAccount(account: String?)

    /**
     * set login password
     */
    fun setLoginPassword(password: String?)

    /**
     * get current page
     */
    fun getCurrentPage(): Int
}

