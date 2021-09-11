package doodlejump.Boundary;

import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class SoundManager {
    private AudioClip bounce;
    private AudioClip jump;
    private AudioClip monster1;
    private AudioClip monster2;
    private AudioClip monster3;
    private AudioClip propeller;
    private AudioClip rocket;
    private AudioClip spring;
    private AudioClip falling;
    private AudioClip shot;
    private AudioClip hit;
    private MediaPlayer gameSound1;

    public SoundManager()
    {
        //this.bounce = new AudioClip(SoundManager.class.getResource("/doodlejump/sounds/bounce.mp3").toString());
        this.bounce = new AudioClip(SoundManager.class.getResource("/doodlejump/sounds/bounce.mp3").toString());
        this.jump = new AudioClip(SoundManager.class.getResource("/doodlejump/sounds/jump.mp3").toString());
        this.monster1 = new AudioClip(SoundManager.class.getResource("/doodlejump/sounds/monster1.mp3").toString());
        this.monster2 = new AudioClip(SoundManager.class.getResource("/doodlejump/sounds/monster2.mp3").toString());
        this.monster3 = new AudioClip(SoundManager.class.getResource("/doodlejump/sounds/monster3.mp3").toString());
        this.propeller = new AudioClip(SoundManager.class.getResource("/doodlejump/sounds/propeller.mp3").toString());
        this.rocket = new AudioClip(SoundManager.class.getResource("/doodlejump/sounds/rocket.mp3").toString());
        this.spring = new AudioClip(SoundManager.class.getResource("/doodlejump/sounds/spring.mp3").toString());
        this.falling = new AudioClip(SoundManager.class.getResource("/doodlejump/sounds/falling.mp3").toString());
        this.shot = new AudioClip(SoundManager.class.getResource("/doodlejump/sounds/shot.mp3").toString());
        this.hit = new AudioClip(SoundManager.class.getResource("/doodlejump/sounds/hit.mp3").toString());
        this.gameSound1 = new MediaPlayer(new Media(SoundManager.class.getResource("/doodlejump/sounds/gameSound1.mp3").toString()));
        gameSound1.setCycleCount(MediaPlayer.INDEFINITE);
    }

    public void playGameSound1()
    {
        gameSound1.play();
    }

    public void playBounce()
    {
        bounce.play();
    }

    public void playJump()
    {
        jump.play();
    }

    public void playMonster1()
    {
        monster1.play();
    }

    public void playMonster2()
    {
        monster2.play();
    }

    public void playMonster3()
    {
        monster3.play();
    }

    public void playPropeller()
    {
        propeller.play();
    }

    public void playRocket()
    {
        rocket.play();
    }

    public void playSpring()
    {
        spring.play();
    }

    public void playFalling()
    {
        falling.play();
    }

    public void playShot()
    {
        shot.play();
    }

    public void playHit()
    {
        hit.play();
    }

    public void stopPropeller() {
        propeller.stop();
    }

    public void stopRocket() {
        rocket.stop();
    }
}
