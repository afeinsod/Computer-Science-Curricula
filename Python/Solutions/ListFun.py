import random

l1=[]
l1.append(1)
l1.append(3)
l1.append(5)
l1.append(7)
l1.append(9)
l1.append(11)
l1.append(13)
l1.append(15)
l1.append(17)
l1.append(19)

print l1[0]
print l1[1]
print l1[2]
print l1[3]
print l1[4]
print l1[5]
print l1[6]
print l1[7]
print l1[8]
print l1[9]

counter=0
l2=[]
while (counter<10):
	l2.append(1.25)
	print l2[counter]
	counter +=1

counter=0
l3=[]
while(counter<1000):
	l3.append(random.randint(1,1000))
	counter +=1

index=0
index2=0
index3=0
while(index3<50):
	line=""
	while(index2<20):
		line=line+ str(l3[index]) + " "
		index +=1
		index2+=1
	print line
	index2=0
	index3+=1