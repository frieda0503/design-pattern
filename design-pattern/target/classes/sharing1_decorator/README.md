# Without Decorator
 * 範例：一家麵店的販售清單，會去定義麵的名稱、價格、成本，當有新的品項上市，就必須新增子類別
 * 定義抽象類別，子類別繼承後實作方法
 * 缺點：類別過多
 * 違反開放-關閉原則，對擴增開放，對修改關閉

# Decorator
 * 動態的把責任附加到對象上，比繼承更有彈性
 * 把基底抽出來，配菜當做裝飾
 * 依賴繼承的話，行為會在compile的時候決定，如果不是來自父類別，就是子類別override的行為，否則需要新行為就得修改原有程式
 * 應該在run的時候動態組合
 * 裝飾者類可以是抽象 or 介面

 ![image](https://github.com/frieda0503/design-pattern/blob/develop/design-pattern/src/main/java/decorator_implement/decorator.png)
