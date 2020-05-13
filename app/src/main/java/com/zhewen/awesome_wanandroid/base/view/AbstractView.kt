package com.zhewen.awesome_wanandroid.base.view
/**
* @author: zhewen
* created: 2020/5/12
* desc: View base class
*/
interface AbstractView {

    /**
     * Use night mode
     */
    fun useNightMode(isNightMode: Boolean)

    /**
     * show error message
     */
    fun showErrorMsg(errorMsg: String?)

    /**
     * show Normal
     */
    fun showNormal()

    /**
     * show Error
     */
    fun showError()

    /**
     * show loading
     */
    fun showLoading()

    /**
     * Reload
     */
    fun reload()

    /**
     * show login view
     */
    fun showLoginview()

    /**
     * show logout view
     */
    fun showLogoutView()

    /**
     * show collect success
     */
    fun showCollectSuccess()

    /**
     * show cancel collect success
     */
    fun showCancelCollectSuccess()

    /**
     * show toast
     */
    fun showToast()

    /**
     * show snackBar
     */
    fun showSnackBar(message: String?)
}