package com.itera.pam.p1.latihan

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Hands-on 3: Layout — Profile Card
@Composable
fun Handson3ProfileCard() {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text("Profile Card")
        Text("Nama: Hildyah Maretasya Araffad")
        Text("NIM: 123140151")
        Text("Program Studi: Teknik Informatika")
        Text("Institut Teknologi Sumatera")
    }
}