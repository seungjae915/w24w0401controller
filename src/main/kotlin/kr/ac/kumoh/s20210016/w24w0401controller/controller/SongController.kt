package kr.ac.kumoh.s20210016.w24w0401controller.controller

import kr.ac.kumoh.s20210016.w24w0401controller.service.SongService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController(val service: SongService) {
//    val title = listOf(
//        "금요일에 만나요",
//        "좋은날",
//        "너랑나",
//    )

    @GetMapping("/song/list")
    fun getSongList() = service.getAllSongs()
}