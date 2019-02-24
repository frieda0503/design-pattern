# Factory
 * 把製做pizza的方式在移回PizzaStore裡面
 * 將方法宣告為抽象
 * 讓子類別決定要實例化的是哪一個
 * 在編寫creator(PizzaStore)的時候，不需要知道實際做出哪個產品，使用哪一個子類別就決定了產品是什麼
 
# Difference between Simple Factory & Factory  
 * 簡單工廠是在store中使用的對象，不具備彈性，不能變更產品
 * 工廠是extends某一個class 