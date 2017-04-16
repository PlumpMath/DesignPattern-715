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