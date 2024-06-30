package com.malenikajkat.crochet.ui.profile

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment


class ProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.profile_fragment, container, false)

        // Находим элементы интерфейса
        val textProfile = view.findViewById<TextView>(R.id.text_profile)
        val editTextUsername = view.findViewById<EditText>(R.id.edit_text_username)
        val editTextPassword = view.findViewById<EditText>(R.id.edit_text_password)
        val buttonRegister = view.findViewById<Button>(R.id.button_register)
        val editTextLoginUsername = view.findViewById<EditText>(R.id.edit_text_login_username)
        val editTextLoginPassword = view.findViewById<EditText>(R.id.edit_text_login_password)
        val buttonLogin = view.findViewById<Button>(R.id.button_login)
        val buttonBackToMain = view.findViewById<Button>(R.id.button_back_to_main)

        // Добавляем обработчики событий
        buttonRegister.setOnClickListener {
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            // Здесь должна быть логика регистрации пользователя, например, отправка запроса на сервер
            // или сохранение учетных данных в локальной базе данных.

            // В случае успешной регистрации вы можете отобразить сообщение пользователю или перевести его на другой экран.
        }

        buttonLogin.setOnClickListener {
            // Логика входа существующего пользователя
            val username = editTextLoginUsername.text.toString()
            val password = editTextLoginPassword.text.toString()

        }

        buttonBackToMain.setOnClickListener {
            // Переход на главную страницу
        }

        return view
    }
}