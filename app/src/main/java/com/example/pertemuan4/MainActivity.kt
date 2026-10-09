package com.example.pertemuan4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pertemuan4.ui.theme.Pertemuan4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pertemuan4Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    // 1. HAPUS fungsi Greeting bawaan ini:
                    // Greeting(
                    //     name = "Android",
                    //     modifier = Modifier.padding(innerPadding)
                    // )

                    // 2. PANGGIL fungsi buatanmu di sini:
                    // (Sesuaikan namanya, apakah ActivitasPertama atau ActPertama)
                    ActivitasPertama(
                        modifier = Modifier.padding(innerPadding)
                    )

                }
            }
        }
    }
}

// 3. (Opsional) Kamu bisa menghapus fungsi Greeting dan GreetingPreview
// yang ada di baris paling bawah karena sudah tidak digunakan lagi.