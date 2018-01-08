import random
dice1=0
dice2=1
while (dice1 != dice2):
    print "Want to roll the dice? Type yes or y."
    answer = str(raw_input())
    if ((answer!="yes") & (answer!="y")):
        break
    dice1 = random.randint(1,6)
    dice2 = random.randint(1,6)
    print "You rolled a " + str(dice1) + " and a " + str(dice2) + "!"
    if (dice1==dice2):
        print "Doubles! Yay!"