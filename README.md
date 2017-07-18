# LightActionBar

## 1、setup
gradle user

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Step 2. Add the dependency
```gradle
	dependencies {
		compile 'com.github.User:Repo:Tag'
	}
```
That's it! 

## 2、usage
### for example:
```java
new LightActionbar(MainActivity.this).builder()
        .setTitile("title")
        .build();
```
And there are more methods to optimize the action bar.
### more method:
```java
   /**
     * constructor
     */
    public LightActionBar(Context context)
   /**
     * set title
     * @param title
     * @return LightActionBar
     */
    public LightActionBar setTitle(String title)
    /**
     * set color of actionbar
     * @param color
     * @return LightActionBar
     */
    public LightActionBar setBarColor(int color,boolean barTextColor)
    /**
     * set title color
     * @param color
     * @return LightActionBar
     */
    public LightActionBar setTitleColor(int color)
    
    /**
     * set left text view
     * @param textColor
     * @param text
     * @param viewOnclickListener
     * @return LightActionBar
     */
    public LightActionBar setLeftTextView(int textColor,String text,View.OnClickListener viewOnclickListener)
    /**
     * set right text view
     * @param textColor
     * @param text
     * @param viewOnclickListener
     * @return LightActionBar
     */
    public LightActionBar setRightTextView(int textColor,String text,View.OnClickListener viewOnclickListener)

    /**
     * set left image view
     * @param img
     * @param imgViewColor
     * @param onClickListener
     * @return LightActionBar
     */
    public LightActionBar setLeftImgView(int img, int imgViewColor, View.OnClickListener onClickListener)
    /**
     * set right image view
     * @param img
     * @param imgViewColor
     * @param onClickListener
     * @return LightActionBar
     */
    public LightActionBar setRightImgView(int img, int imgViewColor, View.OnClickListener onClickListener)
```

That's all!
