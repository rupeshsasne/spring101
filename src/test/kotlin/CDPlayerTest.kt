import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import soundsystem.CDPlayerConfig
import soundsystem.MediaPlayer
import kotlin.test.assertNotNull

@RunWith(SpringJUnit4ClassRunner::class)
@ContextConfiguration(classes = [
    CDPlayerConfig::class
])
class CDPlayerTest {

    @Autowired
    private lateinit var testObject: MediaPlayer

//    @Autowired
//    @SgtPeppers1
//    private lateinit var cd: CompactDisk

    @Test
    fun `CDPlayer should not be null`() {
        assertNotNull(testObject)
    }
}
