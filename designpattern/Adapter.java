
public interface MusicService {
    void playMusic();
}

public interface Mp3Service {
    void playM3p();
}

public class Mp3ServiceImpl implements Mp3Service {

}

public class MusicAdapter implements MusicService {
    private final Mp3Service mp3Service;

    @Override
    public void playMusic() {
        mp3Service.playM3p();
    }
}