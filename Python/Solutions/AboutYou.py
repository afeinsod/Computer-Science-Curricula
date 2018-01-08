name = str(raw_input("What's your name? "))
print "Hi, " + name + "! How old are you? "
age = raw_input()
print str(age)+ ", huh? So what year were you born in? "
birth_year = raw_input()
birth_month = raw_input("What month? ")
print "What day of " + birth_month + "? "
birth_day = raw_input()
book = raw_input("What is your favorite book? ")
hometown = raw_input("What is your hometown? ")
num = raw_input("What is your lucky number? ")
shoe = raw_input("What is your shoe size? ")
excitement = raw_input("On a scale of 1 to 5, how excited are you to learn Python? ")
fact = raw_input("What is one cool fact about you? ")
      
print str(name)+ ", age "+ str(age)+ ", was born on "+str(birth_month)+ " "+ str(birth_day) +", "+str(birth_year)+" in "+ str(hometown) +"."
print str(name)+" has lucky number "+str(num)+", favorite book "+str(book)+", and a shoe size of "+str(shoe)+". "
print "On a scale of 1 to 5, " + str(name) + " is this excited to learn about Java: "+ str(excitement)+"! "
print "A fun fact about " + str(name) + " is: " + str(fact)

futureAge = int(age) + 5
golden = (int(age) == int(birth_day))
young = (int(birth_year)/2000 > 1)
random = double(shoe) * int(excitement)
      
print str(name) + " will be "+str(futureAge)+" in 5 years. "
print "Age is the same as birth day: ",golden
print "They were born in this century: ", young
print "Shoe size times excitement level is: ",random
