package com.thread.arrange;

@FunctionalInterface()
public interface Error {
    /**
     * 线程异常时执行的方法
     */
    void error(Exception e);
}
