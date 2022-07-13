package com.thread.arrange;

@FunctionalInterface()
public interface Action<R> {
    /**
     * 需要执行的方法
     * @return
     */
    R action();
}
