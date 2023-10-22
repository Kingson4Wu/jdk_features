## LTS
+ Java8 （2014 年 3 月）
+ Java11（2018 年 9 月）
+ Java17（2021 年 9 月）
+ Java21（2023 年 9 月）

---

## Java各版本新特性
+ https://segmentfault.com/a/1190000016527932

### Java9
+ 模块系统JPMS(重磅)
+ G1成为默认垃圾回收器
+ Unified JVM/GC Logging
+ HTTP/2 Client(Incubator)
+ jshell: The Java Shell (Read-Eval-Print Loop)
+ Convenience Factory Methods for Collections
+ Process API Updates
+ Stack-Walking API
+ Variable Handles （java9废弃了sun.misc.Unsafe类，引入了VarHandle作为替代）
+ docker方面支持（ support for Docker CPU and memory limits）

### Java10
+ Local-Variable Type Inference(重磅)
+ APIs for Creating Unmodifiable Collections

### Java11
+ HTTP Client (Standard)(重磅)
+ Java Flight Recorder
+ ZGC: A Scalable Low-Latency Garbage Collector(Experimental)(重磅)

---

## 个人总结Java8-21
+ 模块系统JPMS
+ 垃圾回收器
  - G1（Java9正式）
  - ZGC(Java11实验性)
+ 