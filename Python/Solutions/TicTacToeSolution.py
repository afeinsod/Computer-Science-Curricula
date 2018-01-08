#fills up the board with blanks
board =[[' ' for x in range(3)] for y in range(3)] 


def displayBoard():
	
	print "  0  " + board[0][0] + "|" +board[0][1] + "|" + board[0][2]
	print "    --+-+--"
	print "  1  " + str(board[1][0]) + "|" + str(board[1][1]) + "|" + str(board[1][2])
	print "    --+-+--"
	print "  2  " + str(board[2][0]) + "|" + str(board[2][1]) + "|" + str(board[2][2])
	print "     0 1 2 "

def xTurn(r, c):
	board[r][c] = 'X'
        
def oTurn(r, c):
    board[r][c] = 'O'

def gameWon():
	win = False
	winner= ' '
	for r in range(3):
		if ((board[r][0] == board[r][1]) & (board[r][1] == board[r][2]) & (board[r][2] != ' ')):
			win = True
			winner=board[r][0]
	for c in range(3):
		if ((board[0][c] == board[1][c])  & (board[1][c] == board[2][c])& (board[2][c] != ' ')):
			win = True
			winner=board[0][c]
	if ((board[0][0] == board[1][1])  & (board[1][1] == board[2][2])& (board[2][2] != ' ')):
		win = True;
		winner=board[0][0]
	if ((board[0][2] == board[1][1])  & (board[1][1] == board[2][0])& (board[2][0] != ' ')):
		win = True;
		winner=board[0][2]
	if (win):
		print winner + " is the winner!"
	return win

def tieGame():
	tie=True
	for r in range(3):
		for c in range(3):
			if (board[r][c] == ' '):
				tie = False
	if (tie):
		print "It's a tie!"
	return tie
#
#
#
#MAIN GAME LOGIC
#
#
displayBoard()
XTurn=True
print "Welcome to Tic Tac Toe!"
while ((not(tieGame())) & (not(gameWon()))):
	if (XTurn):
		print "It's X's turn. Where do you want to go?"
		print "(Type 2 numbers 0-2, separated by a space. The first is the row, the second is the column)"
		input = str(raw_input())
		r = int(input[0:1])
		c = int(input[2:3])
		print r
		print c
		xTurn(r,c)
	else:
		print "It's O's turn. Where do you want to go?"
		print "(Type 2 numbers 0-2, separated by a space. The first is the row, the second is the column)"
		input = str(raw_input())
		r = int(input[0:1])
		c = int(input[2:3])
		oTurn(r,c)
	XTurn=not(XTurn)
	displayBoard()