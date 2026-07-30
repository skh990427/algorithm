class Solution {
    public long solution(int price, int money, int count) {
        long sum = ((long) price + price * count) * count / 2;
        return money >= sum ? 0 : sum - money;
    }
}