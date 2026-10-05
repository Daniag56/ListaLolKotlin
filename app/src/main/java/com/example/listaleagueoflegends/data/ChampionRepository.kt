package com.example.listaleagueoflegends.data
import com.example.listaleagueoflegends.R
class ChampionRepository {
    private val _champions = listOf(
        Champion(
            id = 1,
            name = "Annie",
            img = R.drawable.annie

        ),
        Champion(
            id = 2,
            name = "Fizz",
            img = R.drawable.fizz
        ),
        Champion(
            id = 3,
            name = "Diana",
            img = R.drawable.diana
        ),
        Champion(
            id = 4,
            name = "Irelia",
            img = R.drawable.irelia
        ),
        Champion(
            id = 5,
            name = "Mordekaiser",
            img = R.drawable.mordekaiser
        ),
        Champion(
            id = 6,
            name = "Irelia",
            img = R.drawable.irelia
        ),
        Champion(
            id = 7,
            name = "Neeko",
            img = R.drawable.neeko
        ),
        Champion(
            id = 8,
            name = "Senna",
            img = R.drawable.senna
        ),
        Champion(
            id = 9,
            name = "Leona",
            img = R.drawable.leona
        ),
        Champion(
            id = 10,
            name = "Taric",
            img = R.drawable.taric
        ),
        Champion(
            id = 11,
            name = "Teemo",
            img = R.drawable.teemo
        ),
        Champion(
            id = 12,
            name = "Vi",
            img = R.drawable.vi
        ),
        Champion(
            id = 13,
            name = "Ziggs",
            img = R.drawable.ziggs
        )
    )

    val champion: List<Champion>
        get() = _champions
}



data class Champion(
    val id: Int,
    val name: String,
    val img: Int,
)