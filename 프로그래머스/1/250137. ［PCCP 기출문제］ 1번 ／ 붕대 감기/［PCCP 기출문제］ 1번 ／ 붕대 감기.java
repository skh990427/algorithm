class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int usetime = bandage[0];
        int healSec = bandage[1];
        int plusHeal = bandage[2];
        
        int lastAttack = attacks[attacks.length-1][0];
        int attackCount = 0;
        int bandUsedTime = 0;
        for(int i = 1 ; i <= lastAttack ; i++) {
            if(attacks[attackCount][0] == i) {
                // 공격 당했을때
                // 연속성공시간 초기화, 피해량 체력까기, 공격횟수 증가, 체력 0보다 떨어지면 -1 리턴
                bandUsedTime = 0;
                answer -= attacks[attackCount++][1];
                if(answer <= 0) return -1;
                
            } else {
                // 공격 당하지 않았을때
                // 연속성공시간++, 체력 초당힐량증가, 연속성공시간 달성하면 플러스힐, 체력조정, 연속성공시간 초기화
                bandUsedTime++;
                answer += healSec;
                if(bandUsedTime == usetime) {
                    answer += plusHeal;
                    bandUsedTime = 0;
                }
                if(answer > health) answer = health;
            }
        }
        return answer;
    }
}