def sayHello():
	print "Hello, there! How are you today?"
	return

def tellJoke():
	print "Today someone knocked on my door and asked for a small donation towards the local swimming pool. I gave them a glass of water. "
	return

def addNums(n1, n2):
	return n1+n2

def highLow():
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

choice=0
print "1. Say Hello"
print "2. Tell a Joke"
print "3. Add 2 numbers together"
print "4. Play the High-Low Game"
print "What do you want to do? "
choice = int(raw_input())
print ""
if ( choice == 1 ):
	sayHello()
elif ( choice == 2 ):
	tellJoke()
elif ( choice == 3 ):
	print "What numbers do you want to add?"   
	print "First number:"
	num1 = float(raw_input())
	print "Second number:"
	num2 = float(raw_input())
	print "Sum = " + str(addNums(num1, num2))
elif ( choice == 4 ):
	highLow()
else:
	print "Sorry, that wasn't one of the choices."
print ""
print "Bye!"
