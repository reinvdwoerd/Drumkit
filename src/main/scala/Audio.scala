import kuusisto.tinysound.Music
import kuusisto.tinysound.Sound
import kuusisto.tinysound.TinySound

object Audio {
    
    val kick = TinySound.loadSound("kick.wav")
    val cowbell = TinySound.loadSound("cowbell.wav")
    
    def playFile(file: String) {
        TinySound.loadSound("kick.wav").play()
    }
}
