# the | sign is the pipe -> will see this again
artBoard='''
     |    |    
----------------
     |    |    
----------------
     |    |    
'''

gameBoard=[[" "," "," "],[" "," "," "],[" "," "," "]]

def printBoard(board):
     for row in range(len(board)):
          for col in range(len(board[0])):
               if col!=2:
                    print(board[row][col],end="|")
               else:
                    print(board[row][col])
          if row!=2:
               print("-"*6)
          else:
               print("\n"*2)  #\n is a new line

#check if the spot is taken or not
def chooseSpot(row,column,symbol,board):
    #if the spot is open
    if board[row][column] == " ":
        #add the symbol and return true
        board[row][column]=symbol
        return True
    return False

def checkForWinner(board):
    #horizontal
    for r in range(len(board)):
        if (board[r][0]==board[r][1] and board[r][1]==board[r][2] and board[r][0]!=" "):
            print("Winner winner chicken dinner")
            printBoard(board)
            return True
    #vertical
    for c in range(len(board)):
        if (board[0][c]==board[1][c] and board[1][c]==board[2][c] and board[0][c]!=" "):
            print("Winner winner chicken dinner")
            printBoard(board)
            return True
    #diagonal
symbol="X"               
while (symbol!="Q"):
     printBoard(gameBoard)
     
     #a player's turn
     goodSpot=False
     while not goodSpot:
        #we need to also check the user inputs correct data -> no negs, no input,
        r=int(input("row:  "))-1
        c=int(input("col:  "))-1
        if r in range(3) and c in range(3):     #range does not include that #
            #choose spot will set the symbol and if spot is taken, returns false
            if(not chooseSpot(r,c,symbol,gameBoard)):
                print("Spot Taken")
            else:
                goodSpot=True   #this breaks the player's turn loop
                 
     #check for a winner -> if win set symbol to Q
     if checkForWinner(gameBoard):
         symbol="Q"
     
     #switch symbols for the next player
     if symbol=="X":
          symbol="O"
     elif symbol=="O":
          symbol="X"

