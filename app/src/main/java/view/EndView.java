package view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.SurfaceHolder;

import com.example.a.fisheatfish.MainActivity;

import sounds.GameSound;

/**
 * Created by a on 2016/11/18.
 */
public class EndView extends BaseView  {
    private int score;
    private float button_x;
    private float button_y;
    private float button_y2;
    private float strwid;
    private float strhei;
    private boolean isBtChange;				// 按钮图片改变的标记
    private boolean isBtChange2;
    private String startGame = "AGAIN!";	// 按钮的文字
    private String exitGame = "EXIT!";
    private Bitmap button;					// 按钮图片
    private Bitmap button2;					// 按钮图片
    private Bitmap background;				// 背景图片
    private Rect rect;     // 绘制文字的区域
    private MainActivity mainActivity;
    public EndView(Context context, GameSound sounds){
        super(context,sounds);
        this.mainActivity = (MainActivity)context;
        rect = new Rect();
        thread = new Thread(this);
    }
    // 视图改变的方法
    @Override
    public void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2, int arg3) {
        // TODO Auto-generated method stub
        super.surfaceChanged(arg0, arg1, arg2, arg3);
    }



}
