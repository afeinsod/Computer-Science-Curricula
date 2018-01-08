import random
secretNum=random.randint(1,100)
guess=0
count = 0
print "I'm thinking of a number between 1 and 100. Make a guess!"
while (guess != secretNum):
    print "What's your guess?"
    guess = int(raw_input())
    if (guess<secretNum):
        print "Too low!"
    if (guess>secretNum):
        print "Too high!"
    count +=1
print "You got it! Great job!"
print "You took " + str(count) + " tries to guess my number."