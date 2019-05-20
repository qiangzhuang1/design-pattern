package com.template;

/**
 * 模板模式会有一个或者多个未现实方法 ，
 * 而且这几个未实现方法有固定的执行循序
 * */
public abstract class CookingTemplate {
    final void  cooking(){
        //钩子方法
        if(check()){
            //刷锅
            this.brushPot();
        }
        //点火
        this.ignition();
        //热锅
        this.hotWok();
        //放油
        this.oilDrain();
        //下原料
        this.rawMaterial();
        //翻炒
        this.stirFry();
        //放调料
        this.putCondiment();
        //出锅
        this.outPot();
    }
    protected boolean check(){
        return false;
    }
    protected void brushPot(){
        System.out.println("刷锅");
    }
    protected void ignition(){
        System.out.println("点火");
    }
    protected void hotWok(){
        System.out.println("热锅");
    }
    protected abstract void oilDrain();

    protected abstract void rawMaterial();
    protected void stirFry(){
        System.out.println("翻炒");
    }
    protected abstract void putCondiment();
    protected void outPot(){
        System.out.println("出锅装盘吃菜");
    }
}
