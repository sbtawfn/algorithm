package com.algorithm.practise.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 查找出现次数最多的IP.
 * https://www.lintcode.com/problem/highest-frequency-ip/description
 * @author lichangwei
 */
public class FindMostIp {

    /**
     * @param ipLines: ip  address
     * @return: return highestFrequency ip address
     */
    public static String highestFrequencyBySort(String[] ipLines) {
        // Write your code here
        String mostIP = null;
        int mostIPCount = 0;
        if (ipLines != null) {
            if (ipLines.length == 1) {
                return ipLines[0];
            }
            Arrays.sort(ipLines);
            int tmpCount = 0;
            String tmpIp = null;
            int len = ipLines.length;
            for (int i = 1; i < len; i++) {
                if (ipLines[i].equals(tmpIp=ipLines[i-1])) {
                    tmpCount++;
                    if (i == len-1) {
                        if (tmpCount > mostIPCount) {
                            mostIP = tmpIp;
                        }
                    }
                } else {
                    if (tmpCount > mostIPCount) {
                        mostIP = tmpIp;
                        mostIPCount = tmpCount;
                    }
                    tmpCount = 1;
                }
            }
        }
        return mostIP;
    }

    public static String highestFrequencyByMap(String[] ipLines) {
        // Write your code here
        Map<String, Integer> ipMap = new HashMap();
        String maxIP = null;
        int maxIPCount = 0;
        for (String ip : ipLines) {
            Integer c = ipMap.get(ip);
            if (c != null) {
                int n = c + 1;
                ipMap.put(ip, n);
                if (maxIPCount < n) {
                    maxIPCount = n;
                    maxIP = ip;
                }
            } else {
                ipMap.put(ip, 1);
            }
        }
        return maxIP;
    }

}
