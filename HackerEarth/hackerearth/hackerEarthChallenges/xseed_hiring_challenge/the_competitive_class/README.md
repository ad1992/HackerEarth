#The Competitive Class#

Jiro is a fun loving lad. His classmates are very competitive and are striving for getting a good rank, while he loves seeing them fight for it. The results are going to be out soon. He is anxious to know what is the rank of each of his classmates.

Rank of i'th student = 1+ (Number of students having strictly greater marks than him. Students with equal marks are ranked same.)

Can you help Jiro figure out rank of all his classmates?

###Input:###
The first line contains an integers N, denoting the number of students in the class.  
The second line contains N space separated integers, Mi are the marks of the i'th student.  

###Output:###
Print N space separated integers i.e., ranks of the students in a new line.

###Constraints:###
1 ≤ N ≤ 1000  
1 ≤ Mi ≤ 1000  

###Sample Input###
```
4
62 96 82 55
```
###Sample Output###
```
3 1 2 4
```
