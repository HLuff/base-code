package com.example;

public class LoadClassExample {

    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
//        synchronized (getClassLoadingLock(name)) {
//            //检查该类是否已经加载过
//            Class c = findLoadedClass(name);
//            if (c == null) {
//                //如果该类没有加载，则进入该分支
//                long t0 = System.nanoTime();
//                try {
//                    if (parent != null) {
//                        //当父类的加载器不为空，则通过父类的loadClass来加载
//                        c = parent.loadClass(name, false);
//                    } else {
//                        //当父类的加载器为空，则调用启动类加载器来加载该类
//                        c = findBootstrapClassOrNull(name);
//                    }
//                } catch (ClassNotFoundException e) {
//                    //非空父类的类加载器无法找到相应的类，则抛出异常
//                }
//                if (c == null) {
//                    //当父类加载器无法加载时，则调用findClass方法来加载该类
//                    long t1 = System.nanoTime();
//                    //用户可通过覆写该方法，来自定义类加载器
//                    c = findClass(name);
//                    //用于统计类加载器相关的信息
//                    sun.misc.PerfCounter.getParentDelegationTime().addTime(t1 - t0);
//                    sun.misc.PerfCounter.getFindClassTime().addElapsedTimeFrom(t1);
//                    sun.misc.PerfCounter.getFindClasses().increment(
//                    );
//                }
//            }
//            if (resolve) {
//                //对类进行link操作
//                resolveClass(c);
//            }
//            return c;
//            }
        return null;
    }
}
