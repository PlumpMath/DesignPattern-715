# 任务说明
获取到新的天气信息时，更新多个不同的布告板进行处理，布告板包括：显示目前状况、气象统计、天气预报等

# 不当的设计
写死的代码，直接使用到具体的类实例，不利于拓展，如下
``` java
public void measurementChanged() {
    currentConditionDisplay.update();
    statisticsDisplay.update();
    ...
}
```

# 模式定义
一对多依赖，即对象包含了多个订阅者，当对象状态变化时，包含的订阅者都会收到通知并自动更新
简单点说，保存了一个订阅者表，更新时通知表内所有订阅者

# 核心类
custom包中`WeatherData`保存了订阅者列表，可在适当时机调用订阅者的更新方法；
使用JDK自带的`Observer`和`Observable`的话，可以有推和拉两种模式可选