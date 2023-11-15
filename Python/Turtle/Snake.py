#import
import turtle as t
import time
import random as r
#game config and globals
delay=0.1
bodyParts=[]
bodyParts2=[]
#object creation
wn=t.Screen()
wn.bgcolor("gray")
wn.setup(width=600,height=600)

head = t.Turtle(shape="square")
head.speed(0)
head.penup()
head.setposition(-15,0)
head.color("red")
head.direction="stop"

head2 = t.Turtle(shape="square")
head2.speed(0)
head2.penup()
head2.setposition(15,0)
head2.color("blue")
head2.direction="stop"

food=t.Turtle(shape="circle")
food.speed=(0)
food.shapesize(.5,.5)
food.color("red")
food.penup()
food.goto(100,100)

#functions
def up():
    #in maze runner we used setHeading
    if head.direction != "down":
        head.direction = "up"
def up2():
    #in maze runner we used setHeading
    if head2.direction != "down":
        head2.direction = "up"
def left():
    #in maze runner we used setHeading
    if head.direction != "right":
        head.direction = "left"
def left2():
    #in maze runner we used setHeading
    if head2.direction != "right":
        head2.direction = "left"
def right():
    #in maze runner we used setHeading
    if head.direction != "left":
        head.direction = "right"
def right2():
    #in maze runner we used setHeading
    if head2.direction != "left":
        head2.direction = "right"
def down():
    #in maze runner we used setHeading
    if head.direction != "up":
        head.direction = "down"
def down2():
    #in maze runner we used setHeading
    if head2.direction != "up":
        head2.direction = "down"
def move():
    if head.direction=="up":
        head.sety(head.ycor()+20)
    elif head.direction=="down":
        head.sety(head.ycor()-20)
    elif head.direction=="right":
        head.setx(head.xcor()+20)
    elif head.direction=="left":
        head.setx(head.xcor()-20)
def move2():
    if head2.direction=="up":
        head2.sety(head2.ycor()+20)
    elif head2.direction=="down":
        head2.sety(head2.ycor()-20)
    elif head2.direction=="right":
        head2.setx(head2.xcor()+20)
    elif head2.direction=="left":
        head2.setx(head2.xcor()-20)
def hideTheBodyPart():
    global bodyParts
    head.goto(-15,0)
    head.direction="stop"
    for eachPart in bodyParts:
        eachPart.goto(1000,1000)
    bodyParts=[]
def hideTheBodyPart2():
    global bodyParts2
    head2.goto(15,0)
    head2.direction="stop"
    for eachPart in bodyParts2:
        eachPart.goto(1000,1000)
    bodyParts2=[]
        
#events
wn.onkeypress(up,"w")
wn.onkeypress(left,"a")
wn.onkeypress(down,"s")
wn.onkeypress(right,"d")
wn.onkeypress(up2,"Up")
wn.onkeypress(left2,"Left")
wn.onkeypress(down2,"Down")
wn.onkeypress(right2,"Right")
wn.listen()

#mainloop
while True:
    wn.update()   #updates or refreshes the screen
    
    #TODO: Did we hit the boarder?
    if head.xcor()>290 or head.xcor()<-290 or head.ycor()>290 or head.ycor()<-290:     #returns the distance between the objects
        #food moves
        hideTheBodyPart()
    if head2.xcor()>290 or head2.xcor()<-290 or head2.ycor()>290 or head2.ycor()<-290:     #returns the distance between the objects
        #food moves
        hideTheBodyPart2()
    #TODO: Collide with the food
    if head.distance(food)<20:     #returns the distance between the objects
        #food moves
        food.goto(r.randint(-280,280),r.randint(-280,280))
        #grow a body part
        part = t.Turtle(shape="square")
        part.speed(0)
        part.penup()
        bodyParts.append(part)
    if head2.distance(food)<20:     #returns the distance between the objects
        #food moves
        food.goto(r.randint(-280,280),r.randint(-280,280))
        #grow a body part
        part2 = t.Turtle(shape="square")
        part2.speed(0)
        part2.penup()
        bodyParts2.append(part2)
    #TODO: Move the body Parts - follow the leader
    for i in range(len(bodyParts)-1,0,-1):
        x=bodyParts[i-1].xcor()
        y=bodyParts[i-1].ycor()
        bodyParts[i].goto(x,y)
    #Move the neck to the head
    if len(bodyParts)>0:
        x=head.xcor()
        y=head.ycor()
        bodyParts[0].goto(x,y)
    #TODO: Move the body Parts - follow the leader
    for i in range(len(bodyParts2)-1,0,-1):
        x=bodyParts2[i-1].xcor()
        y=bodyParts2[i-1].ycor()
        bodyParts2[i].goto(x,y)
    #Move the neck to the head
    if len(bodyParts2)>0:
        x=head2.xcor()
        y=head2.ycor()
        bodyParts2[0].goto(x,y)
    
    move()
    move2()
    #TODO: Did we hit ourselves
    for Part in bodyParts:
            if Part.distance(head)<10:
                hideTheBodyPart()
    for Part in bodyParts2:
            if Part.distance(head2)<10:
                hideTheBodyPart2()
    for part in bodyParts:
      for part2 in bodyParts2:
        if part.distance(part2)<10 or part.distance(head2)<10:
          hideTheBodyPart()
        elif part2.distance(part)<10 or part2.distance(head)<10:
          hideTheBodyPart2()
          
                
                
    time.sleep(delay)
