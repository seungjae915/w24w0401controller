package kr.ac.kumoh.s20210016.w24w0401controller.service

import kr.ac.kumoh.s20210016.w24w0401controller.model.Song
import kr.ac.kumoh.s20210016.w24w0401controller.repository.SongRepository
import org.springframework.stereotype.Service

@Service
class SongService(val repository: SongRepository) {
    fun getAllSongs(): List<Song> {
        return repository.fetchSong()
    }
}