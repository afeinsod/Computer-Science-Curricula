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


print "Your score is " + str(rightAnswers) + " out of 1 question."

