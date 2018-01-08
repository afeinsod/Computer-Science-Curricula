checkout=False
numHats=0
def addHat(numHats):
    numHats+=1
    print ""
    return numHats

def removeHat(numHats):
    if (numHats >= 1):
        numHats-=1
    else:
        print "There are no hats left to remove!"
        print ""
    return numHats

def viewOrder(numHats):
    print "You have " + str(numHats) + " hats in your cart."
    print ""
    return

def checkOut(numHats, checkout):
    checkout=True
    print "You bought " + str(numHats) + " hats! Thank you!"
    print ""
    return checkout


#MAIN
print "Welcome to the Hat Shop!"
while (checkout == False):
    print "What can I do for you?"
    print "Type 1 to add a hat to your order"
    print "Type 2 to remove a hat from your order"
    print "Type 3 to view your order"
    print "Type 4 to check out (quit)"
    choice = int(raw_input())
    if (choice == 1):
        numHats=addHat(numHats)
    elif (choice ==2):
        numHats=removeHat(numHats)
    elif (choice == 3):
        viewOrder(numHats)
    elif (choice ==4):
        checkout = checkOut(numHats, checkout)
    else:
        print "Invalid option!"
