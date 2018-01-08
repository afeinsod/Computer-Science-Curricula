import re
def checkPW(password):
	valid = True
	if len(password)<8 or len(password)>16:
		valid=False
	if not re.search("[a-z]",password):
		valid=False
	if not re.search("[0-9]",password):
		valid=False
	if not re.search("[A-Z]",password):
		valid=False
	if not re.search("[$#@]",password):
		valid=False
	return valid
    
print "What's your password? "
password = str(raw_input())
if (checkPW(password)):
	print "Your password is valid!"
else:
	print "Your password is not valid."