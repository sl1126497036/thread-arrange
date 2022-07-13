package com.thread.arrange;

@FunctionalInterface()
public interface Callback<R> {
    /**
     * 回调方法
     * @param result action接口的返回值
     */
    void callback(R result);
}
