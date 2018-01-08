rightAnswers = 0

print "Here comes a quiz. No cheating!"

print "Question 1: What is the capital of California?"
print "\tA) San Francisco"
print "\tB) Sacramento"
print "\tC) Los Angeles"
print "\tD) San Jose"
answer1 = str(raw_input())
if answer1=="B": 
    print "That is correct!"
    rightAnswers+=1
else:
    print "Sorry, the captital is actually Sacramento!"

print "Question 2: What is the cube root of 125?"
print "\tA) 12"
print "\tB) 25"
print "\tC) 5"
print "\tD) 1000"
answer2 = str(raw_input())
if answer2=="C":
    print "That is correct!"
    rightAnswers+=1
else:
    print "Sorry, the cube root of 125 is 5."

print "Question 3: True or False (type T or F):"
print "\tWater consists of oxygen and hydrogen."
answer3 = str(raw_input())
if answer3=="T":
    print "That is correct!"
    rightAnswers+=1
else:
    print "Sorry, this is true!"

print "Question 4: True or False (type T or F):"
print "\tprint hello is a valid statement in Python."
answer4 = str(raw_input())
if answer4=="F":
    print "That is correct!"
    rightAnswers+=1
else:
    print "Sorry, that is false!"

print "Question 5: Where was Alexander Hamilton from?"
print "\tA) San Francisco"
print "\tB) New York City"
print "\tC) France"
print "\tD) West Indies"
answer5 = str(raw_input())
if answer5=="D":
    print "That is correct!"
    rightAnswers+=1
else:
    print "Sorry, he was born in the West Indies!"

print "Question 6: What year was the first Pride Parade?"
print "\tA) 1970"
print "\tB) 1993"
print "\tC) 1980"
print "\tD) 2001"
answer6 = str(raw_input())
if answer6=="A":
    print "That is correct!"
    rightAnswers+=1
else:
    print "Sorry, it was in 1970!"

print "Your score is " + str(rightAnswers) + " out of 6 questions."

