package com.android.netmusic.fragment.musicmenu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.netmusic.R;
import com.android.netmusic.activity.MainActivity;


/**
 * 排行榜
 * Created by Android on 2017/3/18.
 */

public class RankFragment extends Fragment {

    private MainActivity mMainActivity;
    private static RankFragment instance;
    /**
     * 单例
     * @param mainActivity
     * @return
     */
    public static RankFragment getInstance(MainActivity mainActivity){
        if(instance==null){
            instance = new RankFragment();
        }
        instance.setMainActivity(mainActivity);
        return instance;
    }

    /**
     * 得到主Activity的实例
     * @param mainActivity
     */
    public void setMainActivity(MainActivity mainActivity){
        this.mMainActivity = mainActivity;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_musicmenu_rank,null);
        return view;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////
    //以下是各组员添加代码,添加代码注明功能,自己的姓名                                              //
    //如果需要用到Layout中的资源，但是资源还没有命名id,请各位以下列格式命名，你的姓名_资源名称_资源功能 //
    //例：jiaomenglei_textview_username,姓名:jiaomenglei,资源名称:textview,功能:显示用户名username //
    //获取主Activity中的数据,直接调用mActivity                                                    //
    //PS，如非必须，请不要修改其他代码,如果非得修改，请注释原因                                      //
    //////////////////////////////////////////////////////////////////////////////////////////////

}