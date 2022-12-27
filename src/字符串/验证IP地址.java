package src.字符串;

class Solution:
        def solve(self , IP: str) -> str:
        # write code herejavascript:void(0);
        if '.' in IP:
        for ip in IP.split('.'):
        if ip.isdigit() is False or ip=='' or ip[0]=='0' or int(ip)>255 or int(ip)<0 :
             return 'Neither'
        return 'IPv4'
        if ':' in IP:
        for ip in IP.split(':'):
        if  (len(ip)>1 and len(ip)==ip.count('0')) or ip=='':
        return 'Neither'
        return 'IPv6'