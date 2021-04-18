package soundsystem

import internal.SgtPeppers1
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class CDPlayer @Autowired constructor(@SgtPeppers1 private val cd: CompactDisk) : MediaPlayer {
    override fun play() {
        cd.play()
    }
}
