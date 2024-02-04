package com.example.musicappui

import androidx.annotation.DrawableRes

sealed class Screen(val title:String,val route:String){

sealed class DrawerScreen(val dtitle:String,val dRoute:String,@DrawableRes val icon:Int  ) :Screen(dtitle,dRoute){
    object Account:DrawerScreen(
        "Account",
        "account",
        R.drawable.ic_account
    )
    object Subscription:DrawerScreen(
        "Subscription",
        "subscribe",
        R.drawable.ic_subscribe
    )
    object AddAccount:DrawerScreen(
        "Add Account",
        "add_account",
        R.drawable.ic_personadd

    )

}}

val screensInDrawer = listOf(
    Screen.DrawerScreen.Account,
    Screen.DrawerScreen.Subscription,
    Screen.DrawerScreen.AddAccount
)