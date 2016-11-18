package com.example.a.fisheatfish;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import constant.ConstantUtil;
import sounds.GameSound;
import view.EndView;
import view.MainView;
import view.ReadyView;

public class MainActivity extends AppCompatActivity {
    private EndView endView;
    private MainView mainView;
    private ReadyView readyView;
    private GameSound sounds;
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == ConstantUtil.TO_MAIN_VIEW) {
                toMainView();
            } else if (msg.what == ConstantUtil.TO_END_VIEW) {
                toEndView(msg.arg1);
            } else if (msg.what == ConstantUtil.END_GAME){
                endGame();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        sounds = new GameSound(this);
        sounds.initGameSound();
        readyView = new ReadyView(this, sounds);
        setContentView(readyView);
    }
    //显示游戏的主界面
    public void toMainView(){
        if(mainView == null){
            mainView = new MainView(this,sounds);
        }
        setContentView(mainView);
        readyView = null;

        endView = null;
    }
   //显示游戏结束的界面
    public void toEndView(int score){
        if(endView ==null){
            endView = new EndView(this,sounds);
          //  endView.setScore(score);
        }
        setContentView(endView);
        mainView = null;
    }
    //游戏结束
    public void endGame(){
        if(readyView != null){
            readyView.setThreadFlag(false);
        }
        else if(mainView != null){
            mainView.setThreadFlag(false);
        }
        else if(endView != null){
            endView.setThreadFlag(false);
        }
        this.finish();
    }
    //getter 和setter方法
    public Handler getHandler(){
        return handler;
    }
    public void setHandler(Handler handler){
        this.handler = handler;
    }

}
