import random
l = ["acres","adult","advice","arrangement","attempt","august","autumn",
"border","breeze","brick","calm","canal","cast","chose","claws","coach","constantly",
"contrast","cookies","customs","damage","deeply","depth","discussion","doll",
"donkey","essential","exchange","exist","explanation","facing","film","finest","fireplace",
"floating","folks","fort","garage","grabbed","grandmother","habit","happily",
"heading","hunter","image","independent","instant","label","lungs","manufacturing",
"mathematics","melted","memory","mission","monkey","mountain","mysterious","neighborhood",
"nuts","occasionally","official","ourselves","palace","plates","poetry","policeman",
"positive","possibly","practical","pride","promised","recall","relationship","remarkable",
"require","rhyme","rocky","rubbed","rush","sale","satellites","satisfied"]
        
i = random.randint(0,len(l)-1)
word = l[i]
won = False;
maximum=15
guesses=0
letters= []
guessed = []
wrong = []
for c in word:
    letters.append(c)
while ((not(won)) & (guesses<=maximum)):
    print "You have " + str((maximum-guesses))+ " more guesses."
    sf=""
    for c in letters:
        if (c in guessed):
            sf=sf+c
        else:
            sf = sf+"-"
    print sf
    print ""
    wg=""
    for c in wrong:
        wg = wg +c + " "
    print "Wrong guesses: "+wg
    print ""
    print "What is your guess?"
    guess = raw_input()
    type(guess)
    if (guess in letters):
        print "Yes, you got a letter!"
        if (not(guess in guessed)):
            guessed.append(guess)
        sf=""
        for c in letters:
            if (c in guessed):
                sf=sf+c
            else:
                sf = sf+"-"
        if (sf==word):
            print "YOU GOT IT!"
            print word
            won=True
    else:
        print "Another guess down, bummer!"
        wrong.append(guess)
        print ""
        print ""
    guesses +=1