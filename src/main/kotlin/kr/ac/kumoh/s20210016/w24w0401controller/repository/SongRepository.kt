package kr.ac.kumoh.s20210016.w24w0401controller.repository

import kr.ac.kumoh.s20210016.w24w0401controller.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository {
    val songs = listOf(
        Song(1, "금요일에 만나요", "아이유"),
        Song(1, "좋은날", "아이유"),
        Song(1, "너랑나", "아이유"),
    )


    fun fetchSong() = songs
}