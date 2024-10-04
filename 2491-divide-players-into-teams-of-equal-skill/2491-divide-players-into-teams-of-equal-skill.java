class Solution {
    public long dividePlayers(int[] skill) {
       Arrays.sort(skill);
        int n = skill.length;
        long totalSkill = skill[0] + skill[n - 1];
        long chemistry = 0;
        
        for (int i = 0; i < n / 2; i++) {
            if (skill[i] + skill[n - 1 - i] != totalSkill) {
                return -1;
            }
            chemistry += skill[i] * skill[n - 1 - i];
        }
        
        return chemistry; 
    }
}