package soundsystem

import internal.SgtPeppers
import internal.SgtPeppers1
import org.springframework.stereotype.Component

@Component
@SgtPeppers
class SgtPeppers : CompactDisk {
    private val title = "Sgt. Pepper's Lonely Hearts Club Band"
    private val artist = "The Beatles"

    override fun play() {
        println("Playing $title by $artist")
    }
}

@Component
@SgtPeppers1
class SgtPeppers1 : CompactDisk {
    private val title = "Sgt. Pepper's Lonely Hearts Club Band"
    private val artist = "The Beatles"

    override fun play() {
        println("Playing $title by $artist")
    }
}
