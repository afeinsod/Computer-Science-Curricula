import random
n = random.randint(1,5)
print "I'm thinking of a number between 1 and 5. What is it?" 
guess = int(raw_input())
if (guess==n):
    print "You got it!"
else:
    print "Nope! I was thinking of " + str(n) + "."
