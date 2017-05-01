# 说明
有一个遥控器，遥控器上有固定的按键（开和关），遥控器还有不同的插槽，插入不同插槽可以控制不同的设备。
有点类似以前玩的游戏机，换不同的游戏卡，可以玩不同的游戏（执行不同的任务），但手柄是一致的

# 定义
命令模式将命令（任务）封装成对象

# 联想
与此对应的是Java的`Executor`-`Runnable`机制，详细的分析可以看这篇
[Java中的命令模式——Thread，ThreadPoolExecutor和Runnable](http://blog.csdn.net/Zerohuan/article/details/50039005)

# 关键类
`SimpleControl`持有一个`Command`接口，可以随意切换命令