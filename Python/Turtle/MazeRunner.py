#--- import section---
import turtle as t
import random as r

#--- Game Configuration or Global Var ---
wn=t.Screen()
wallength=15
numberOfWalls=25
pathwidth=15
doorLength=pathwidth*2
timer=0
fontSetup=("Times New Roman",30,"normal")
interval=1000
game="in"
j=0

#---Initialize Objects or Turtles ---
mazeDrawer = t.Turtle()
mazeDrawer.pensize(5)
mazeDrawer.pencolor('blue')
mazeDrawer.speed(0)

mazeRunner = t.Turtle()
mazeRunner.color("red")
mazeRunner.penup()
mazeRunner.goto(-doorLength,doorLength)
mazeRunner.pendown()
mazeRunner.speed(10)

enemy = t.Turtle(shape="turtle")
enemy.color("black")
enemy.shapesize(.5)
enemy.penup()
enemy.goto(-50,0)
enemy.speed(1)

timekeeper=t.Turtle()
timekeeper.penup()
timekeeper.hideturtle()
timekeeper.goto(-70,220)
timekeeper.penup()
timekeeper.speed(0)

pauseButton=t.Turtle()
pauseButton.penup()
pauseButton.hideturtle()
pauseButton.goto(-250,220)
pauseButton.pendown()
pauseButton.write("Pause(pp)",font=fontSetup)

#functions
def updatetimer():
    #global is to let this function know to go look at a global var
    global timer
    global game
    timekeeper.clear()
    if game=="over":
        timekeeper.setposition(-250,220)
        pauseButton.clear()
        timekeeper.write(f"Game Over - {timer-1}secs",font=fontSetup)
    elif game=="on":
        timer+=1
        timekeeper.setposition(-50,220)
        timekeeper.write(f"Timer: {timer-1}",font=(fontSetup))
    elif game=="won":
        timekeeper.setposition(-250,220)
        pauseButton.clear()
        timekeeper.write(f"You won! - {timer-1}secs",font=fontSetup)
        mazeRunner.color("gray")
        wn.onkeypress(None,"Return")   #disabling the movement
        wn.onkeypress(restart,"Return")
        return        

#---Functions---
def drawDoor(pos):    #pos is the distance we need to travel before placing a door
    mazeDrawer.forward(pos)
    mazeDrawer.penup()
    mazeDrawer.forward(doorLength)
    mazeDrawer.pendown()
    
def drawBarrier(pos):
    mazeDrawer.forward(pos)
    mazeDrawer.left(90)
    mazeDrawer.fd(doorLength)
    mazeDrawer.backward(doorLength)
    mazeDrawer.right(90)

def drawMaze():
    wallength=15
    for w in range(numberOfWalls):
        wallength+=pathwidth
        if w<4:
            mazeDrawer.penup()
            mazeDrawer.left(90)
            mazeDrawer.forward(10)
        elif w>=4 and w<numberOfWalls-4:
            mazeDrawer.left(90)
            
            #where do we draw the doors and barriers inside of a wall length
            doorSpot=r.randint(doorLength,(wallength-doorLength))
            barrierSpot=r.randint(doorLength,(wallength-doorLength))
            
            #check to make sure a door and a barrier do not render on top of eachother
            while abs(doorSpot-barrierSpot)<pathwidth:
                doorSpot=r.randint(doorLength,(wallength-doorLength))
            
            #draw the wall
            #"randomly" assigning which object we draw first
            if(doorSpot<barrierSpot):
                drawDoor(doorSpot)
                drawBarrier(barrierSpot-doorSpot-doorLength)
                mazeDrawer.forward(wallength-barrierSpot)
            else:
                drawBarrier(barrierSpot) 
                drawDoor(doorSpot-barrierSpot)
                mazeDrawer.forward(wallength-doorSpot-doorLength)
        elif w>=numberOfWalls-4:
            mazeDrawer.left(90)
            mazeDrawer.forward(wallength)
        
    mazeDrawer.hideturtle()

def goUp():
    mazeRunner.setheading(90)
def goLeft():
    mazeRunner.setheading(180)
def goDown():
    mazeRunner.setheading(270)
def goRight():
    mazeRunner.setheading(0)
def go():
    global game
    global j
    global timer
    if game!= "pause" and game!="over" and game!="won":
        #pac man movement, so no going through walls
        game="on"
        mazeRunner.fd(1)
        enemyMove()
        if j%25==0:
          updatetimer() 
        j+=1
        #determine if it hits a wall
        canvas= wn.getcanvas()
        x,y=mazeRunner.pos()
        margin=1
        items=canvas.find_overlapping(x+margin,-y+margin,x-margin,-y-margin)  #building the hitbox

        #if the items variables has overlap
        if (len(items)>0):   #stack of what is overlapping
            canvasColor=canvas.itemcget(items[0],"fill")
            if canvasColor=="blue": #we know we hit a wall
                mazeRunner.color("gray")
                game="over"
                updatetimer()
                wn.onkeypress(None,"Return")   #disabling the movement
                pauseButton.clear()
                wn.onkeypress(restart,"Return")
                return                          #shortcut to stop the function
        if(abs(mazeRunner.xcor() - enemy.xcor()) < 5):
          if (abs(mazeRunner.ycor()-enemy.ycor()) < 5):
            mazeRunner.color("gray")
            game="over"
            updatetimer()
            wn.onkeypress(None,"Return")   #disabling the movement
            pauseButton.clear()
            wn.onkeypress(restart,"Return")
            return                     
        if mazeRunner.ycor()>210:
          game="won"
        wn.ontimer(go,15)
    elif game=="won":
        updatetimer()
        
        #wn.ontimer(updatetimer,interval)    
    
def enemyMove():
    enemy.setheading(enemy.towards(mazeRunner))
    enemy.forward(.5)
def restart():
      global game
      global timer
      timer=0
      game="on"
      updatetimer()
      pauseButton.write("Pause(p)",font=(fontSetup))
      mazeRunner.clear()
      enemy.clear()
      mazeRunner.penup()
      enemy.penup()
      mazeRunner.setposition(-20,20) 
      enemy.setposition(-50,0)
      mazeRunner.color("red")
      mazeRunner.pendown()
      go()

def pause():
  global i
  global game
  game="pause"
  if i%2 == 0:
    game="on"
    pauseButton.clear()
    pauseButton.write("Pause(p)",font=fontSetup)
    mainloop()
    i+=1
  else:
    game="pause"
    pauseButton.clear()
    pauseButton.write("Play(p)",font=fontSetup) 
    wn.onkeypress(None,"Return")    #Enter and Return are different
    wn.onkeypress(play,"p")
    i+=1
def play():
      global i
      global game
      game="on"
      pauseButton.clear()
      pauseButton.write("Pause(p)",font=fontSetup)
      i+=1
      wn.onkeypress(goUp,"w")
      wn.onkeypress(goLeft,"a")
      wn.onkeypress(goDown,"s")
      wn.onkeypress(goRight,"d") 
      go()  
      wn.onkeypress(pause,"p")
      wn.listen()

def  mainloop():
    wn.onkeypress(goUp,"w")
    wn.onkeypress(goLeft,"a")
    wn.onkeypress(goDown,"s")
    wn.onkeypress(goRight,"d") 
    wn.onkeypress(go,"Return")    #Enter and Return are different
    wn.onkeypress(pause,"p")
    wn.ontimer(updatetimer,interval)
    wn.listen()



#---Events---
#---Main Loop Or Game Loop Or Running Code
drawMaze()
mainloop()
wn.mainloop()
