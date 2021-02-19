count_e = 0

#1.length of string
len = input()

s = input()
#2. count the number of 'e' character
for i in range(len(s)):
    if s.charAt(i) == 'e':
        count_e+=1

print(count_e)

'''
#3. Subtract the number of 'e' from the entire length
#and find out the number of '2'
int count_2 = len-count_e;

#4. compare the number of characters 'e' and '2'
if (count_e > count_2) System.out.println("e");
else if (count_e < count_2) System.out.println("2");
else if (count_e == count_2) System.out.println("yee");
'''