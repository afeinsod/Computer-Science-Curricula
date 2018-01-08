x=3
y=4
a= x==y
b= x!=y
c= x>y
d= x<y
e= x>=y
f= x<=y
print x, "is equal to", y , ":", a
print x, "is not equal to", y , ":", b
print x, "is greater than", y , ":", c
print x, "is less than", y , ":", d
print x, "is greater than or equal to", y , ":", e
print x, "is less than or equal to", y , ":", f

s1="apple"
s2="zebra"
g= s1==s2
h= s1!=s2
i= s1>s2
j= s1<s2
k= s1>=s2
l= s1<=s2
print s1, "is equal to", s2 , ":", h
print s1, "is not equal to", s2 , ":", h
print s1, "is greater than", s2 , ":", i
print s1, "is less than", s2 , ":", j
print s1, "is greater than or equal to", s2 , ":", k
print s1, "is less than or equal to", s2 , ":", l

b1 = (x>y) & (s1>s2)
b2 = (x==y) | (s1!=s2)
b3 = not b2

print b1
print b2
print b3
