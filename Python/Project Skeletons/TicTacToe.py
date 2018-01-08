#fills up the board with blanks
board =[[' ' for x in range(3)] for y in range(3)] 


def displayBoard():
	
	print "  0  " + board[0][0] + "|" +board[0][1] + "|" + board[0][2]
	print "    --+-+--"
	print "  1  " + str(board[1][0]) + "|" + str(board[1][1]) + "|" + str(board[1][2])
	print "    --+-+--"
	print "  2  " + str(board[2][0]) + "|" + str(board[2][1]) + "|" + str(board[2][2])
	print "     0 1 2 "


displayBoard()