package com.github.yoojia.zxing.camera;

/**
 * 自动聚焦回调接口
 * @author 陈小锅 (yoojia.chen@gmail.com)
 */
public interface FocusEventsListener {

    /**
     * 聚集完成时此接口被回调
     * @param focusSuccess 是否聚集成功
     */
    void onFocus(boolean focusSuccess);
}
