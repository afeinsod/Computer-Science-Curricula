for x in range(10):
	print "I love Python"

print ""

r = int(raw_input("What number do you want to count to? "))
count=""
for x in range(r+1):
	count=count+str(x)+" "
print count

l1=[]
l2=[]
for x in range(10):
	l1.append(x+1)
for x in l1:
	l2.append(x+2)
count=""
for x in l2:
	count+=str(x)+" "
print count
