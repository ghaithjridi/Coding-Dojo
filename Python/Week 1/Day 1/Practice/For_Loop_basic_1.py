Basic - Print all integers from 0 to 150.

for i in range(0, 150+1):
    print(i)

Multiples of Five - Print all the multiples of 5 from 5 to 1,000
for i in range(5, 1001):
    if i % 5==0:
        print(i)

    #Counting, the Dojo Way - Print integers 1 to 100. If divisible by 5, print "Coding" instead. If divisible by 10, print "Coding Dojo".
for i in range(1, 101):
    if i % 10 == 0 :
        print('coding Dojo')
    elif i % 5 ==0 :
        print('coding') 
    else: print(i)
    Whoa. That Sucker's Huge - Add odd integers from 0 to 500,000, and print the final sum
sum=0
for i in range (0, 500001):
    if i % 2!= 0:
        sum+= i
print(sum)

for i in range(2018, 0, -4):
    print(i)

lowNum=2
highNum=8
mult=4
for i in range(lowNum, highNum):
    if i % mult==0:
        print(i)
