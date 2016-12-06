package object;

import android.content.res.Resources;
import android.graphics.Canvas;

/**
 * Created by a on 2016/12/6.
 */
public class EnemyFish extends GameObject{
    protected boolean isVisible;
    public EnemyFish(Resources resources){
        super(resources);
        initBitmap();
    }
    //初始化数据
    @Override
    public void initial(int arg0,float arg1,float arg2){

    }
    // 初始化图片资源
    @Override
    public void initBitmap() {
        // TODO Auto-generated method stub

    }
    // 对象的绘图函数
    @Override
    public void drawSelf(Canvas canvas) {
        // TODO Auto-generated method stub
        //判断敌机是否死亡状态

    }
    // 释放资源
    @Override
    public void release() {
        // TODO Auto-generated method stub

    }
    // 对象的逻辑函数
    @Override
    public void logic() {
        // TODO Auto-generated method stub
        if (object_y < screen_height) {
            object_y += speed;
        }
        else {
            isAlive = false;
        }
        if(object_y + object_height > 0){
            isVisible = true;
        }
        else{
            isVisible = false;
        }
    }

}
