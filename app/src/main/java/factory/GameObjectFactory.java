package factory;

import android.content.res.Resources;

import object.GameObject;
import object.MyFish;

/**
 * Created by a on 2016/11/18.
 */
public class GameObjectFactory {
    //创建小型敌方鱼的方法
   /*  public GameObject creatSmallFish(Resources resources){
        return new SmallFish(resources);
    }
    //创建大型敌方鱼的方法
    public GameObject createBigFish(Resources resources){
        return new BigFish(resources);
    }
    //创建BOSS型鱼的方法
   public GameObject createBossFish(Resources resources){
        return new BossFish(resources);
    }   */
    //创建玩家鱼的方法
    public GameObject createMyFish(Resources resources){
        return new MyFish(resources);
    }
}
