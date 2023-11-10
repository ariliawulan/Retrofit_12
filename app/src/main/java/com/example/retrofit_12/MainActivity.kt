package com.example.retrofit_12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.retrofit_12.databinding.ActivityMainBinding
import com.example.retrofit_12.model.Users
import com.example.retrofit_12.network.ApiClient
import com.example.retrofit_12.model.Data
import com.example.retrofit_12.model.ExampleModel
import retrofit2.Response
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val client = ApiClient.getInstance()
        val response = client.getRickCharacter()
        val userList = ArrayList<String>()

        response.enqueue(object : retrofit2.Callback<ExampleModel> {
            override fun onResponse(call: retrofit2.Call<ExampleModel>, response: Response<ExampleModel>) {
               val thisResut = response.body()
                val datas = thisResut?.results ?: emptyList()
                if (datas.isNotEmpty()) {
                    for (i in datas) {
                        userList.add(i.name)
                    }
                }

                val listAdapter = ArrayAdapter(
                    this@MainActivity,
                    android.R.layout.simple_list_item_1,
                    userList
                )
                binding.lvName.adapter = listAdapter
            }

            override fun onFailure(call: retrofit2.Call<ExampleModel>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Koneksi error",
                    Toast.LENGTH_LONG).show()
            }
        })
    }
}