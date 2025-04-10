## LTS
+ Java8 （2014 年 3 月）
+ Java11（2018 年 9 月）
+ Java17（2021 年 9 月）
+ Java21（2023 年 9 月）
+ Java24（2025 年 3 月）

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

+ 从 Java 12 到 Java 17 那些激动人心的新特性 : <https://mp.weixin.qq.com/s/C4ikbcS5KWLqPI-EJ6t7hg>
  - 1：封印类 sealed
  - 2：增强的空指针异常
  - 3：switch 表达式 (switch 表达式还新增了 yield 关键字)
  - 4：文本块
  - 5：record 类
  - 6：模式匹配 (在 instanceof 条件得到满足后消除不必要的类型转换)

### Java18
+ UTF-8 by Default
+ Simple Web Server
+ Code Snippets in Java API Documentation
+ Internet-Address Resolution SPI(给project loom做准备)
+ Deprecate Finalization for Removal

### Java19
+ Virtual Threads (Preview)
  - 虚拟线程应该是JDK19最重磅的特性，首次集成进来即为preview的API
    虚拟线程是由JDK提供的用户态线程，类似golang的goroutine，erlang的processes
    虚拟线程采用的是M:N的调度模式，即M数量的虚拟线程运行在N个Thread上，使用的是ForkJoinPool以FIFO模式来进行调度，N默认是为Runtime.availableProcessors()，可以通过jdk.virtualThreadScheduler.parallelism来修改
+ Structured Concurrency (Incubator)

### Java20
+ Scoped Values (Incubator)
  - 一种类似ThreadLocal的线程内/父子线程传递变量的更优方案

### Java21
+ String Templates (Preview)
+ Sequenced Collections (统一各类集合的顺序方法方法)
+ Generational ZGC
+ Unnamed Patterns and Variables (Preview)
+ Unnamed Classes and Instance Main Methods (Preview)
+ Prepare to Disallow the Dynamic Loading of Agents
  - 在 JDK 9 及更高版本中，可以通过-XX:-EnableDynamicAgentLoading禁止动态加载agent。
  - 在 JDK 21 中，允许动态加载agent，但 JVM 会在发生时发出警告

### Java22
+ Unnamed Variables & Patterns
+ Class-File API (Preview)
+ Launch Multi-File Source-Code Programs
+ String Templates (Second Preview)
+ Vector API (Seventh Incubator)
+ Stream Gatherers (Preview)
  - 针对stream引入了gather操作，允许用户自定义中间操作，比如自定义distinctBy操作

### Java23
+ Markdown Documentation Comments
  - java doc的注释目前已经支持html语法，本特性则支持使用markdown语法

### Java24
+ Class-File API
+ Stream Gatherers
+ Permanently Disable the Security Manager

---

## 个人总结Java8-21
+ 重点三个：模块系统、垃圾回收器G1、虚拟线程
+ 模块系统JPMS (Java9)
+ 垃圾回收器
  - G1（Java9正式）
  - ZGC(Java11实验性、Java15可用于生产、Java21支持分代回收)
  - Shenandoah(Java12实验性、Java15可用于生产、)
+ JDK8 及以前使用的是 PS Scavenge 和 PS MarkSweep，JDK9 及之后使用的是 G1 收集器
  - `java -XX:+PrintCommandLineFlags -version` 查看默认GC等参数
  - 直到Java21默认还是G1
  - Java24是第一个将默认垃圾回收器从G1 GC切换到ZGC的版本
+ Virtual Threads (Java19)

---

+ 使用 Spring Boot（3.2）和 Java 21 虚拟线程（Project Loom）的 GraalVM 原生镜像：<https://springdoc.cn/all-together-now-spring-boot-3-2-graalvm-native-images-java-21-and-virtual/>
  - 安装 GraalVM 和 Java 21