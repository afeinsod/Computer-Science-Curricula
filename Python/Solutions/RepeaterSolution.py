print "Type something, and I will repeat it for you: "
message = str(raw_input())
print "How many times should I repeat it? "
total = int(raw_input())
print "Here we go!"
count = 1
while (count <= total):
    print str(count) + ". " + message
    count +=1
