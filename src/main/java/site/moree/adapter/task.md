# 说明
`Duck`类有`quack()`和`fly()`方法，`Turkey`类有`gobble()`和`fly()`方法，两者仅有细微差别，让`Turkey`能适配`Duck`

# 适配器模式
将一个类的接口，转换成客户期望的另一个接口。
Turkey --> TurkeyAdapter --> Duck

# 外观模式
对外提供统一的接口，封装内部的复杂实现；客户端只需要知道外部接口，符合`Least Knowledge`原则