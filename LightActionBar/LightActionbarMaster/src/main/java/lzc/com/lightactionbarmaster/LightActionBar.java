package lzc.com.lightactionbarmaster;


import android.app.Activity;
import android.app.job.JobInfo;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.telephony.CellIdentityCdma;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;

import com.githang.statusbar.StatusBarCompat;


/**
 * Created by lzc on 2017/6/24.
 */

public class LightActionBar {
    public static final int DEFUALT_COLOR = 0;
    private ActionBar actionBar;
    private Context context;
    private String title;
    private TextView tvTitle;
    private int barColor = Color.WHITE;
    private FrameLayout frameLayout;
    public static final int IMG_BACK_KEYBOARD = R.drawable.ic_action_back_keyboard;
    public static final int IMG_BACK_ARROW = R.drawable.ic_action_back_arrow;
    public static final int IMG_BACK_APPS = R.drawable.ic_action_apps;
    public static final int IMG_BACK_SETTINGS = R.drawable.ic_action_settings;
    public static final int IMG_BACK_EXIT = R.drawable.ic_action_exit;
    public static final boolean COLOR_BAR_TEXT_WHITE = false;
    public static final boolean COLOR_BAR_TEXT_DARK = true;



    public LightActionBar(Context context){
        this.context = context;
        this.actionBar = ((AppCompatActivity)context).getSupportActionBar();
    }
    /**
     * 构造器
     * @return
     */
    public LightActionBar builder(){
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setCustomView(R.layout.light_action_bar);
        frameLayout = (FrameLayout)actionBar.getCustomView().findViewById(R.id.flRoot);
        tvTitle = (TextView)actionBar.getCustomView().findViewById(R.id.tvTitle);
        return this;
    }
    /**
     * 设置标题
     * @param title
     * @return
     */
    public LightActionBar setTitle(String title){
        tvTitle.setText(title);
        return this;
    }
    /**
     * 设置actionbar的颜色
     * @param color
     * @return
     */
    public LightActionBar setBarColor(int color,boolean barTextColor){
        this.barColor = color;
        StatusBarCompat.setStatusBarColor((Activity) context,color,barTextColor);
        return this;
    }
    /**
     * 设置标题文字颜色
     * @param color
     * @return
     */
    public LightActionBar setTitleColor(int color){
        tvTitle.setTextColor(color);
        return this;
    }
    /**
     * 设置默认参数
     */
    public void setParams(){
        title = context.getString(R.string.STRING_DEFAULT_TITLE);
        ColorDrawable drawable = new ColorDrawable(barColor);
        actionBar.setBackgroundDrawable(drawable);



    }
    /**
     * 设置左侧文字视图
     * @param textColor
     * @param text
     * @param viewOnclickListener
     * @return
     */
    public LightActionBar setLeftTextView(int textColor,String text,View.OnClickListener viewOnclickListener){

                TextView leftText = new TextView(context);
                leftText.setGravity(Gravity.LEFT);

                leftText.setText(text);
                leftText.setTextSize(20);
                FrameLayout.LayoutParams params=new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
                params.gravity=Gravity.LEFT|Gravity.CENTER;
                if(textColor==DEFUALT_COLOR){
                    leftText.setTextColor(Color.BLACK);
                }else{
                    leftText.setTextColor(textColor);
                }
                frameLayout.addView(leftText,params);
                leftText.setOnClickListener(viewOnclickListener);
        return this;
    }
    /**
     * 设置右侧文字视图
     * @param textColor
     * @param text
     * @param viewOnclickListener
     * @return
     */
    public LightActionBar setRightTextView(int textColor,String text,View.OnClickListener viewOnclickListener){
        TextView leftText = new TextView(context);
        leftText.setGravity(Gravity.RIGHT|Gravity.CENTER);
        leftText.setText(text);
        leftText.setTextSize(20);
        FrameLayout.LayoutParams params=new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        params.gravity=Gravity.RIGHT|Gravity.CENTER;
        if(textColor==DEFUALT_COLOR){
            leftText.setTextColor(Color.BLACK);
        }else{
            leftText.setTextColor(textColor);
        }
        frameLayout.addView(leftText,params);
        leftText.setOnClickListener(viewOnclickListener);
        return this;
    }

    /**
     * 设置左侧图片视图
     * @param img
     * @param imgViewColor
     * @param onClickListener
     * @return
     */
    public LightActionBar setLeftImgView(int img, int imgViewColor, View.OnClickListener onClickListener){
        ImageView imv = new ImageView(context);
        imv.setImageResource(img);
        if(imgViewColor==DEFUALT_COLOR)
            imv.setColorFilter(Color.BLACK);
        else
            imv.setColorFilter(imgViewColor);
        FrameLayout.LayoutParams params=new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        params.gravity=Gravity.LEFT|Gravity.CENTER;
        frameLayout.addView(imv,params);
        imv.setOnClickListener(onClickListener);
        return this;
    }
    /**
     * 设置右侧图片视图
     * @param img
     * @param imgViewColor
     * @param onClickListener
     * @return
     */
    public LightActionBar setRightImgView(int img, int imgViewColor, View.OnClickListener onClickListener){
        ImageView imv = new ImageView(context);
        imv.setImageResource(img);
        if(imgViewColor==DEFUALT_COLOR)
            imv.setColorFilter(Color.BLACK);
        else
            imv.setColorFilter(imgViewColor);
        FrameLayout.LayoutParams params=new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        params.gravity=Gravity.RIGHT|Gravity.CENTER;
        frameLayout.addView(imv,params);
        imv.setOnClickListener(onClickListener);
        return this;
    }
    /**
     * 构建
     */
    public void build(){
        setParams();
    }


}
