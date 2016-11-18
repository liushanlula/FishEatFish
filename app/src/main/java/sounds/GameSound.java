package sounds;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

import com.example.a.fisheatfish.MainActivity;
import com.example.a.fisheatfish.R;

import java.util.HashMap;

/**
 * Created by a on 2016/11/15.
 */
public class GameSound {
    private MainActivity mainActivity;
    private SoundPool soundPool;
    private HashMap<Integer,Integer> map;
    public GameSound(MainActivity mainActivity){
        this.mainActivity = mainActivity;
        map = new HashMap<Integer,Integer>();
        soundPool = new SoundPool(8, AudioManager.STREAM_MUSIC,0);
    }
    public void initGameSound(){
        map.put(1, soundPool.load(mainActivity, R.raw.eat_fish, 1));
        map.put(2, soundPool.load(mainActivity, R.raw.death, 1));
        map.put(3, soundPool.load(mainActivity, R.raw.playsound, 1));
    }
    //播放音效
    public void playSound(int sound,int loop){
        AudioManager am = (AudioManager)mainActivity.getSystemService(Context.AUDIO_SERVICE);
        float stramVolumeCurrent = am.getStreamVolume(AudioManager.STREAM_MUSIC);
        float stramMaxVolumeCurrent = am.getStreamVolume(AudioManager.STREAM_MUSIC);
        float volume = stramVolumeCurrent/stramMaxVolumeCurrent;
        soundPool.play(map.get(sound), volume, volume, 1, loop, 1.0f);
    }
}
