package com.example.listaleagueoflegends.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.listaleagueoflegends.data.Champion
import com.example.listaleagueoflegends.data.ChampionRepository

@Composable
fun ChampionListScreen(
    modifier: Modifier = Modifier
){
    val champions = ChampionRepository()
    LazyColumn(
        modifier = modifier.fillMaxSize()
    ) {
        items(
            items = champions.champion,
            key = {
                champion : Champion ->
                    champion.id
            }
        ) {
            champion ->
                ChampionItem(champion)
        }
    }
}

@Composable
fun ChampionItem(
    champion: Champion
) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = champion.img),
            contentDescription = champion.name,
            modifier = Modifier.size(80.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = champion.name,
            fontSize = 20.sp,
            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
            modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
        )
    }
}

@Composable
@Preview
fun ChampionItemPreview(){
    ChampionItem(champion = Champion(1, "Annie", com.example.listaleagueoflegends.R.drawable.annie))

}