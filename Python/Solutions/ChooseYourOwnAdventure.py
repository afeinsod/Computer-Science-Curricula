print "There is a dragon guarding the castle. Do you 'fight' or 'walk' away?" #ROOM 1
response = str(raw_input())
if (response=="fight"): 
    print "You beat the dragon! You see a 'hallway' and a 'staircase'. Where do you go?" #ROOM 2
    response = str(raw_input())
    if (response=="hallway"):
        print "You walk through the hallway and see a banquet hall. Do you stop and 'eat' or go on to the 'throne' room?" #ROOM 3
        response = str(raw_input())
        if (response=="eat"):
            print"You eat yourself sick and then sleep it off on a table. Nice night!" #ROOM 4
        elif (response=="throne"):
            print "The queen says 'Off with your head!' and you die! Bummer."#ROOM 5
        else:
            print "Invalid option, please type one of the choices"
    elif (response=="staircase"):
        print "You go up the staircase and see a sphynx guarding a door, and another door unmarked. "
        print "Do you try to get past the 'sphynx' or go for the 'unmarked' door?"#ROOM 6
        response = str(raw_input())
        if (response=="sphynx"):
            print "You get past the sphynx and go into a room where you find a beautiful price. "
            print "You marry and live happily ever after. Mazel Tov!"#ROOM 7
        elif (response=="unmarked"):
            print "You walk through the unmarked door and fall to your death off an edge. Oops!"#ROOM 8
        else:
            print "Invalid option, please type one of the choices"
    else:
        print "Invalid option, please type one of the choices"
elif (response=="walk"):
    print "You find a drawbridge and you want to cross it. Do you ride your 'horse' across it"
    print "or 'crawl' across the bridge?"#ROOM 9
    response = str(raw_input())
    if (response=="horse"):
        print "You and your horse fall through the drawbridge into a pit of lava! "
        print "Do you 'push' your horse down to climb on a rock or try to 'swim' out?"#ROOM 10
        response = str(raw_input())
        if (response=="push"):
            print "You are mean to animals! You and the horse die in the lava." #ROOM 11
        elif (response=="swim"):
            print "You swim to a rock and climb out. You wait a very long time to be rescued..."#ROOM 12
        else:
            print "Invalid option, please type one of the choices"
    elif (response=="crawl"):
        print "You crawl over the drawbridge and find yourself facing a steep wall. Do you "
        print "try to 'climb' it or turn around and go 'back'?"#ROOM 13
        response = str(raw_input())
        if (response=="climb"):
            print "You climb up the wall and into a room full of jewels. You're rich!"#ROOM 14
        elif (response=="back"):
            print "You go home and go to bed. What a fun day!" #ROOM 15
        else:
            print "Invalid option, please type one of the choices"
    else:
        print "Invalid option, please type one of the choices"
else:
    print "Invalid option, please type one of the choices"
