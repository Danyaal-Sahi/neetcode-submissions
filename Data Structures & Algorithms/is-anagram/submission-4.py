class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False
        dict1 = {}
        dict2 = {}
        iterator = 0 
        for s_let,t_let in zip(s,t):
            if s_let in dict1:
                dict1[s_let]+=1
            else:
                dict1[s_let] = 1

            if t_let in dict2:
                dict2[t_let]+=1
            else:
                dict2[t_let] = 1
        return dict1==dict2


