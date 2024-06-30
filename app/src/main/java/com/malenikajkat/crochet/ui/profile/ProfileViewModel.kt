package com.malenikajkat.crochet.ui.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel(context: Context) : ViewModel() {

    // Данные профиля пользователя
    private var _userData = MutableLiveData<UserData>()
    val userData: LiveData<UserData>
        get() = _userData

    init {
        // Инициализация данных профиля
        _userData.value = UserData("Имя пользователя", "user@example.com")
    }

    // Метод для сохранения данных профиля
    fun saveUserData(name: String, email: String) {
        _userData.value = UserData(name, email)
    }

    // Метод для загрузки данных профиля
    fun loadUserData(): UserData {
        return _userData.value ?: UserData("", "")
    }

    // Класс для представления данных профиля
    data class UserData(val name: String, val email: String)
}