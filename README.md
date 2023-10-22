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

### Java12
+ Shenandoah: A Low-Pause-Time Garbage Collector (Experimental)
+ ...

### Java13
+ ZGC: Uncommit Unused Memory
+ Switch Expressions (使用yield替换了break来避免歧义)
+ Text Blocks 

### Java14
+ Packaging Tool 
+ NUMA-Aware Memory Allocation for G1
+ JFR Event Streaming
+ Helpful NullPointerExceptions (更好地提示哪个地方出现的空指针)
+ Records 
+ Switch Expressions (Standard)
+ Remove the Concurrent Mark Sweep (CMS) Garbage Collector
+ ZGC on macOS、ZGC on Windows
+ Foreign-Memory Access API (Incubator)

### Java15
+ Sealed Classes (用于限定实现类，限定父类的使用)
+ ZGC: A Scalable Low-Latency Garbage Collector
+ Shenandoah: A Low-Pause-Time Garbage Collector

### Java16
+ Vector API (Incubator)
+ ZGC: Concurrent Thread-Stack Processing
+ Unix-Domain Socket Channels

### Java17
+ Enhanced Pseudo-Random Number Generators
+ Remove the Experimental AOT and JIT Compiler (后续要使用可以使用GraalVM)
+ Deprecate the Security Manager for Removal !!

---

## 个人总结Java8-21
+ 模块系统JPMS
+ 垃圾回收器
  - G1（Java9正式）
  - ZGC(Java11实验性、Java15可用于生产、)
  - Shenandoah(Java12实验性、Java15可用于生产、)
+ 